package br.com.alura.contabancaria.modelo.dados;

public class ContaBancaria {
    private int numeroConta;
    private double saldo = 0;
    public String titular;

    public int getNumeroConta(){
        return numeroConta;
    }

    //////////////////////

    public void setNumeroConta (int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void depositar (double valor){
        this.saldo += valor;
    }

    public void sacar (double valor){
        if (valor <= 0){
            System.out.println("ERRO: Valor deve ser maior que zero.");
        } else if (valor > this.saldo) {
            System.out.println("ERRO: Saldo insuficiente.");
        }else{
            this.saldo -= valor;
            System.out.printf("\nSaque de R$ %.2f", valor, " realizado com sucesso.");
        }
    }

    public void exibeDados (){
        System.out.println("\n\n-------------------------------------");
        System.out.println("TITULAR: " + titular);
        System.out.println("CONTA: " + numeroConta);
        System.out.printf("SALDO: %.2f", saldo);
        System.out.println("\n-------------------------------------");
    }

}
