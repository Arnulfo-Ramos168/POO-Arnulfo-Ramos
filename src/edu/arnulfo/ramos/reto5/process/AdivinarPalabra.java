package edu.arnulfo.ramos.reto5.process;

import java.util.Scanner;
/**
 en esta clase se realizan los procesos necesarios para que
 nuestro juego pueda tener  los intetos necesarios como para que
 el mismo funcione de la manera que nosostros esperamos
 @author jonathan peña
 @author Arnulfo Ramos
 */
public class AdivinarPalabra {
    public static void jugar(String palabra) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 5;
        String palabraAdivinada = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivinada += "X";
        }
        while (intentos > 0 && !palabraAdivinada.equals(palabra)) {
            System.out.println("La palabra a adivinar es: " + palabraAdivinada);
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println("Ingrese una letra: ");
            String letra = scanner.nextLine().toLowerCase();
            boolean acerto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra.charAt(0)) {
                    palabraAdivinada = palabraAdivinada.substring(0, i) + letra + palabraAdivinada.substring(i + 1);
                    acerto = true;
                }
            }
            if (acerto) {
                System.out.println("¡Acertaste!");
            } else {
                System.out.println("Inténtalo de nuevo");
                intentos--;
            }
        }
        if (palabraAdivinada.equals(palabra)) {
            System.out.println("¡Felicitaciones! Adivinaste la palabra " + palabra);
        } else {
            System.out.println("¡Lo siento! No adivinaste la palabra " + palabra);
        }
    }
}
