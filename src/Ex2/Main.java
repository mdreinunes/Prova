package Ex2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus","111111111","2222222222");
        Conta conta1 = new Conta("001",10000.0,cliente1);

        System.out.println("Dados conta: " + conta1);
        System.out.println("Dados cliente: " + cliente1);

    }
}
