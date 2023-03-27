public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) {
        double valorComTaxa = valor + 0.10;
        super.saca(valorComTaxa);
    }

    @Override
    public void deposita(double valor) {
        if (valor <= 0) {
            System.out.println("Não é permitido valor menor ou igual a 0");
            return;
        }
        this.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
