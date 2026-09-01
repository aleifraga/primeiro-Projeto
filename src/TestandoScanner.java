import java.util.Scanner;

public class TestandoScanner {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu filme favorito: ");
        String filme = input.nextLine();
        System.out.print("Ano de lançamento: ");
        int ano = input.nextInt();
        System.out.print("Digite a sua nota para o filme: ");
        double avaliacao = input.nextDouble();

        System.out.println(filme + "\n" + ano + "\n" + avaliacao);

        input.close();

    }
}
