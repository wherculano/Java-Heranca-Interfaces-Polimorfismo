public class Gerente extends FuncionarioAutenticavel {

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario();
        // recebe bonificacao padrão, mais salario
    }
}
