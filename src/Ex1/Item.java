package Ex1;

public class Item {
    private String desc;
    private double valor;

    public Item(String desc, double valor) {
        this.desc = desc;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return desc;
    }
}
