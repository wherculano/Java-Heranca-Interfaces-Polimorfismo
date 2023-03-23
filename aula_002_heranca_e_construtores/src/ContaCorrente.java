public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorComTaxa = valor + 0.10;
        return super.saca(valorComTaxa);
    }

    @Override
    public void deposita(double valor) {
        if (valor <= 0) {
            System.out.println("Não é permitido valor menor ou igual a 0");
            return;
        }
        this.saldo += valor;
    }
}
