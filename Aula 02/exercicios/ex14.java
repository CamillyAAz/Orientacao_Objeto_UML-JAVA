import java.util.Scanner;

public class ex14 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorialIterativo = 1;
        for (int i = 1; i <= numero; i++) {
            fatorialIterativo *= i;
        }


        int fatorialRecursivo = fatorial(numero);

        System.out.println("Fatorial de " + numero + " (iterativo): " + fatorialIterativo);
        System.out.println("Fatorial de " + numero + " (recursivo): " + fatorialRecursivo);

        scanner.close();
    }


    //até o demonio tem medo de metodos recursivos
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }




    }

}
