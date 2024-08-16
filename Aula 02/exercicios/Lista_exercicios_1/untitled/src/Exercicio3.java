
import java.util.Scanner;
public class Exercicio3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.printf("Digite o número 1: \n");
            double numero1 = scanner.nextDouble();

            System.out.printf("Digite o número 2: \n");
            double numero2 = scanner.nextDouble();

            double soma = numero1 + numero2;
            double subtracao = numero1 - numero2;
            double multiplicacao = numero1 * numero2;
            double divisao = 0;

            if (numero2 != 0) {
                divisao = numero1 / numero2;
            } else {
                System.out.printf("Divisão: Não é possível dividir por zero.\n");
            }

            System.out.printf("Soma: %.2f\n", soma);
            System.out.printf("Subtração: %.2f\n", subtracao);
            System.out.printf("Multiplicação: %.2f\n", multiplicacao);
            if (numero2 != 0) {
                System.out.printf("Divisão: %.2f\n", divisao);
            }

            scanner.close();
        }