import java.util.ArrayList;
import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n LISTA DE COMPRAS:");
            System.out.println("1 - Adicionar item:");
            System.out.println("2 - Listar itens:");
            System.out.println("3 - Remover item:");
            System.out.println("4 - Sair:");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();

                    lista.add(item);

                    System.out.println("Item adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nITENS DA LISTA:");

                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + ". " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {

                        System.out.println("\n ITENS DA LISTA ");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + ". " + lista.get(i));
                        }

                        System.out.print("Digite o índice do item que deseja remover: ");
                        int indice = scanner.nextInt();

                        if (indice >= 0 && indice < lista.size()) {
                            String removido = lista.remove(indice);
                            System.out.println("O item \"" + removido + "\"  foi removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

    }
}
