package view;

import dao.LaptopDAO;

import javax.swing.*;

public class Tela extends JFrame{

    //Construtor básico
    public Tela() {
        TelaUI ui    = new TelaUI();
        JPanel panel = ui.getPanel();
        Init(panel);
    }

    //Construtor explícito passando o DAO com os dados em memória
    public Tela(LaptopDAO dao){
        TelaUI ui    = new TelaUI();
        ui.populaTabela(dao);
        JPanel panel = ui.getPanel();
        Init(panel);
    }

    //Método de declaração dos parâmetros da tela
    public void Init(JPanel panel){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
