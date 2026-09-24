import br.com.alura.livro.modelos.dados.Livro;

public class LivroMain {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J. R. R. Tolkien");

        livro.exibirDetalhes();
    }
}
