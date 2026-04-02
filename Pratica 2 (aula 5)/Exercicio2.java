import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);
        System.out.println("digite a sua idade:");
        int idade = valor.nextInt();
         if(idade >= 16){
            System.out.println("Pode votar!");
         }else{
             System.out.println("Nao pode votar!");
         }
    }
}
