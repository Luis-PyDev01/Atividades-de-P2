public class Gerente extends Funcionario {

    private static final double BONIFICACAO = 2000.00;

    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + BONIFICACAO;
    }

    @Override
    public String toString() {
        return "[GERENTE] " + super.toString() + " (inclui bônus de R$ 2000,00)";
    }
}
