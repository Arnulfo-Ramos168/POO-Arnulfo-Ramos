package edu.arnulfo.ramos.retoFinal.ui;

import edu.arnulfo.ramos.retoFinal.process.JuegoHadas;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------Oh My Hero!------------");
        int opcion = 1;

        while (opcion != 0){
            System.out.println("Bienvenido a este mundo de caos y guerra \nPresiona '1' para empezar o '0' para finalizar\n");
            opcion = scanner.nextInt();
            if (opcion == 0){
                System.out.println("Vuelve pronto!! Las hadas te esperan!");
                break;
            }
            switch (opcion){
                case 1:
                    System.out.println("En las tierras intermedias, un mundo mágico lleno de hadas y otros seres fantásticos, reinaba la paz y la armonía. Las hadas eran seres libres y felices, capaces de realizar todo tipo de travesuras y hacer realidad los sueños de los mortales que creían en ellas.\n" +
                            "\n" +
                            "Sin embargo, un día, un malvado mago llegó a las tierras intermedias y comenzó a capturar a las hadas con el fin de utilizar su magia para aumentar su propio poder y convertirse en el hechicero supremo. Las hadas fueron encerradas en jaulas y perdieron su libertad y alegría.\n" +
                            "\n" +
                            "Pero en medio de la oscuridad, un héroe se alzó para salvar a las hadas y restaurar el equilibrio en las tierras intermedias. Un joven valiente y decidido que siempre había creído en la magia y la bondad en el mundo.");
                    JuegoHadas.jugar();
                    System.out.println("Fin del juego");
                    break;

                default:
                    System.out.println("Opción inválida, que es lo que quieres hacer?");
                    break;
            }return;
        }

    }
}
