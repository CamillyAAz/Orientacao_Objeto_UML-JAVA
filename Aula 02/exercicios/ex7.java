import java.util.Scanner;

public class ex7 {

    public static void somar(int a, int b) {

        int calcular = a + b;
        System.out.println("" + calcular);

    }

    public static void main(String[] args) {

        Scanner numeo = new Scanner(System.in);

        System.out.println("Digite um número:");
        int a = numeo.nextInt();
        System.out.println("Digite um número");
        int b = numeo.nextInt();

        somar(a,b);


    }


}