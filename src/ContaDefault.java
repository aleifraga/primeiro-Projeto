//Default (Package-private)
//O modificador de acesso default é aquele que não especifica nenhum modificador de acesso. Quando nenhum modificador
// de acesso é especificado, a classe, atributo ou método pode ser acessado apenas pelas classes que estão no mesmo
//  pacote. Por exemplo: ContaDefaultPrincipal

package br.com.alura.conta;

public class ContaDefault {

    double saldo;

    void sacar(double valor) {
        // lógica de saque...
    }
}


//No código anterior, a classe Conta está em um pacote e a classe Principal em outro (DEIXEI NO MESMO, SÓ PARA
// EXEMPLIFICAR) pacote distinto. A classe Conta pode ser instanciada dentro da classe Principal, pois ela possui o
// modificador de acesso public, entretanto, o atributo saldo e o método sacar tem o modificador default e, portanto,
//  não podem ser acessados de dentro da classe Principal, o que vai causar um erro de compilação no código anterior.
