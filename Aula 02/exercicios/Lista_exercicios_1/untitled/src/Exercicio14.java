import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Bem-vindo à calculadora\nDigite:\n1 Para Soma\n2 Para Subtração\n3 Para Divisão\n4 Para Multiplicação\n");
        int resposta = scanner.nextInt();

        if (resposta < 1 || resposta > 4) {
            System.out.printf("Opção inválida. Por favor, escolha um número entre 1 e 4.\n");
            scanner.close();
            return;
        }

        System.out.printf("Digite o primeiro número: \n");
        double numero1 = scanner.nextDouble();

        System.out.printf("Digite o segundo número: \n");
        double numero2 = scanner.nextDouble();

        double resultado;

        switch (resposta) {
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 3:
                if (numero2 == 0) {
                    System.out.printf("Erro: Divisão por zero não é permitida.\n");
                } else {
                    resultado = numero1 / numero2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                }
                break;
            case 4:
                resultado = numero1 * numero2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
        }

        scanner.close();
    }
}
