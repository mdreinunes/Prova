package Ex3;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoFi = new PessoaFisica("Matheus", "11111111");
        System.out.println(pessoFi.imprimir());

        Pessoa pessoJu = new PessoaJuridica("Fulano", "222222");
        System.out.println(pessoJu.imprimir());
    }
}
