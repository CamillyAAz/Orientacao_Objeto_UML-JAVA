import java.util.Scanner;


public class ex15 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Converter de Celsius para Fahrenheit");
        System.out.println("2: Converter de Fahrenheit para Celsius");
        System.out.print("Escolha a opção desejada: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}

const adolfo =
        {

        }
