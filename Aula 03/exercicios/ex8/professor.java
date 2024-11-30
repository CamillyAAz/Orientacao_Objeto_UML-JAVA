package ex8;

public class professor {
    String nome;
    int matricula;
    String curso;
    int nota;


    public professor(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void aula() {
        System.out.println(nome + " Está dando aula de" + curso);
    }




    public void corrigir(int nota) {
        this.nota = nota;
        System.out.println("O " + nome + " Está corrigindo sua prova, agurde...\n\n\n");
        System.out.println("CALCULANDO");
        System.out.println("CALCULANDO");
        System.out.println("CALCULANDO");
        System.out.println("CALCULANDO");
        if(nota>=5 && nota<= 10){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }


}