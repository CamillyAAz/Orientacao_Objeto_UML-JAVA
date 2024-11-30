import java.util.Scanner;

public class ex4 {

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um número:");
        int x = numero.nextInt();

        if(x % 3 == 0){
            System.out.println("Seu número é impar");
        } else {
            System.out.print("Seu número é par");
        }



    }
}
