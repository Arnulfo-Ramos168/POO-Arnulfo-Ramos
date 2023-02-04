package edu.arnulfo.ramos.reto2.Boletos.process;

public class CalculadorCostos {
    public static double PRECIO_CHILD = 70.0;
    public static double PRECIO_ADULT = 100.0;
    public static double PRECIO_SENIOR = 50.0;
    public static double PRECIO_SENIORSIN = 70.0;
    public static double calcularCostos(int numChild, int numAdult, int numSenior, int numSeniorsin){
        return (numChild * PRECIO_CHILD) + (numAdult * PRECIO_ADULT) + (numSenior * PRECIO_SENIOR) + (numSeniorsin * PRECIO_SENIORSIN);
    }
}
