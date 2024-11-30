package ex1;

public class TesteLivro {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Coração de tinta", "Cornelia Funke", 10);

        meuLivro.abrir();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
    }
}
