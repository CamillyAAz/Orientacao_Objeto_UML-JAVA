package ex11;

public class cidade {
    String nome;
    int população;
    String estado;




    public cidade(String nome, int população, String estado){
        this.nome = nome;
        this.população = população;
        this.estado =  estado;
    }




    public void aumentar(){
        System.out.println(população);
        população += 20000;
        System.out.println("aumentou" + nome + " na população");
        System.out.println(população);

    }

    public void diminuir() {
        System.out.println(população);
        população -= 300;
        System.out.println("diminiu" + nome + " na população");
        System.out.println(população);

    }






}
