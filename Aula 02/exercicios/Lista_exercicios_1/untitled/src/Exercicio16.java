import java.util.Scanner;
public class Exercicio16 {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite 1 para converter Celsius para Fahrenheit e 2 para converter Fahrenheit para Celsius: ");

        while (!scanner.hasNextInt()) {
            System.out.printf("Entrada inválida. Por favor, digite 1 ou 2.\n");
            scanner.next();
            System.out.printf("Digite 1 para converter Celsius para Fahrenheit e 2 para converter Fahrenheit para Celsius: ");
        }

        int resposta = scanner.nextInt();

        switch(resposta) {
            case 1:
                System.out.printf("Digite a temperatura em Celsius: ");

                while (!scanner.hasNextDouble()) {
                    System.out.printf("Entrada inválida. Por favor, digite um número válido.\n");
                    scanner.next();
                    System.out.printf("Digite a temperatura em Celsius: ");
                }

                double celsius = scanner.nextDouble();
                System.out.printf("Temperatura em Fahrenheit: %.2f\n", celsiusParaFahrenheit(celsius));
                break;
            case 2:
                System.out.printf("Digite a temperatura em Fahrenheit: ");

                while (!scanner.hasNextDouble()) {
                    System.out.printf("Entrada inválida. Por favor, digite um número válido.\n");
                    scanner.next(); // Limpa a entrada inválida
                    System.out.printf("Digite a temperatura em Fahrenheit: ");
                }

                double fahrenheit = scanner.nextDouble();
                System.out.printf("Temperatura em Celsius: %.2f\n", fahrenheitParaCelsius(fahrenheit));
                break;
            default:
                System.out.printf("Opção inválida. Por favor, escolha 1 ou 2.\n");
                break;
        }

        scanner.close();
    }
}
