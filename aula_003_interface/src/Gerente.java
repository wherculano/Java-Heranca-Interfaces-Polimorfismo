public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario();
        // recebe bonificacao padrão, mais salario
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
