package ex13;

public class time {
    String nome;
    String tecnico;
    int numeroDeJogadores;


    public time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }




    public void adicionando(){

        System.out.println("Adicionando jogadres ao time" + nome);
        numeroDeJogadores += 1000;
        System.out.println(numeroDeJogadores);
    }




    public void remover(){

        System.out.println("Adicionando jogadres ao time" + nome);
        numeroDeJogadores -= 200;
        System.out.println(numeroDeJogadores);
    }





}