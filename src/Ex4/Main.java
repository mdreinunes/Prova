package Ex4;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Prof", "Matematica");
        SalaDeAula sala1 = new SalaDeAula(prof);

        Aluno aluno1 = new Aluno("Fulano", "1122");
        Aluno aluno2 = new Aluno("Ciclano", "2233");
        Aluno aluno3 = new Aluno("Beltrano", "3344");
        Aluno aluno4 = new Aluno("Juliano", "4455");
        Aluno aluno5 = new Aluno("Jiliano", "5566");

        sala1.adicionarAluno(aluno1);
        sala1.adicionarAluno(aluno2);
        sala1.adicionarAluno(aluno3);
        sala1.adicionarAluno(aluno4);
        sala1.adicionarAluno(aluno5);

        prof.avaliar(aluno1, 1, 3);
        prof.avaliar(aluno2, 10, 10);
        prof.avaliar(aluno3, 5, 5);
        prof.avaliar(aluno4, 6, 7);
        prof.avaliar(aluno5, 6, 10);

        System.out.println(sala1.imprimir());

    }
}
