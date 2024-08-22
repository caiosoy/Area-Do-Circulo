package Area;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        int raio = 5;


// Calcula a area do circulo utilizando o Math.PI e Math.pow
        double circulo = Math.PI * Math.pow(raio, 2);


        System.out.println("Área do circulo: " + circulo);

    }
}
