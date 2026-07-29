public class DescontoProduto {
    static void main(String[] args) {
        double precoOriginal = 280.90;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;

        System.out.println("\nValor original do produto: R$" + precoOriginal);
        System.out.printf("Percentual de desconto: %.2f", percentualDesconto);
        System.out.println("\nValor final: R$ " + valorDesconto);

    }
}
