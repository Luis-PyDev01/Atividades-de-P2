public class Atendente extends Funcionario {

    private double comissao;

    public Atendente(String nome, String cpf, double salario, String dataNascimento, double comissao) {
        super(nome, cpf, salario, dataNascimento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return String.format("[ATENDENTE] %s | Comissão: R$ %.2f", super.toString(), comissao);
    }
}
