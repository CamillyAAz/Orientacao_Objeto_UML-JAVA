import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Bem vindo à calculadora\nDigite:\n-1 Para Soma\n-2 Para Subtração\n-3 Para Divisão\n-4 Para Multiplicação\n");
        int resposta = scanner.nextInt();

        System.out.printf("Digite o primeiro número: \n");
        double numero1 = scanner.nextDouble();

        System.out.printf("Digite o segundo número: \n");
        double numero2 = scanner.nextDouble();

        double resultado;

        switch (resposta){
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 3:
                resultado = numero1 / numero2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 4:
                resultado = numero1 * numero2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
        }

        scanner.close();
    }
}
