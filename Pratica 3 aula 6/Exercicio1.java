import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite o seu nome:");
            String nome1 = scanner.next();
            System.out.println("digite o seu nome:");
            String nome2 = scanner.next();
            boolean a = nome1.equals(nome2);
            if(a == true){
                a = true;
                System.out.println(a);
                System.out.println("sao iguais!");
            }else{
                a = false;
                System.out.println(a);
                System.out.println("sao diferentes!");
            }
    }
}
