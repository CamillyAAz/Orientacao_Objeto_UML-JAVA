package ex14;
import java.util.Scanner;

public class jogo {
    String nome;
    String genero;
    int preco;
    int escolha;



    public jogo(String nome, String genero, int preco){
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }




    public void escolher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha entre 1 começar o jogo / 2 parar o jogo");
        int escolha = scanner.nextInt();


        switch(escolha){
            case 1:
                start();
                break;
            case 2:
                pause();
                break;

        }
    }





    public void start(){

        System.out.println("Começando o jogo " + nome);
    }

    public void pause(){


        System.out.println("Pausando o jogo " + nome);
    }


}


