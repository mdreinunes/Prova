package Ex5;

public class Quarto {
    String cor;
    int numero;

    public Quarto(String cor, int numero) {
        this.cor = cor;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  "\nQuarto: " + numero +
                "\nCor: " + cor;
    }
}
