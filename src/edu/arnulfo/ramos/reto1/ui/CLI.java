package edu.arnulfo.ramos.reto1.ui;

import edu.arnulfo.ramos.reto1.process.Calculadora;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu(){
        System.out.println("Elige una opción");
        System.out.println("(1) suma");
        System.out.println("(2) resta");
        System.out.println("(3) multiplicación");
        System.out.println("(4) división");
        System.out.println("(5) otro");


        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();scanner.nextLine();

        System.out.println("introduce el primer valor");
        int operando1 = scanner.nextInt();scanner.nextLine();
        System.out.println("Introduce el segundo valor");
        int operando2 =scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion = "";
        switch (option){
            case 1:
                Calculadora.sumarNumeros(operando1, operando2);
                resultado = Calculadora.sumarNumeros(operando1, operando2);
                operacion = "+";
                break;
            case 2:
                Calculadora.restarNumeros(operando1, operando2);
                resultado= Calculadora.restarNumeros(operando1, operando2);
                operacion = "-";
                break;
            case 3:
                Calculadora.multiplicarNumeros(operando1,operando2);
                resultado = Calculadora.multiplicarNumeros(operando1, operando2);
                operacion = "*";
                break;
            case 4:
                Calculadora.dividirNumeros(operando1,operando2);
                resultado = Calculadora.dividirNumeros(operando1, operando2);
                operacion = "/";
                break;


        }
        System.out.printf("El resultado de la operacion de %d %s %d = %d ", operando1, operacion,operando2, resultado);

    }
}
