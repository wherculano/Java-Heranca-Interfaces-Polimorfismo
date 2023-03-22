public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Wagner");
        gerente.setSalario(19000);
        gerente.setCpf("999.999.999-99");
        gerente.setSenha(123321);

        boolean autenticado = gerente.autentica(123321);
        if (autenticado){
            System.out.println("Usuario autenticado com sucesso!");
        } else{
            System.out.println("Senha inválida!");
        }
    }
}
