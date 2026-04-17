import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de combustivel");
        String combustivel = sc.nextLine();
        System.out.println("Digite a quantidade de combustivel");
        double quantidade = sc.nextDouble();

        if (quantidade >20){
            if (combustivel.equalsIgnoreCase("gasolina")){
                double valor = quantidade * 6.00;
                double desconto = quantidade * 0.06;
                double valorFinal = valor - desconto;
                System.out.println("Valor final a pagar  " + valorFinal);
            } else if (combustivel.equalsIgnoreCase("alcool")){
                double valor = quantidade * 4.50;
                double desconto = valor * 0.05;
                double valorFinal = valor - desconto;
                System.out.println("Valor a pagar: " + valorFinal);
            }
            else {
                System.out.println("Tipo de combustivel invalido");
            }
        }
      