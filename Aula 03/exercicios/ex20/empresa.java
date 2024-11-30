package ex20;

public class empresa {
    String nome;
    int cnpj;
    int numeroFuncionarios;



public empresa(String nome, int cnpj, int numeroFuncionarios){
    this.nome = nome;
    this.cnpj = cnpj;
    this.numeroFuncionarios = numeroFuncionarios;
}


public void contratar(){
    System.out.println("Adicionando o funcionario " + nome);
}

public void demitir(){
    System.out.println("Removendo o funcionário" + nome);
}





}