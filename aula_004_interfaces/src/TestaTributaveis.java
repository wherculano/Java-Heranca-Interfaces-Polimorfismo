public class TestaTributaveis {
    public static void main(String[] args) {


        ContaCorrente contaCorrente = new ContaCorrente(123, 321);
        try{
            contaCorrente.deposita(1000);
        }catch(ValorNegativoException ex){
            System.out.println("Não é possível depositar valores iguais ou menores que 0!");
        }

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);

        System.out.println(calculadorImposto.getTotalImpostos());
    }
}
