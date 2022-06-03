package Ex4;

import java.util.HashMap;
import java.util.Map;

public class SalaDeAula {
    Professor professor;
    Map<Integer, Aluno> mapaDeAlunos;
    int qtdAlunos;

    public SalaDeAula(Professor professor) {
        this.professor = professor;
        this.mapaDeAlunos = new HashMap<Integer, Aluno>();
    }

    public void adicionarAluno(Aluno a) {
        this.qtdAlunos++;
        mapaDeAlunos.put(qtdAlunos, a);
    }

    public String imprimir() {
        return "Professor: " + professor + "\nAlunos" + mapaDeAlunos;
    }
}
