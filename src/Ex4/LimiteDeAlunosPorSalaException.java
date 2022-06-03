package Ex4;

public  class LimiteDeAlunosPorSalaException extends Exception{

    public void limiteDeAlunos(int n){
        if (n > 30) {
            System.out.println("Exedeu o numero de Alunos!");
        }

    }

}
