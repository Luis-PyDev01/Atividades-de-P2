import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double valorUnitario, total, totalFinal, desconto;
        int quantidade;
        System.out.print("digite o valor unitario do produto:");
        valorUnitario = valor.nextDouble();
        System.out.print("digite a quantidade do produto:");
        quantidade = valor.nextInt();
        total = valorUnitario*quantidade;
        if(total > 100){
            desconto = total*0.08;
            totalFinal = total - desconto;
        }else{
            totalFinal = total;
        }
        System.out.println("o valor total da compra e:"+ total);
        System.out.println("o valor total da compra com o desconto aplicado e:"+ totalFinal);
        valor.close();
    }
}
