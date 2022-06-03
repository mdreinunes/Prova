package Ex5;

public class Main {
    public static void main(String[] args) {
        Quarto quarto1 = new Quarto("Branco", 1);
        Quarto quarto2 = new Quarto("Preto", 2);
        Quarto quarto3 = new Quarto("Rosa", 3);
        Quarto quarto4 = new Quarto("Vermelho", 4);
        Quarto quarto5 = new Quarto("Cinza", 5);

        Casa casa1 = new Casa("Matheus");

        casa1.adicionarQuarto(quarto1);
        casa1.adicionarQuarto(quarto2);
        casa1.adicionarQuarto(quarto3);
        casa1.adicionarQuarto(quarto4);
        casa1.adicionarQuarto(quarto5);

        System.out.println("Casa: " + casa1);

    }

}
