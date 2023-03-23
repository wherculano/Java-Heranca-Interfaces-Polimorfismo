public class SistemaInterno {

    private int senhaExemplo = 987456;

    public boolean autentica(FuncionarioAutenticavel fa) {
        boolean autenticou = fa.autentica(this.senhaExemplo);
        if (autenticou) {
            System.out.println("Acesso confirmado!");
            return true;
        }
        System.out.println("Acesso negado!");
        return false;
    }
}
