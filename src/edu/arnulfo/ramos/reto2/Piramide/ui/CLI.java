package edu.arnulfo.ramos.reto2.Piramide.ui;
import java.util.Scanner;
public class CLI {
    public static void mostrarPiramide() {
        Scanner scanner = new Scanner(System.in);
        int filas = 0;
        System.out.println("Ingrese la cantidad de filas que desea en la piramide: ");
        filas = scanner.nextInt();
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j < filas; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}