package Ex1;

public class Motor {
   private String potencia;
   private String qtdCilindros;


    public Motor(String potencia, String qtdCilindros) {
        this.potencia = potencia;
        this.qtdCilindros = qtdCilindros;
    }

    @Override
    public String toString() {
        return potencia + qtdCilindros;

    }
}
