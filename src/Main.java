public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 20;
        boolean mostrarPares = true;
        while (a <= b) {
            if (mostrarPares && a % 2 == 0) {
                System.out.println(a);
            } else if (!mostrarPares && a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}