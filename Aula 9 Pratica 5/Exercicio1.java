public class Exercicio1 {
    public static double calcularHipotenusa(double a, double b){
       return Math.sqrt(a*a + b*b);
    }
public static void main(String[] args) {
    double x = 3.6;
    double y = 6.4;
    double resultado = calcularHipotenusa(x, y);
    System.out.println("o valor da hipotenusa é de:" + resultado);
    }
}
