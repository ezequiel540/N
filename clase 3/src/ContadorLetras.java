public class ContadorLetras {

    public static int contarLetra(String palabra, char letra)
    {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String palabra = "tengosueño!";
        char letra = 'o';
        int cantidad = contarLetra(palabra, letra);
        System.out.println("La letra '" + letra + "' aparece " + cantidad + " veces en la palabra '" + palabra + "'");
    }
}
