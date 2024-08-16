import java.util.Scanner;
public class Exercicio10 {
    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número para verificar se é primo: \n");
        int numero = scanner.nextInt();

        if (primo(numero)) {
            System.out.printf("%d é primo\n", numero);
        } else {
            System.out.printf("%d não é primo\n", numero);
        }

        scanner.close();
    }
}