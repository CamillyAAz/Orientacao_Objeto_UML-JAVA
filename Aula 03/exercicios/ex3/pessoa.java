package ex3;

public class pessoa {

    String nome;
    int idade;
    double altura;


    public pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
    }
}