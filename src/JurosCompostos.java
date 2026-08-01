import java.util.Scanner;
public class JurosCompostos {
    public void main() {
        Scanner input = new Scanner(System.in);

        double juros = 0;
        double valorInicial = 0;
        double aporte = 0;
        int periodoMensal = 0;
        int periodoAnual = 0;

        double totalAporte = 0;
        double totalJuros = 0;
        double totalValor = 0;
        double rentabilidadeAtual;

        System.out.print("Taxa de juros (anual): ");
        juros = input.nextDouble();

        System.out.print("Valor inicial: ");
        valorInicial = input.nextDouble();

        System.out.print("Aporte (mensal): ");
        aporte = input.nextDouble();

        System.out.print("Periodo (anual): ");
        periodoAnual = input.nextInt();


        juros = (juros / 12) / 100;
        periodoMensal = periodoAnual * 12;
        totalValor = valorInicial;

        for (int mes = 1; mes <= periodoMensal; mes++){
            totalValor = totalValor * (1 + juros);

            totalValor = totalValor + aporte;

        }

        rentabilidadeAtual = (totalValor * (1 + juros)) - totalValor;

        totalAporte = valorInicial + (aporte * periodoMensal);
        totalJuros = totalValor - totalAporte;

        System.out.print("\n--- RESULTADO FINAL ---");
        System.out.printf("\nTotal investido do bolso: R$ %,.2f%n", totalAporte);
        System.out.printf("Total ganho em juros: R$ %,.2f%n", totalJuros);
        System.out.printf("Valor total acumulado: R$%,.2f%n", totalValor);
        System.out.printf("Ultima rentabilidade: R$%,.2f%n" , rentabilidadeAtual);
        input.close();

    }
}