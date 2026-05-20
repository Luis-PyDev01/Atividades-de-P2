class Retangulo {

    private double altura = 1.0;
    private double largura = 1.0;

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida! Deve estar entre 0.0 e 20.0");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida! Deve estar entre 0.0 e 20.0");
        }
    }
}


public class Exercicio2 {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo();


        System.out.println("Valores padrão:");
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Largura: " + r1.getLargura());

        r1.setAltura(5.5);
        r1.setLargura(10.0);

        System.out.println("\nNovos valores:");
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Largura: " + r1.getLargura());

        System.out.println("\nÁrea: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());

        r1.setAltura(25.0);
        r1.setLargura(-3.0);
    }
}