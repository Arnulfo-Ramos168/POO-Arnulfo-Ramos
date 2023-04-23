package edu.arnulfo.ramos.reto11.ui;

import edu.arnulfo.ramos.reto11.process.Empleado;
import edu.arnulfo.ramos.reto11.process.JrEngineer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CLI {
    public static void mostrarMenu(){

        //Lista que contiene los nombres, edades y cantidad de lenguajes aprendidos de los empleados
        ArrayList<Empleado> list = new ArrayList<>();
        list.add(new JrEngineer("Josue", 19, 3));
        list.add(new JrEngineer("David", 19, 3));
        list.add(new JrEngineer("Elias", 25, 8));
        list.add(new JrEngineer("Laila", 27, 7));
        list.add(new JrEngineer("Zayme", 30, 10));
        list.add(new JrEngineer("Arturo", 24, 5));
        list.add(new JrEngineer("Jaime", 48, 15));
        list.add(new JrEngineer("Eduardo", 35, 15));
        list.add(new JrEngineer("Sofia", 34, 12));
        list.add(new JrEngineer("Elizabeth", 21, 7));

        //Sea crea el nombre del archivo
        String fileName = "ListaEmpleados.txt";
        Path file = Paths.get(fileName);
        try {
            List<String> lines = list
                    .stream()
                    .map(Empleado ::toString)
                    .collect(Collectors.toList());
            Files.write(file, lines);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    //metodos para leer e imprimir el archivo creado
    public static void testReadFiles() {
        List<Empleado> readList = new ArrayList<>();
        String fileName = "ListaEmpleados.txt";
        Path file = Paths.get(fileName);

        try {
            for (String line : Files.readAllLines(file)){
                String[] parts = line.split(", ");
                if (parts[1].trim().equals("JrEngineer")){
                    readList.add(new JrEngineer(parts[0].trim(), Integer.parseInt(parts[2].trim()),Integer.parseInt(parts[3].trim())));
                }
            }
                ImprimirMayoresA20(readList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    static void ImprimirMayoresA20(List <Empleado> empleados){
        List<Empleado> empleadosMayoresDe20 = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getEdad() > 20) {
                System.out.println(empleado);
                empleadosMayoresDe20.add(empleado);
            }
        }
    }
        //Codigos que intente usar y que no me funcionaron pero creí que podrian ser utiles despues
        /**crearArchivo("ListaEmpleados.txt");
        escribirArchivo("ListaEmpleados.txt", String.valueOf(list));
        leerArchivo("ListaEmpleado.txt");/*
        /**File archivo = new File("ListaEmpleados.txt");
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path documento = Paths.get("ListaEmpleados.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(documento)){
            for (JrEngineer jrEngineer : list){
                writer.write(jrEngineer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


   /** static void testReadFiles(){
        String filename = "testfile.txt";
        Path file = Paths.get(filename);

        try {
            Files.lines(file)
                    .forEach(System.out ::println);
        }
    }
    static void testWriteFiles(){
        ArrayList<Empleado> list = new ArrayList<>();
        list.add(new JrEngineer("Josue", 19, 3));
        list.add(new JrEngineer("David", 19, 3));
        list.add(new JrEngineer("Elias", 25, 8));
        list.add(new JrEngineer("Laila", 27, 7));
        list.add(new JrEngineer("Zayme", 30, 10));
        list.add(new JrEngineer("Arturo", 18, 2));

        String fileName = "testWriteFile.txt";
        Path path = Paths.get(fileName);


    }
    static void testReadFiles() {
        ArrayList<Empleado> readList = new ArrayList<>();
        String fileName = "testReadFile.txt";
        Path file = Paths.get(fileName);
        try {


            for(String line : Files.readAllLines(file)){
                List<String> lines = readList
                        .stream()
                        .map(Empleado::toString)
                        .collect(Collectors.toList());
                readList.add(line.split(";")[0]);
                System.out.println(readList);
                //System.out.println(line.split(";")[0]);
                //System.out.println(line.split(";")[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void printOver20Emp() {
        testReadFiles();*/
}

