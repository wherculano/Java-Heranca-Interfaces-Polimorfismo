public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(777, 999);
        contaCorrente.deposita(100);
        contaCorrente.saca(200);
        System.out.println("Saldo: R$" + contaCorrente.getSaldo());

    }
}
