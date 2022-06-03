package Ex2;

public class Conta {
    String numero;
    Double saldo;
    Cliente cliente;

    public Conta(String numero, Double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\nNumero da conta: " + numero +
                "\nSaldo: " + saldo;

    }
}
