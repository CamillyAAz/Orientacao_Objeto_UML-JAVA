package ex12;

public class filme {
    String titulo;
    String diretor;
    int duração;


    public filme(String titulo, String diretor, int duração){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duração =  duração;
    }

    public void inicar(){
        System.out.println("iniciando o filme" + titulo);
    }
    public void parando(){
        System.out.println("parando o filme" + titulo);
    }




}



