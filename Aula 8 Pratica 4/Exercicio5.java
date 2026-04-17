public class Exercicio5 {
    public static void main(String[] args) {

        int[] notas = {7, 8, 6, 10, 9};


        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;
        System.out.println("Média: " + media);

        int contador = 0;
        for (int nota : notas) {
            if (nota > media) {
                contador++;
            }
        }

        System.out.println("Quantidade de notas acima da média: " + contador);
    }
}