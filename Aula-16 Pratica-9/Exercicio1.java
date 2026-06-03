import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> adicionarGerente();
                case 2 -> adicionarAtendente();
                case 3 -> listarFuncionarios();
                case 4 -> mostrarSalario();
                case 5 -> System.out.println("\nEncerrando o sistema. Até logo!");
                default -> System.out.println("\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nSistema dos funcionarios:");
        System.out.println("1. Adicionar Gerente:");
        System.out.println("2. Adicionar Atendente:");
        System.out.println("3. Listar todos os funcionários:");
        System.out.println("4. Mostrar salário de funcionário (pelo CPF):");
        System.out.println("5. Sair:");
    }

    private static void adicionarGerente() {
        System.out.println("\n--- Cadastro de Gerente ---");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        double salario = lerDouble("Salário base: ");
        String dataNasc = lerString("Data de nascimento (dd/mm/aaaa): ");

        Gerente gerente = new Gerente(nome, cpf, salario, dataNasc);
        funcionarios.add(gerente);
        System.out.println("Gerente cadastrado com sucesso!");
    }

    private static void adicionarAtendente() {
        System.out.println("\n--- Cadastro de Atendente ---");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        double salario = lerDouble("Salário base: ");
        String dataNasc = lerString("Data de nascimento (dd/mm/aaaa): ");
        double comissao = lerDouble("Comissão: ");

        Atendente atendente = new Atendente(nome, cpf, salario, dataNasc, comissao);
        funcionarios.add(atendente);
        System.out.println("Atendente cadastrado com sucesso!");
    }

    private static void listarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários ---");

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        // Polimorfismo: toString() chamado de acordo com o tipo real do objeto
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    private static void mostrarSalario() {
        System.out.println("\n--- Consulta de Salário ---");
        String cpf = lerString("Informe o CPF do funcionário: ");

        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                // Polimorfismo: getSalario() executa a versão correta (Gerente ou Funcionario)
                System.out.printf("Funcionário: %s%n", f.getNome());
                System.out.printf("Salário: R$ %.2f%n", f.getSalario());
                return;
            }
        }

        System.out.println("Funcionário com CPF '" + cpf + "' não encontrado.");
    }

    // --- Métodos auxiliares de leitura ---

    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        try {
            int valor = Integer.parseInt(scanner.nextLine().trim());
            return valor;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Double.parseDouble(scanner.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número (ex: 1500.00)");
            }
        }
    }
}
