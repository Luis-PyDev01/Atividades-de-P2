import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Idade obrigátoria de votar");
        }
        else if (idade >= 16 && idade < 18)  {
            System.out.println("Idade opcional de votar");
        }
        else {
            System.out.println("Idade não permitida para votar");
        }
    }
}
        
