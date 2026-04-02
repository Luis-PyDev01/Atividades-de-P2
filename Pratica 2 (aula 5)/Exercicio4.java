import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precoLitro, valorDisponivel, litros;


        System.out.print("Digite o preço do litro do combustível: ");
        precoLitro = scanner.nextDouble();

        System.out.print("Digite o valor que você possui: ");
        valorDisponivel = scanner.nextDouble();


        litros = valorDisponivel / precoLitro;


        System.out.printf("Você pode comprar %.2f litros de combustível.%n", litros);

        scanner.close();
    }
}