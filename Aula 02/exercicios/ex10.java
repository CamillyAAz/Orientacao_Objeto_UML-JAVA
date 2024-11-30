import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número não é primo.");
        } else {
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }

    }
}
