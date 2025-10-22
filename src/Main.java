

public class Main {
    public static void main(String[] args) {
        Banco BB = new Banco();
        AdapterBanco  ab = new AdapterBanco(BB);
        ab.pagamento(50);
    }
}