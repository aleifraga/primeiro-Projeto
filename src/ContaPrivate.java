//Private
//O modificador de acesso private é o mais restritivo de todos. Uma classe, atributo ou método declarado como private
// só pode ser acessado dentro da própria classe. Ou seja, ele possui visibilidade restrita e não pode ser utilizado
// por outras classes. Por exemplo: ContaPrivatePrincipal

public class ContaPrivate {

    private double saldo;

    private void sacar(double valor) {
        // lógica de saque...
    }
}

//No código anterior, vai ocorrer erro de compilação na classe Principal, pois o atributo saldo e o método sacar foram
// declarados como private, não podendo com isso serem acessados de fora da própria classe Conta.Existe ainda um último
// modificador de acesso, que é o protected, mas falaremos dele mais adiante no curso, após ser apresentado o conceito
// de herança de classes.