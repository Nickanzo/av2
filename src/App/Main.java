package App;

import dao.LaptopDAO;
import modelo.Laptop;
import view.Tela;

public class Main {

    public static void main(String[] args) {

        //Criação de DAO para salvar em memória os dados
        LaptopDAO dao = new LaptopDAO();

        //Colocando dados dentro do DAO
        dao.addLaptop(new Laptop(20,"AMD","Ryzen 5", 8));
        dao.addLaptop(new Laptop(25,"AMD","Ryzen 3", 8));
        dao.addLaptop(new Laptop(29,"Intel","i9", 8));
        dao.addLaptop(new Laptop(24,"Intel","i7", 8));
        dao.addLaptop(new Laptop(22,"AMD","Ryzen 7", 8));
        dao.addLaptop(new Laptop(32,"Intel","Ryzen 3", 8));

        //Chamada da Tela
        Tela tela = new Tela(dao);

    }
}
