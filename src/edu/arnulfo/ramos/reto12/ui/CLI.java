package edu.arnulfo.ramos.reto12.ui;

import edu.arnulfo.ramos.reto12.process.Empleado;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CLI {
    public static void showMenu(){
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ar168\\OneDrive\\Documentos\\School Proyects\\txt\\ListaJuniors.txt"));
            String line = reader.readLine();

            while (line != null){
                lines.add(line);
                line = reader.readLine();
            }
            reader.close();

            Collections.sort(lines);

            for (String l : lines) {
                System.out.println(l);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
