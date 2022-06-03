package Ex2;

public class Cliente {
    String nome;
    String cpf;
    String rg;

    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRF: " + rg;

    }
}
