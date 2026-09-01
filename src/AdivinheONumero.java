import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
    static void main() {
        Scanner input = new Scanner(System.in);
        int numero = 0;


        System.out.println("Tente adivinhar o numero premiado entre 0 e 100: (VOCÊ TEM 5 TENTATIVAS)");
        int numeroAleatorio = new Random().nextInt(100);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d° Tentativa: ", i);
            numero = input.nextInt();

            if (numero < 0 || numero > 100) {
                System.out.println("Vovê digitou um numero INVALIDO!");
            } else if (numero < numeroAleatorio) {
                System.out.println("Você digitou um numero MENOR!");
            } else if (numero > numeroAleatorio) {
                System.out.println("Você digitou um numero MAIOR!");
            }else if (numero == numeroAleatorio) {
                System.out.printf("VOCÊ ACERTOU!! É o numero %d", numeroAleatorio);
                break;
            }
        }
        if (numero != numeroAleatorio) {
            System.out.printf("Você errou!! O número premiado é o %d", numeroAleatorio);
        }

    }
}
