public class TestaSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(987654);

        Administrador adm = new Administrador();
        adm.setSenha(987456);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(adm);

    }
}
