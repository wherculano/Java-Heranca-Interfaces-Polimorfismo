public class Autenticador {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
