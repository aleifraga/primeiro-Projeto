import br.com.alura.aluno.modelos.dados.Aluno;

public class AlunoMain {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Alei Fraga");

        double[] notas = {8.0, 7.5, 9.0};
        aluno.setNotas(notas);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
    }
}
