package edu.arnulfo.ramos.reto9;

import edu.arnulfo.ramos.reto9.process.Ayudantes;

public class Main {
    public static void main(String[] args) {
        Ayudantes [] ayudantes = new Ayudantes[5];
        for (int i = 0; i < 5; i++) {
            ayudantes[i] = new Ayudantes();
            ayudantes[i].mostrarCaracteristicas();
            System.out.println();
        }
    }
}
