import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int numero1 = Integer.parseInt(scanner.nextLine().trim());

                System.out.print("Digite o segundo número inteiro: ");
                int numero2 = Integer.parseInt(scanner.nextLine().trim());

                int resultado = numero1 / numero2;

                System.out.println("Resultado da divisão: " + resultado);
                sucesso = true;

            } catch (NumberFormatException e) {
                System.out.println("Erro: por favor, digite apenas números inteiros válidos.");
                System.out.println("Vamos tentar novamente.\n");

            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero.");
                System.out.println("Vamos tentar novamente.\n");
            }
        }

        scanner.close();
    }
}
