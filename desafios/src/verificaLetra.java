import java.util.Scanner;

public class verificaLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String palavra = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char ch = palavra.charAt(i);
            if (ch == 'a' || ch == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

    }
}
