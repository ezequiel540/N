public class OrdenarNumeros {

    public static int[] ordenarNumeros(int a, int b, int c, boolean ascendente) {
        int[] numeros = {a, b, c};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (ascendente) {
                    if (numeros[i] > numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                } else {
                    if (numeros[i] < numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        int a = 5, b = 2, c = 7;
        boolean ascendente = true;
        int[] numerosOrdenados = ordenarNumeros(a, b, c, ascendente);
        String orden = ascendente ? "ascendente" : "descendente";
        System.out.println("Los números " + a + ", " + b + ", " + c + " ordenados de forma " + orden + " son:");
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.print(numerosOrdenados[i] + " ");
        }
    }
}

