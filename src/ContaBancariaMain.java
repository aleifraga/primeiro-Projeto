import br.com.alura.contabancaria.modelo.dados.ContaBancaria;

public class ContaBancariaMain {
    static void main() {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(320134);
        contaBancaria.titular = "Alei Fraga";

        contaBancaria.depositar(525.05);

        contaBancaria.exibeDados();

        contaBancaria.sacar(30);

        contaBancaria.exibeDados();
    }
}
