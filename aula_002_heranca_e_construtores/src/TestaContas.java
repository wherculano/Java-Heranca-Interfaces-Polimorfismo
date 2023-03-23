public class TestaContas {
    public static void main(String[] args) {
        Cliente wagner = new Cliente("Wagner Herculano", "999.999.999-99");

        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.setTitular(wagner);
        contaCorrente.deposita(1000);

        ContaPoupanca contaPoupanca = new ContaPoupanca(123, 456);
        contaPoupanca.deposita(19000);

        System.out.println("\nTotal de contas criadas até o momento: " + Conta.getTotal() + "\n");

        contaCorrente.transfere(100, contaPoupanca);

        System.out.println("Conta Corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Conta Poupanca: R$" + contaPoupanca.getSaldo());
    }
}
