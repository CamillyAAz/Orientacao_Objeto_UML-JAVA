package ex8;

public class testeprofessor {
    public static void main(String[] args){
        professor meuProfessor = new professor("Jhoni", 20234555, "Engenharia de Software");

        int nota = 7;

        meuProfessor.aula();
        meuProfessor.corrigir(nota);


    }
}
