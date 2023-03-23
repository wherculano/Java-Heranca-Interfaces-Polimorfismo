public class TestaTributaveis {
    public static void main(String[] args) {


        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.deposita(1000);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);

        System.out.println(calculadorImposto.getTotalImpostos());
    }
}
