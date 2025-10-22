public class AdapterBanco extends User{

    private Banco banco;

    public AdapterBanco(Banco b){
        this.banco = b;
    }
    @Override
    public void pagamento (double valor) {
        this.banco.pagarBanco(valor, "Professor");
    }
}
