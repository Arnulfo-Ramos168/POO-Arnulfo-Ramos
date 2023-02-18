package edu.arnulfo.ramos.reto4.ui;
import edu.arnulfo.ramos.reto4.process.AnalizarVentas;

public class CLI {
    public static void showMenu() {
        int[][] ventas = {
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308}
        };
        for (int trimestres :
        AnalizarVentas.obtenerMaximaVentaPorTrimestre(ventas)){

            System.out.println("El trimestre que mejor vendio fue: " + AnalizarVentas.nombrarTrimestre(trimestres));
        }
        for (int trimestre :
        AnalizarVentas.obtenerMaximoTrimestre(ventas)){
            System.out.println("topi" + AnalizarVentas.nombrarTrimestre(trimestre));
        }

    }

}

