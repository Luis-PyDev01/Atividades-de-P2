public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ricardo Silva", "2023001", 8.5, 7.0, 9.0);
        Aluno aluno2 = new Aluno("Ana Souza", "2023002", 5.0, 6.5, 4.0);
        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
    }
}
