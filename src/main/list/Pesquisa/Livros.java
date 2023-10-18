package main.list.Pesquisa;

public class Livros {
    private String autor;
    private int anoPublicacao;
    private String titulo;

    public Livros(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

