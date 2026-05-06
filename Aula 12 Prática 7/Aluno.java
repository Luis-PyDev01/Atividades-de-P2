public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double notaTrabalho;


    public Aluno(String nome, String matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }


    public double calcularMedia() {
        return (nota1 + nota2 + notaTrabalho) / 3;
    }


    public void verificarSituacao() {
        double media = calcularMedia();

        System.out.println("Aluno: " + nome + " | Média: " + String.format("%.2f", media));

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

    }
}