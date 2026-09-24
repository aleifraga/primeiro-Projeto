package br.com.alura.produto.modelos.dados;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public void aplicaDesconto(double percentual){
        if (percentual <= 100 && percentual >= 0){
            this.preco = preco - (preco * (percentual/100));
        }else{
            System.out.println("ERRO: voce digitou uma porcentagem invalida.");
        }
        }




    }



