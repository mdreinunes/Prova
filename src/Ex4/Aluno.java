package Ex4;

public class Aluno extends Pessoa implements Avaliavel{
    private String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public double calcularNota(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public String toString() {
        return  "\n                        " + "\nNome do Aluno " + nome +
                "\nMatricula: " + matricula;
    }
}
