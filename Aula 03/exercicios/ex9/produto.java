package ex9;

public class produto {
    String nome;
    int preço;
    int quantidadeEstoque;


    public produto(String nome, int preço, int quantidadeEstoque){
        this.nome = nome;
        this.preço = preço;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public void aumentar(){
    System.out.println(quantidadeEstoque);
    quantidadeEstoque += 1;
    System.out.println("aumentou + 1" + nome + " no estoque");
    System.out.println(quantidadeEstoque);

    }

    public void diminuir() {
        System.out.println(quantidadeEstoque);
        quantidadeEstoque -= 1;
        System.out.println("diminiu - 1" + nome + " no estoque");
        System.out.println(quantidadeEstoque);

    }


}
