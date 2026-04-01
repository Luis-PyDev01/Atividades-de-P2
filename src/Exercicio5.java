import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorIngresso = 40.0;
        double valorFinal;
        char tipo;

        // Entrada de dados
        System.out.print("Digite o tipo de ingresso (I para inteira e M para meia): ");
        tipo = scanner.next().toUpperCase().charAt(0);

        // Verificação do tipo de ingresso
        if (tipo == 'M') {
            valorFinal = valorIngresso * 0.5;
        } else {
            valorFinal = valorIngresso;
        }

        // Saída de dados
        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}