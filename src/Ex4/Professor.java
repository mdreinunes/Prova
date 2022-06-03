package Ex4;

public class Professor extends Pessoa {
    private String materia;

    public Professor(String nome, String materia) {
        super(nome);
        this.materia = materia;
    }

    public double avaliar(Avaliavel avaliavel, double n1, double n2) {

        if (avaliavel.calcularNota(n1, n2) > 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        return (n1 + n2) / 2;
    }

    public String toString() {
        return "Nome do Professor: " + nome +
                "\nMateria: " + materia;
    }

}
