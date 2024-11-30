package ex1;

public class Livro {

    String titulo;
    String autor;
    int numeroDePaginas;
    int paginaAtual;


    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrir() {
        if (paginaAtual == 0) {
            paginaAtual = 1;
            System.out.println("O livro foi aberto na página 1.");
        }
    }

    public void lerPagina() {
        if (paginaAtual > 0 && paginaAtual <= numeroDePaginas) {
            System.out.println("Lendo a página " + paginaAtual + " do livro: " + titulo + " de " + autor + ".");
            paginaAtual++;
        }
    }
}
