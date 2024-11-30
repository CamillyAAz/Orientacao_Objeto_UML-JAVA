package ex6;

public class computador {
    String processador;
    int memoria;
    int armazenamento;
    boolean ligado;


public computador(String processador, int memoria, int armazenamento) {
    this.processador = processador;
    this.memoria = memoria;
    this.ligado = false;
    this.armazenamento = armazenamento;
}

public void ligar() {
    if(!ligado) {
        ligado = true;
        System.out.println("O computador com o processador" + processador + "de memoria" + memoria + "de armazenamento" + armazenamento + "Está ligado");
    }
}


public void desligado() {
    if(ligado) {
        ligado = false;
        System.out.println("O computador com o processador" + processador + "de memoria" + memoria + "de armazenamento" + armazenamento + "Está desligado");
    }
}












}
