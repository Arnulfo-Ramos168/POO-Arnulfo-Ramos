package edu.arnulfo.ramos.reto2.Boletos.ui;
import edu.arnulfo.ramos.reto2.Boletos.process.CalculadorCostos;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
    int child = 0;
    int adult = 0;
    int senor = 0;
    int senorsin = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escoge el boleto que desea comprar \n A) Adulto = $100 \n N) Niño = $70 \n I) abuelo con clave INAPAM = $50 \n B) abuelo sin clave INAPAM = $70 \n s) salir");
    System.out.println("");
    while (true){
        System.out.println(" A \n N \n I \n B \n s");
        String escogerBoletos = scanner.nextLine();
        switch (escogerBoletos){
            case "A":
                adult++;
                break;
            case "N":
                child++;
                break;
            case "I":
                senor++;
                break;
            case "B":
                senorsin++;
                break;
            case "s":
                CalculadorCostos.calcularCostos(child, adult, senor, senorsin);
                System.out.println(" Adulto: " + adult + "\n Niño: " + child + "\n Abuelo con INAPAM: " + senor + "\n Abuelo sin INAPAM: " + senorsin);
                System.out.println("El precio total es:" + ((adult * 100) + (child * 70) + (senor * 50) + (senorsin * 70)) + "$");
                return;
            default:
                System.out.println("La opción que eligió es inválida, Seleccione una opción válida ");
                break;

        }

    }

    }
}
