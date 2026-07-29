import java.util.Scanner;

public class CambioDolar {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dolarPreco = 4.94;
        double dolar;
        double real;

        System.out.printf("\nDe quantos dolare voce precisa? U$");
        dolar = teclado.nextDouble();
        real = dolar * dolarPreco;
        System.out.printf("Voce deve pagar em Real: R$ %.2f%n", real);


    }
}
