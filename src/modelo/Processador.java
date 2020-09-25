package modelo;

import java.util.Scanner;

public class Processador {

    private String marca;   //Diferenciar de Intel e AMD
    private String modelo;

    //Caso seja criado um processador sem info, resgatar a info do próprio usuário
    public Processador() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a marca do seu processador?\n"  + "1. AMD\n" + "2. Intel" );

        int marca = scan.nextInt();

        if (marca == 1)
            this.marca = "AMD";
        else
            this.marca = "Intel";

        System.out.println("Qual modelo?");

        this.modelo = scan.next();

    }
    //Construtor Explícito
    public Processador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /*
        Getters & Setters
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //toString para resgatar todos os dados de maneira organizada
    @Override
    public String toString() {
        return marca  + " " +   modelo ;
    }
}
