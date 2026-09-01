import java.util.Scanner;

public class Banco {
    static void main() {
        Scanner input = new Scanner(System.in);
        String nome = "Alei Eduardo P. Fraga";
        String tipoConta = "Corrente";
        double saldo = 1599.15;
        int operacao = 0;
        double deposito = 0;
        double transferir = 0;

        System.out.println("\n-------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("-------------------------------");

        while (operacao != 4) {
            System.out.println("\n-------------------------------");
            System.out.println("    Operações");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - sair");
            System.out.println("\nOpção: ");
            operacao = input.nextInt();
            System.out.println("-------------------------------");

            if (operacao == 1){
                System.out.printf("Saldo : %.2f%n", saldo);

            } else if (operacao == 2) {
                System.out.println("Deposito: ");
                deposito = input.nextDouble();
                saldo = saldo +deposito;

            } else if (operacao == 3) {
                System.out.println("Transferir: ");
                transferir = input.nextDouble();
                if (transferir > saldo){
                    System.out.println("Erro: saldo insuficiente");
                }else{
                    saldo = saldo - transferir;
                }
            } else if (operacao == 4) {
                break;
            } else {
                System.out.println("Operacao invalida");
            }

        }



    }
}
