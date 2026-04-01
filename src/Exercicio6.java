import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double taxa, valor1, valor2, total;
        int codigo1, codigo2, quant1, quant2;

        // Entrada de dados
        System.out.print("Digite a taxa de serviço em porcentagem(apenas o numero): ");
        taxa = scanner.nextDouble();

        System.out.print("Digite o código do produto 1: ");
        codigo1 = scanner.nextInt();
        System.out.print("Digite o valor unitário do produto 1: ");
        valor1 = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto 1: ");
        quant1 = scanner.nextInt();

        System.out.print("Digite o código do produto 2: ");
        codigo2 = scanner.nextInt();
        System.out.print("Digite o valor unitário do produto 2: ");
        valor2 = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto 2: ");
        quant2 = scanner.nextInt();

        // Cálculo do total com taxa
        total = (valor1 * quant1 + valor2 * quant2) * (taxa / 100 + 1);

        // Saída
        System.out.printf("Valor total da compra com taxa: R$ %.2f%n", total);
    }
}