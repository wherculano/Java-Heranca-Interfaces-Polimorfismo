public class Administrador extends Funcionario{

    public double getBonificacao() {
        System.out.println("Bonificacao do Administrador");
        return super.getBonificacao() + 500;
    }
}
