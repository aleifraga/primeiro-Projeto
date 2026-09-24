import br.com.alura.produto.modelos.dados.Produto;

public class ProdutoMain {
    static void main() {
        Produto produto = new Produto();

        produto.setNome("camiseta");
        produto.setPreco(59.90);

        System.out.println("A " + produto.getNome() + " tem o preço de R$" + produto.getPreco());
        produto.aplicaDesconto(20);
        System.out.println("Com desconto, fica: R$" + produto.getPreco());
    }
}
