public class Cachorro {
    private String nome;
    private String raca;
    private int idade;


    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }


    public void latir(){
        System.out.println("O cachorro " + nome + " da raça " + raca + " está latindo");


    }



    public void correr(){
        System.out.println("O cachorro " + nome + " da raça " + raca + " está correndo");


    }


}
