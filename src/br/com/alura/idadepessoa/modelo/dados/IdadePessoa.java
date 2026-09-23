package br.com.alura.idadepessoa.modelo.dados;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }


    public void verificarIdade() {
        if (idade >= 18 && idade < 120) {
            System.out.println("É maior de idade");
        } else if (idade <= 17 && idade > 0) {
            System.out.println("É menor de idade");
        } else {
            System.out.println("Você digitou um valor invalido");
        }
    }










}
