package edu.arnulfo.ramos.reto12;
import edu.arnulfo.ramos.reto12.process.Empleado;
import edu.arnulfo.ramos.reto12.process.JrEngineer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Pruebas {
    /**public static void main(String[] args) {
        // Leer el archivo de texto y crear un ArrayList de empleados
        List<Empleado> empleados = leerArchivo("empleados.txt");

        // Determinar cuántos empleados tienen entre 20 y 25 años de edad
        long empleadosEntre20y25 = empleados.stream()
                .filter(e -> e.getEdad() >= 20 && e.getEdad() <= 25)
                .count();
        System.out.println("Número de empleados entre 20 y 25 años: " + empleadosEntre20y25);

        // Ordenar la lista alfabéticamente y mostrar los primeros 10 empleados
        empleados.stream()
                .sorted(Comparator.comparing(Empleado::getNombre))
                .limit(10)
                .forEach(System.out::println);

        // Calcular el promedio de edad de todos los empleados
        double promedioEdad = empleados.stream()
                .mapToInt(Empleado::getEdad)
                .average()
                .orElse(0);
        System.out.println("Promedio de edad: " + promedioEdad);

        // Encontrar el último empleado de la lista (ordenada por edad y luego por nombre)
        Empleado ultimoEmpleado = empleados.stream()
                .sorted(Comparator.comparing(Empleado::getEdad)
                        .thenComparing(Empleado::getNombre))
                .reduce((primero, segundo) -> segundo)
                .orElse(null);
        System.out.println("Último empleado de la lista: " + ultimoEmpleado);
    }

    private static List<Empleado> leerArchivo(String nombreArchivo) {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length == 4) {
                    Empleado empleado = new JrEngineer(campos[1], Integer.parseInt(campos[2]), campos[3]);
                    empleados.add(empleado);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empleados;
    }*/
}
