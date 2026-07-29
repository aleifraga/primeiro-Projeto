import java.util.Scanner;

public class Calcula {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            System.out.println("CALCULADORA");
            System.out.println("Escolha a operacão que deseja realizar:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracão");
            System.out.println("3 - Multiplicacão");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            int op = leitor.nextInt();

            if (op == 1) {
                System.out.println("Digite o 1o valor: ");
                int v1 = leitor.nextInt();
                System.out.println("Digite o 2o valor: ");
                int v2 = leitor.nextInt();
                System.out.println(v1 + v2);
            }
            if (op == 2) {
                System.out.println("Digite o 1o valor: ");
                int v1 = leitor.nextInt();
                System.out.println("Digite o 2o valor: ");
                int v2 = leitor.nextInt();
                System.out.println(v1 - v2);
            }
            if (op == 3) {
                System.out.println("Digite o 1o valor: ");
                int v1 = leitor.nextInt();
                System.out.println("Digite o 2o valor: ");
                int v2 = leitor.nextInt();
                System.out.println(v1 * v2);
            }
            if (op == 4) {
                System.out.println("Digite o 1o valor: ");
                int v1 = leitor.nextInt();
                System.out.println("Digite o 2o valor: ");
                int v2 = leitor.nextInt();
                System.out.println(v1 / v2);
            }
            if (op == 5) {
                return;
            }else {
                i = 1;
            }
        }

    }
}
