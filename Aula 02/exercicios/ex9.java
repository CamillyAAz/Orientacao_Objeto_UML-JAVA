import java.util.Scanner;


public class ex9 {

    public static void main(String[] args){

        Scanner escolha = new Scanner(System.in);

        Scanner numero = new Scanner(System.in);

        int calcular;

        System.out.println("Escolha sua operação (somar, subtrair, multiplicar ou dividir) 1-2-3-4");
        int x = escolha.nextInt();

        switch(x){

            case 1:
                System.out.println("Escreva um número");
                int a = numero.nextInt();
                System.out.println("Escreva um número");
                int b = numero.nextInt();
                calcular = a + b;
                System.out.println("" + calcular);
                break;
            case 2:
                System.out.println("Escreva um número");
                int c = numero.nextInt();
                System.out.println("Escreva um número");
                int d = numero.nextInt();
                calcular = c - d;
                System.out.println("" + calcular);
                break;
            case 3:
                System.out.println("Escreva um número");
                int e = numero.nextInt();
                System.out.println("Escreva um número");
                int f = numero.nextInt();
                calcular = e * f;
                System.out.println("" + calcular);
                break;
            case 4:
                System.out.println("Escreva um número");
                int g = numero.nextInt();
                System.out.println("Escreva um número");
                int h = numero.nextInt();
                calcular = g / h;
                System.out.println("" + calcular);
                break;






        }






    }

}
