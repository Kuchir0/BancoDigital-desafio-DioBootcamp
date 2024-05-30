package src;

public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 0.05; 
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor + TAXA_SAQUE);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: " + getSaldo());
    }
}
