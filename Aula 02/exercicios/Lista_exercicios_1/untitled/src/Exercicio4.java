import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número inteiro: \n");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.printf("É um número par.\n");
        } else {
            System.out.printf("É um número ímpar.\n");
        }

        scanner.close();
    }

}
