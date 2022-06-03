package Ex3;

public class PessoaJuridica extends Pessoa{

    String cnpj;

    public PessoaJuridica(String nome,String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\ncnpj:" + cnpj;
    }
}
