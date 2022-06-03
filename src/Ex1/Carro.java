package Ex1;

import java.util.ArrayList;

public class Carro {
    private String ano;
    private String marca;
    private String modelo;
    private String cor;
    private ArrayList <Item> item;

    private Motor motor;

    public Carro(String ano, String marca, String modelo, String cor, Motor motor) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.item = new ArrayList<Item>();
    }

    public void adicionarItensDeSerie(Item item){
        this.item.add(item);
    }
    public void getDescricao(){
        System.out.println("Descricao do carro: " + marca + ", " +  modelo + ", " + ano + ", " + cor);
    }

    public void getItens(){
        System.out.println("Itens de serie " + item);
    }
    public void getMotor(){
        System.out.println("Motor: " + motor);
    }

}
