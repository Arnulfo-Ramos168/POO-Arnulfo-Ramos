package edu.arnulfo.ramos.reto12.ui;

import edu.arnulfo.ramos.reto11.process.Empleado;
import edu.arnulfo.ramos.reto12.process.JrEngineer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CLI {
    public static void showMenu(){

        List<JrEngineer> jrs = LecturaDeArchivo();
        /**
         * ArrayList creado para la lectura del archivo
         */

        //Paso 1
        System.out.println("Determinar cuantos empleados tienen entre 20 y 25 años de edad");
        long empleadosEntre20y25 = jrs.stream()
                .filter(e -> e.getEdad() >= 20 && e.getEdad() <= 25)
                .count();
        System.out.println("Número de empleados entre 20 y 25 años: " + empleadosEntre20y25);

        //Paso 2
        System.out.println("\n Con la lista ordenada alfabéticamente, imprimir en pantalla los primeros 10 empleados de la lista");
        jrs.stream()
                .sorted(Comparator.comparing(JrEngineer::getNombre))
                .limit(10)
                .forEach(System.out::println);

        //Paso 3
        System.out.println("\n Encontrar el promedio de edad de todos los empleados.");
        double promedio = jrs.stream()
                .mapToInt(Empleado::getEdad)
                .average()
                        .orElse(0);
        System.out.println("El promedio de todas las edades es: " + promedio);
        //Alternativa://OptionalDouble avg = nameList.stream()
        //                //.mapToInt(JrEngineer::getEdad)
        //                //.average();
        //    //sout(avg.orElseGet()));

        //Paso 4

        System.out.println("\n Encontrar el último empleado de la lista si esta tiene como primer criterio de ordenamiento la edad y segundo criterio el nombre(alfabéticamente) ");
        JrEngineer ultimoEmpleado = jrs.stream()
                .sorted(Comparator.comparing(JrEngineer::getEdad)
                        .thenComparing(JrEngineer::getNombre))
                .reduce((primero, segundo) -> segundo)
                .orElse(null);
        System.out.println("El ultmimo empleado de la lista es: " + ultimoEmpleado);

    }

    /**
     * Método que sirve para crear y leer un ArrayList con base al contenido de un documento txt situado en el computador
     */
    static List<JrEngineer> LecturaDeArchivo() {
        String fileName = "C:\\\\Users\\\\ar168\\\\OneDrive\\\\Documentos\\\\School Proyects\\\\txt\\\\ListaJuniors.txt";
        Path file = Paths.get(fileName);
        List<JrEngineer> jrs = new ArrayList<>();
        try{
            for (String line : Files.readAllLines(file)){
                String[] splitVal = line.split(";");
                String nombre = splitVal[1];
                int Edad = Integer.parseInt(splitVal[2]);
                String rfc = splitVal[3];
                JrEngineer jrEngineer = new JrEngineer(nombre, Edad, rfc);
                jrs.add(jrEngineer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return jrs;
    }

}
