public class SumaMayoresA {

    public static int sumaMayoresA(int[] numeros, int x) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                suma += numeros[i];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 3, 7};
        int x = 6;
        int suma = sumaMayoresA(numeros, x);
        System.out.println("La suma de los números mayores a " + x + " en el arreglo es: " + suma);
       }
    }