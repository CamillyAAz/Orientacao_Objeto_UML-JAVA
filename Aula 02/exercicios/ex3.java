import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {


    Scanner numeros = new Scanner(System.in);

    System.out.println("Escreva um numero");
    int x = numeros.nextInt();
    System.out.println("Escreva um numero");
    int y = numeros.nextInt();

    int somar = x + y;
    int subtrair = x - y;
    int multiplicar = x * y;
    int dividir = x / y;

    System.out.println("Soma = " + somar);
    System.out.println("Subtração = " + subtrair);
    System.out.println("Multiplicação = " + multiplicar);
    System.out.println("Divisão = " + dividir);

    }
}
