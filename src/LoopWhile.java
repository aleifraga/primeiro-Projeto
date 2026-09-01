import java.util.Scanner;

public class LoopWhile {
    static void main() {
        Scanner input = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int numeroDeNotas = 0;

        while (nota != -1) {
            System.out.print("Digite a nota: ");
            nota = input.nextDouble();

            if (nota != -1) {
                media += nota;
                numeroDeNotas++;
            }
        }

        System.out.println("A media é: " + media/numeroDeNotas);
    }
}
