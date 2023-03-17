import java.util.Arrays;
import java.util.Scanner;

//este codigo sirve para responder ala pregunta n°2

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresar número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Introducir orden (asc/desc): ");

        String order = scanner.next();
        Arrays.sort(numbers);
        if (order.equals("desc")) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        } else if (order.equals("asc")) {
            for (int number : numbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("el parametro pedido no es valido, por favor ingrese 'asc' o 'desc' ");
        }
    }

    }


