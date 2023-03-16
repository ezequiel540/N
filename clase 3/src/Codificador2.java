public class Codificador2 {

    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz ";

    public static String codificar(String mensaje, int desplazamiento) {
        StringBuilder mensajeCodificado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            int indiceLetra = ABECEDARIO.indexOf(letra);
            if (indiceLetra == -1) { // Si la letra no está en el abecedario, la dejamos igual
                mensajeCodificado.append(letra);
            } else {
                int indiceLetraCodificada = (indiceLetra + desplazamiento) % ABECEDARIO.length();
                char letraCodificada = ABECEDARIO.charAt(indiceLetraCodificada);
                mensajeCodificado.append(letraCodificada);
            }
        }
        return mensajeCodificado.toString();
    }

    public static String decodificar(String mensajeCodificado, int desplazamiento) {
        StringBuilder mensajeDecodificado = new StringBuilder();
        for (int i = 0; i < mensajeCodificado.length(); i++) {
            char letraCodificada = mensajeCodificado.charAt(i);
            int indiceLetraCodificada = ABECEDARIO.indexOf(letraCodificada);
            if (indiceLetraCodificada == -1) { // Si la letra no está en el abecedario, la dejamos igual
                mensajeDecodificado.append(letraCodificada);
            } else {
                int indiceLetra = (indiceLetraCodificada - desplazamiento + ABECEDARIO.length()) % ABECEDARIO.length();
                char letra = ABECEDARIO.charAt(indiceLetra);
                mensajeDecodificado.append(letra);
            }
        }
        return mensajeDecodificado.toString();
    }

    public static void main(String[] args) {
        String mensaje = "Todo bien";
        int desplazamiento = 1;

        String mensajeCodificado = codificar(mensaje, desplazamiento);
        System.out.println("Mensaje codificado con desplazamiento " + desplazamiento + ": " + mensajeCodificado);

        String mensajeDecodificado = decodificar(mensajeCodificado, desplazamiento);
        System.out.println("Mensaje decodificado con desplazamiento " + desplazamiento + ": " + mensajeDecodificado);
    }
}
