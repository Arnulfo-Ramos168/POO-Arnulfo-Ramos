package edu.arnulfo.ramos.reto3.process;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertirDecimales {
    /**
     *
     * @param decimal variable publica que recopilara un numero decimal dado por el usuario para ser convertido en ya sea un binario, octal o hexadecimal
     * @param numBinario variable publica que sera llamada en el CLI, esta recopilara un numero de tipo binario para ser transformado a decimal
     * @param numOctal variable publica que se llamara en el CLI para recopilar un valor de tipo octal para ser transformado en un decimal
     * @param hexadecimal variable publica que es llamada edentro del CLI para recoilar un valor de tipo hexadecimal para ser transformado a decimal
     *
     */
    public static int decimal;
    public static int numBinario;
    public static long numOctal;
    public static String hexadecimal = "";

    /**
     * DecimalesABinario codigo especifico para transformar de numeros decimales a binario
     */
    public static void DecimalesABinario(){
        int digito;
        String binario = "";
        do {
            digito = decimal % 2;
            binario += digito;
            decimal = decimal / 2;

        }while (decimal != 0);
        binario = new StringBuilder(binario).reverse().toString();
        System.out.println("Su numero es "+ binario + " en binario");
    }

    /**
     * DecimalesAOctal código específico para transformar numeros decimales en octales
     */
    public static void DecimalesAOctal(){
        ArrayList<Integer> octal = new ArrayList<>();
        while (decimal != 0) {
            octal.add(decimal %  8);
            decimal /= 8;
        }
        Collections.reverse(octal);
        System.out.println("Su numero en octal es: ");
        for (int i : octal){
            System.out.print(i);
        }
        System.out.println();
    }

    /**
     * DecimalesAHexadecimales código específico para transformar números decimales a hexadecimales
     */
    public static void DecimalesAHexadecimales(){
        int residuo;
        String hexadecimal = "";
        char[] hexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            residuo = decimal % 16;
            hexadecimal = hexadecimales[residuo] + hexadecimal;
            decimal /= 16;
        }
        System.out.println("Su numero en hexadecimal es: " + hexadecimal);

    }

    /**
     * BinariosADecimales código especifioco para transformar números binarios a decimales
     */
    public static void BinariosADecimales(){
        int residuo, c = 0, decimal = 0;
        while (numBinario !=0){
            residuo = numBinario % 10;
            decimal += residuo*Math.pow(2,c);
            c++;
            numBinario /=10;

        }
        System.out.println(decimal);
    }

    /**
     * OctalesADecimales código específico para transformar números octales en decimales
     */
    public static void OctalesADecimales(){
        int i = 0;
        long decimal = 0;
        while (numOctal != 0){
            decimal = (long) (decimal + (numOctal % 10) * Math.pow(8, i));
            numOctal /= 10;
            ++i;
        }
        System.out.println(decimal);
    }

    /**
     * HexadecimalesADecimales código específico para transformar números hexadecimales en decimales
     */
    public static void HexadecimalesADecimales(){
        int decimal = 0;
        final String digitos = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            int digito = digitos.indexOf(caracter);
            decimal = 16 * decimal + digito;
        }
        System.out.println(decimal);
    }

}