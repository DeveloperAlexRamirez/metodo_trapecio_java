package com.alex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner re = new Scanner(System.in);

        int opc = 3;

        Metodos met = new Metodos();

        System.out.println("Bienvenido al programa pa calcular el Trapecio\n");

        do {

            System.out.println("===========================");
            System.out.println("1.- Integral simple");
            System.out.println("2.- Integrales dobles");
            System.out.println("3.- Salir");
            System.out.println("===========================");

            System.out.println("Digita tu opción: \n");
            opc = re.nextInt();

            switch (opc) {
                case 1 -> {
                    met.leerValoresPrimerIntegral();
                    met.CalculosGenerales();
                    met.Pausa(opc);
                }
                case 2 -> {
                    met.calculosIntegralDoble();
                    met.Pausa(opc);
                }
                case 3 -> {
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Solo números entre 1 y 3");
            }
        } while (opc != 3);

    }
}
