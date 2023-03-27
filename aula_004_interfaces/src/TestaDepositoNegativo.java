public class TestaDepositoNegativo{
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(777, 9999);
        try{
            contaCorrente.deposita(-1000);
        }catch(ValorNegativoException ex){
            System.out.println(ex.getMessage());
        }
    }
}
