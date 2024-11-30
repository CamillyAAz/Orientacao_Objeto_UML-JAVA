import java.util.Scanner;
import java.util.Random;

public class ex13 {

    public static void main(String[] args){


            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int numeroAleatorio = random.nextInt(100) + 1;
            int palpite = 0;



            while (palpite != numeroAleatorio) {
                System.out.print("Digite seu numéro: ");
                palpite = scanner.nextInt();

                if (palpite < numeroAleatorio) {
                    System.out.println("Muito baixo.");
                } else if (palpite > numeroAleatorio) {
                    System.out.println("Muito alto.");
                } else {
                    System.out.println("Você acertou o número ");
                }
            }




    }

}
