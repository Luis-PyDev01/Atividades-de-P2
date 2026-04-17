import java.util.Scanner;
public class Exercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = sc.nextLine();

        do {
            System.out.println("Digite a senha:");
            senha = sc.nextLine();

            if (senha.equals("1234")) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Acesso negado");
            }
        } while (!senha.equals("1234"));
    }
}