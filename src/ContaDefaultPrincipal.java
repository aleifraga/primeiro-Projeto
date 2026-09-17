package br.com.alura.testes;

import br.com.alura.conta.ContaDefault;

public class ContaDefaultPrincipal {

    public static void main(String[] args) {
        ContaDefault c1 = new ContaDefault();
        c1.saldo = 300;
        c1.sacar(100);
    }

}