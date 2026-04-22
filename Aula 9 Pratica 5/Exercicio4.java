public class Exercicio4 {
    public static int[] contarParesImpares(int[] array) {
        int pares = 0;
        int impares = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        return new int[]{pares, impares};
    }
    public static void main(String[] args){
        int[] valores = {2,0,5,7,9};
        int[] resultado = contarParesImpares(valores);
        System.out.println("quantidade dos pares:" + resultado[0]);
        System.out.println("quantidade dos impares:" + resultado[1]);

    }
}
