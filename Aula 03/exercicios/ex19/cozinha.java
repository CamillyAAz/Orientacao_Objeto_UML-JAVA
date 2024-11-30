public class cozinha {
    String tipo;
    String cor;
    int quantidadePessoas;


    public cozinha(String tipo, String cor, int quantidadePessoas) {
        this.tipo = tipo;
        this.cor = cor;
        this.quantidadePessoas = quantidadePessoas;
    }

    public void cozinhar(){
        System.out.println("Cozinhando o prato: " + tipo);
    }

    public void limpar(){
        System.out.println("Limpando o prato: " + tipo);
    }





}



