package br.com.alura.produto.modelos.dados;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(){
        this.nome = nome;
    }
    public void setPreco(){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public void aplicaDesconto(int percentual){
        if (percentual <= 100 && percentual >= 0){
            this.preco = preco - (preco * (percentual/100));
        }else{
            System.out.println("ERRO: voce digitou uma porcentagem invalida.");
        }
        }




    }



