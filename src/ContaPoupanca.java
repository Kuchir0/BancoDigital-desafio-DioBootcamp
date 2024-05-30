package src;

public class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.01; 

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * TAXA_RENDIMENTO;
        depositar(rendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: " + getSaldo());
    }
}
