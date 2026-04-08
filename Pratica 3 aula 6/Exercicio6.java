import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite uma frase:");
    String x = scanner.nextLine();
    System.out.println("digite uma palavra:");
    String y = scanner.next();
    int i = x.indexOf(y);
    System.out.println(i);
    }
}
