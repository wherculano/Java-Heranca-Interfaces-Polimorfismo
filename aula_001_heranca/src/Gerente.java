public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public double getBonificacao(){
        System.out.println("Bonificacao do Gerente");
        return super.getBonificacao() + super.getSalario();
        // recebe bonificacao padrão, mais salario
    }
}
