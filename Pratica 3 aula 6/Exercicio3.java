import  java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva uma palavra:");
        String palavra = scanner.next();
        System.out.println("a quantida de de caracteres é:" + palavra.length());
    }
}
