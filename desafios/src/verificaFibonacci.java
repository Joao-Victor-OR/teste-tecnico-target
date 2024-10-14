import java.util.Scanner;

public class verificaFibonacci {

    public static boolean ehFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1, fibonacci = 1;
        while (fibonacci < num) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        return fibonacci == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (ehFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}