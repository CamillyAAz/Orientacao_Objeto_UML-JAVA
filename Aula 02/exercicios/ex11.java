import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(palavraInvertida)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }

        scanner.close();
    }
}
