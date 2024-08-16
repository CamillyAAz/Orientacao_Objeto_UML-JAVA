import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu nome: \n");
        String nome = scanner.nextLine();

        System.out.printf("Digite sua idade: \n");
        int idade = scanner.nextInt();

        System.out.printf("Nome: %s\nIdade: %d", nome, idade);
    }
}
