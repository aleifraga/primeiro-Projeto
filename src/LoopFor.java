import java.util.Scanner;

public class LoopFor {
    static void main() {

        Scanner input = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota: ");
            nota = input.nextDouble();
            media += nota;
        }

        System.out.println("A media é: " + media/3);
    }
}
