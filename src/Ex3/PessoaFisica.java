package Ex3;

public class PessoaFisica extends Pessoa{

    String cpf;

    public PessoaFisica(String nome,String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\nCpf:" + cpf;
    }
}
