import java.util.Scanner;
public class DiaSemana {
    static void main() {
        Scanner input = new Scanner(System.in);
        int dia = 0;
        String nomeDia;

        System.out.println("Digite um número de um dia da semana: ");
        dia = input.nextInt();

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;

            case 2:
                nomeDia = "Segunda-feira";
                break;

            case 3:
                nomeDia = "Terça-feira";
                break;

            case 4:
                nomeDia = "Quarta-feira";
                break;

            case 5:
                nomeDia = "Quinta-feira";
                break;

            case 6:
                nomeDia = "Sexta-ferira";
                break;

            case 7:
                nomeDia = "Sábado";
                break;

            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);

    }
}
