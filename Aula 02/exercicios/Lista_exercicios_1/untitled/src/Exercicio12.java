import java.util.Arrays;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.printf("Digite 5 números inteiros:\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Número %d: ", (i + 1));
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        Arrays.sort(numeros);

        System.out.printf("Números em ordem crescente:\n");
        for (int numero : numeros) {
            System.out.printf("%d\n", numero);
        }
    }
}
