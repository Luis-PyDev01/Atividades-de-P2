public class Exercicio2{
    public static int maiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }
    public static void main(String[] args){
        int[] lista = {1,2,4,57,8};
        System.out.println(maiorValor(lista));
    }
}
