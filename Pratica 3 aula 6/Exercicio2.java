import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o seu nome:");
        String palavra1 = scanner.next();
        System.out.println("digite o seu nome:");
        String palavra2 = scanner.next();
        boolean a = palavra1.equalsIgnoreCase(palavra2);
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
