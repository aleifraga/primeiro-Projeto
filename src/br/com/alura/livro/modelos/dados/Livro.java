package br.com.alura.livro.modelos.dados;

public class Livro {
    private String titulo;
    private String autor;

    // Getter do título
    public String getTitulo() {
        return titulo;
    }

    // Setter do título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter do autor
    public String getAutor() {
        return autor;
    }

    // Setter do autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Exibe os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
