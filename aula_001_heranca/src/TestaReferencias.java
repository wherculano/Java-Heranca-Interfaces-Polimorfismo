public class TestaReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Wagner Herculano");
        gerente.setSalario(10000);

        Administrador adm = new Administrador();
        adm.setNome("Danielle G. H");
        adm.setSalario(6392);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente);
        controleBonificacao.registra(adm);

        System.out.println("Total geral de bonificacao: R$" + controleBonificacao.getSoma());

    }
}
