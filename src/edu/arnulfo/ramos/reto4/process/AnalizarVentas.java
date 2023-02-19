package edu.arnulfo.ramos.reto4.process;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * En esta clase se realizan las operaciones para obtener el trimestre con mayores ventas en general y por cadas sabor de café
 *
 * @autor Arnulfo Ramos
 * @autor Jonathan Peña
 */

public class AnalizarVentas {
    /**
     *
     * Este método se encarga de calcular el trimestre que mas vendió cada tipo de café
     *
     * @param ventas Es la tabla que contiene las ventas por semestre proveniente de CLI
     *
     * @return regresa el trimestre con mayor ventas por sabor, el mayor trimestre en total y los meses que abarca cada trimestre
     */
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
    public static List<Integer> obtenerMayorTrimestre(int[][] ventas){
        int maxTrimestre = 0;
        int index = 0;
        List<Integer> trimestres = new ArrayList<>();
        for (int i = 0; i < ventas.length; i++) {
            int sumatoria = 0;
            for (int j = 0; j < ventas.length; j++) {
                sumatoria += ventas[j][i];
            }
            if (sumatoria > maxTrimestre){
                maxTrimestre = sumatoria;
                index = i;
            }
        }
        trimestres.add(index);
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
