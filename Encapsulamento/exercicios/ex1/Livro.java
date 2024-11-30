public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas= 0;


    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void lerPagina() {
        if(numeroDePaginas > 0) {
            System.out.println("Você está lendo a pagina " + numeroDePaginas + " do livro " + titulo );
        } else {
            System.out.println("Você está não está lendo nenhuma pagina do livro " + titulo );
        }
    }







}
