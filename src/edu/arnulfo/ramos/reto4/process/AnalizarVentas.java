package edu.arnulfo.ramos.reto4.process;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalizarVentas {
    public static List<Integer> obtenerMaximaVentaPorTrimestre(int[][] ventas){
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int auxIndex = 0;
        for (int i = 0; i < ventas.length; i++) {
            max = Double.MIN_VALUE;
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j] > max){
                    max = ventas[i][j];
                    auxIndex = j;
                }
            }
            trimestres.add(auxIndex);

        }
        return trimestres;
    }

    public static List<Integer> obtenerMaximoTrimestre(int [][] ventas){
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int auxIndex = 0;
        for (int i = 0; i < ventas.length; i++) {
            max = Double.MIN_VALUE;
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[j][i] > max) {
                    max = ventas[i][j];
                    auxIndex = j;
                }
            }

        }
        trimestres.add(auxIndex);
        return trimestres;
    }

    public static String nombrarTrimestre(int trimestre){
        switch (trimestre){
            case 0:
                return "Enero-Marzo";
            case 1:
                return "Abril-Junio";
            case 2:
                return "Julio-Septiembre";
            case 3:
                return "Octubre-Diciembre";
            default:
                return "trimestre no válido";
        }
    }
}
