package br.com.alura.aluno.modelos.dados;

public class Aluno {
    private String nome;
    private double[] notas;

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter das notas
    public double[] getNotas() {
        return notas;
    }

    // Setter das notas
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Calcula a média
    public double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
