import java.util.Scanner;


public class ex8 {

    public static void main(String[] args){

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = dados.nextLine();
        System.out.println("Digite sua idade:");
        int idade = dados.nextInt();

        System.out.println("" + nome);
        System.out.println("" + idade);



    }
}
