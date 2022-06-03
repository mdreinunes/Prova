package Ex5;

import java.util.ArrayList;

public class Casa {
    String donoDaCasa;
    ArrayList<Quarto> quartos;

    public Casa(String donoDaCasa) {
        this.donoDaCasa = donoDaCasa;
        this.quartos = new ArrayList<Quarto>();
    }

    public void adicionarQuarto(Quarto quarto){
        this.quartos.add(quarto);
    }

    @Override
    public String toString() {
        return "Dono da casa: " + donoDaCasa +
                "\nQuartos: " + quartos;
    }
}
