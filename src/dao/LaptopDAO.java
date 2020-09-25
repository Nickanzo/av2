package dao;

import modelo.Laptop;
import modelo.Processador;

import java.util.ArrayList;

public class LaptopDAO {
    //Criação da lista para salvar Laptops em Memória
    private ArrayList<Laptop> laptops = new ArrayList<Laptop>();

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public void addLaptop(Laptop novo){
        laptops.add(novo);
    }
}
