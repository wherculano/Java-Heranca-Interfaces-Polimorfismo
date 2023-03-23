public class Administrador extends Funcionario implements Autenticavel{
    private int senha;

    public double getBonificacao() {
        System.out.println("Bonificacao do Administrador");
        return 500;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
