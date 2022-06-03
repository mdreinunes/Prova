package Ex1;

public class Main {
    public static void main(String[] args) {

        Motor motor1 = new Motor("110 cv","4 cilindros");
        Carro carro1 = new Carro("2000","Volkswagen","Gol","Preto", motor1);
        Item item1 = new Item("Ar condicionado",100);
        Item item2 = new Item("Vidro eletrico",200);
        Item item3 = new Item("Trava eletrica",300);

        carro1.adicionarItensDeSerie(item1);
        carro1.adicionarItensDeSerie(item2);
        carro1.adicionarItensDeSerie(item3);

        carro1.getDescricao();
        carro1.getItens();
        carro1.getMotor();
    }
}
