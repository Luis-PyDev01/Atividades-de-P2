import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);
        System.out.println("digite um numeor inteiro:");
        int num1 = valor.nextInt(); // se num1 = 2
        System.out.println("o dobro do numero e:"+ num1*2); // saida = 4
        System.out.println("o triplo do numero e:"+ num1*3); // saida = 6

    }
}
