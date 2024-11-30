public class livrodigital {
    String titulo;
    String autor;
    int tamanhoArquivo;


    public livrodigital(String titulo, String autor, int tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }


    public void abrir(){
        System.out.println("Abrindo o livro: "+ titulo);
    }

    public void fechando(){

        System.out.println("Fechando o livro: " + titulo);
    }


}
