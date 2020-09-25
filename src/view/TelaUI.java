package view;

import dao.LaptopDAO;
import modelo.Laptop;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TelaUI {

    //Declaração dos componentes da tela
    private JPanel panel;
    private JTable laptopTable;
    private JScrollPane scrollPane;
    public  DefaultTableModel dadosTabela;

    //Modelo de criação da tabela e suas colunas
    private void criaTabela(){
        dadosTabela = new DefaultTableModel(
                new String[][]{ },
                new String[] {"Processador", "Modelo", "Polegadas", "RAM"});
    }

    //Método para colocar dados na tabela
    public void populaTabela(LaptopDAO dao){
        for (Laptop laptop_aux : dao.getLaptops()){
            dadosTabela.addRow(new String[]{ laptop_aux.getProcesador().getMarca(),
                    laptop_aux.getProcesador().getModelo(),
                    Integer.toString(laptop_aux.getPolegadas()),
                    Integer.toString(laptop_aux.getRam())
            });
        }
    }

    public JPanel getPanel(){
        return panel;
    }

    //Customização da Tela
    private void createUIComponents() {
        criaTabela();
        laptopTable = new JTable(dadosTabela);
    }
}
