public class SistemaLogin {

    private String senhaSecreta;

    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (!senha.equals(senhaSecreta)) {
            throw new LoginInvalidoException("Senha incorreta para o usuário: " + usuario);
        }
        System.out.println("Login realizado com sucesso! Bem-vindo, " + usuario + ".");
    }
}
