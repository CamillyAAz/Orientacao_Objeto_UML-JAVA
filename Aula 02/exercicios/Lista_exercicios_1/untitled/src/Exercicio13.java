import java.util.Random;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa;
        int contagemTentativas = 0;

        System.out.printf("Bem-vindo ao jogo de adivinhação!\n");
        System.out.printf("Tente adivinhar o número entre 1 e 100.\n");

        do {
            System.out.printf("Digite seu palpite: ");

            while (!scanner.hasNextInt()) {
                System.out.printf("Por favor, insira um número inteiro válido.\n");
                scanner.next(); // Limpa a entrada inválida
                System.out.printf("Digite seu palpite: ");
            }

            tentativa = scanner.nextInt();

            if (tentativa < 1 || tentativa > 100) {
                System.out.printf("O palpite deve estar entre 1 e 100. Tente novamente.\n");
                continue; // Pular o restante do loop e pedir um novo palpite
            }

            contagemTentativas++;

            if (tentativa < numeroAleatorio) {
                System.out.printf("Muito baixo!\n");
            } else if (tentativa > numeroAleatorio) {
                System.out.printf("Muito alto!\n");
            } else {
                System.out.printf("Parabéns! Você acertou.\nTentativas: %d\n", contagemTentativas);
            }
        } while (tentativa != numeroAleatorio);

        scanner.close();
    }
}
