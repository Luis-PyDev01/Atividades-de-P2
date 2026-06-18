import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Testes ===");
        System.out.println("1 - Testar divisão de inteiros");
        System.out.println("2 - Testar sistema de login");
        System.out.print("Escolha uma opção: ");
        String opcao = scanner.nextLine().trim();

        switch (opcao) {
            case "1":
                testarDivisao(scanner);
                break;
            case "2":
                testarLogin(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    // ===== Exercício 1: Divisão de inteiros =====
    private static void testarDivisao(Scanner scanner) {
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número inteiro (dividendo): ");
                int numero1 = Integer.parseInt(scanner.nextLine().trim());

                System.out.print("Digite o segundo número inteiro (divisor): ");
                int numero2 = Integer.parseInt(scanner.nextLine().trim());

                int resultado = numero1 / numero2;

                System.out.println("Resultado da divisão: " + resultado);
                sucesso = true;

            } catch (NumberFormatException e) {
                System.out.println("Erro: por favor, digite apenas números inteiros válidos.");
                System.out.println("Vamos tentar novamente.\n");

            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero.");
                System.out.println("Vamos tentar novamente.\n");
            }
        }
    }

    // ===== Exercício 2: Sistema de login =====
    private static void testarLogin(Scanner scanner) {
        SistemaLogin sistema = new SistemaLogin();

        System.out.print("Digite o login: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            sistema.fazerLogin(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println("Acesso Negado: Credenciais incorretas");
        }
    }
}

// ===== Classes auxiliares (não podem ser "public" pois já existe Main público no arquivo) =====

class SistemaLogin {

    private String senhaSecreta;

    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (!senha.equals(senhaSecreta)) {
            throw new LoginInvalidoException("Senha incorreta para o usuário: " + usuario);
        }
        System.out.println("Login realizado com sucesso! Bem-vindo, " + usuario + ".");
    }
}

class LoginInvalidoException extends Exception {

    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}