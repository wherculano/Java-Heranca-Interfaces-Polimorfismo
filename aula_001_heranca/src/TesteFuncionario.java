public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario wagner = new Funcionario();
        wagner.setNome("Wagner Herculano");
        wagner.setCpf("999.999.999-99");
        wagner.setSalario(19000);

        System.out.println(wagner.getNome());
        System.out.println(wagner.getBonificacao());

    }
}
