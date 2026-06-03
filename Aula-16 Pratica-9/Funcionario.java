public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String dataNascimento;

    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Salário: R$ %.2f | Nascimento: %s",
                nome, cpf, getSalario(), dataNascimento);
    }
}
