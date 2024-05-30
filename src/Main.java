package src;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Vitor Luz", "123.456.789-00");
        Cliente cliente2 = new Cliente("Antonio Pereira", "987.654.321-00");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente2);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(500);
        conta2.depositar(300);

        conta1.sacar(50);
        conta2.sacar(50);

        conta1.transferir(100, conta2);

        /* Aplica rendimento à conta poupança */

        ((ContaPoupanca) conta2).aplicarRendimento();

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
