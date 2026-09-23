import br.com.alura.idadepessoa.modelo.dados.IdadePessoa;

public class IdadePessoaMain {
    static void main() {
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Alei Fraga");
        idadePessoa.setIdade(25);

        System.out.println("O " + idadePessoa.getNome() + " Tem " + idadePessoa.getIdade() + " anos de idade");
        idadePessoa.verificarIdade();
    }
}
