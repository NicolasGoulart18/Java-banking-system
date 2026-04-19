public class Conta {
    String nome;
    String tipo;
    double saldo;

    void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    void receber(double valor) {
        saldo += valor;
        System.out.printf("Valor recebido! Novo saldo: R$ %.2f%n", saldo);
    }

    void transferir(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Transferência realizada! Novo saldo: R$ %.2f%n", saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}