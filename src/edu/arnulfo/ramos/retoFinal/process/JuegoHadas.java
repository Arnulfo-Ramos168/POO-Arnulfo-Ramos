package edu.arnulfo.ramos.retoFinal.process;

import javax.crypto.spec.PSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoHadas {
    public static void jugar() {
        Scanner scanner = new Scanner(System.in);
        int vidasHeroe = 10;
        int poderMago = 10;
        int hadasRescatadas = 0;
        while(vidasHeroe !=0 && poderMago != 0){
            System.out.println("TE HAS TOPADO CON UN OGRO!!");
            if (Math.round(Math.random() * 1) == 1){
                System.out.println("El heroe se enfrentra al ogro");
                if (Math.round(Math.random() * 1) == 1){
                    System.out.println("El heroe vencio al ogro! Rescataste un hada!");
                    vidasHeroe ++;
                    hadasRescatadas ++;
                    poderMago --;
                    System.out.println("Los puntos de vida del heroe han aumentado!!");
                    System.out.println("Puntos de vida: " + vidasHeroe);
                    System.out.println("Hadas Rescatadas: " + hadasRescatadas);
                    System.out.println("Poder del mago: " + poderMago);
                }else {
                    System.out.println("El ogro vencio al heroe! Ah perdido una vida!");
                    vidasHeroe --;
                    System.out.println("Los puntos de vida del heroe han disminuido!!");
                    System.out.println("Puntos de vida: " + vidasHeroe);
                }
            }else {
                System.out.println("El heroe huye y se retira");
            }
            if (Math.round(Math.random() * 1) == 1){
                System.out.println("El mago esta en busca de nuevas hadas!!");
                if (Math.round(Math.random() * 1) == 1){
                    System.out.println("El mago ah encontrado un hada!");
                    if(Math.round(Math.random() * 1) == 1){
                        System.out.println("EL MAGO CAPTURO AL HADA, SU PODER AH AUMENTADO!!");
                        poderMago ++;
                        System.out.println("Poder del mago: " + poderMago);
                    }else {
                        System.out.println("El hada logro escapar!!! Date prisa Heroe");
                        System.out.println("Poder del mago: " + poderMago);
                        if ((Math.random() * 1) == 1){
                            System.out.println("El hada huyo a un pueblo de hadas y el Mago la siguio!");
                            System.out.println("El mago ah arrasado la aldea, su poder aumenta enormemente!!");
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            poderMago ++;
                            System.out.println("Poder del mago: " + poderMago);
                        }
                    }
                }
            }
        }
        if (vidasHeroe == 0){
            System.out.println("El heroe ah sido derrotado... el caos en el reino de las hadas prevalecera hasta su extincion y el mago obtendra un poder supremo...\n...\n...\n...hasta que un nuevo heroe se alce");
        }
        if (poderMago == 0){
            System.out.println("El mago hace un grito lleno de furia, pues su poder ah sido disminuido a 0... \nAl quedarse sin ideas, el mago opta por usar su ultima carta bajo la manga y comienza a pronunciar las " +
                    "siguientes palabras:");
            System.out.println("Mago: De escamas, garras y fuego, hazme señor del cielo. ¡Transformación draconiana, encanto supremo!");
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("El mago emerge del suelo, transformado en una bestia de apariencia espelusnante de gran tamaño, unas alas que al aletear serian capaces de provocar enormes tornados, " +
                    "y un aliento tan ardiente capaz de derretir cualquier metal");
            System.out.println("El heroe, impactado por tal suceso cae al suelo de rodillas, sabe que no tiene el poder necesario para vencerlo...");
            System.out.println("");
            System.out.println("*Las nuves se apartan y dejan entrada al cielo, de este se logra apreciar una entidad quien al ver a nuestro heroe sin esperanzas decide apoyarlo en su lucha*");
            System.out.println("Kayle: Yo, Diosa de la justicia!! Te brindo a Espadafuego Celeste!!... Con esta arma seras capaz de alcanzar el nivel que necesitas para derrotarlo, lo demas esta en tus manos heroe!! Conviertete el salvador de las tierras intermedias!!");
            vidasHeroe = 10;
            int HPDragon = 50;
            System.out.println("Vidas del heroe: " + vidasHeroe);
            System.out.println("Vida del MagiDrago: " + HPDragon);

            while (vidasHeroe != 0 && HPDragon != 0){
                if (Math.round(Math.random() * 1) == 1){
                    if (Math.round(Math.random() * 1) == 1){
                        System.out.println("El heroe lanza ataca al dragon");
                        if (Math.round(Math.random() * 1) == 1){
                            System.out.println("Ah asertado el golpe en la cabeza, a sufrido un ataque critico!!!");
                            System.out.println("El dragon pierde -5 puntos de vida");
                            HPDragon --;
                            HPDragon --;
                            HPDragon --;
                            HPDragon --;
                            HPDragon --;
                            System.out.println("HP del Heroe: " + vidasHeroe);
                            System.out.println("HP del Dragon:" + HPDragon);
                        }else {
                            System.out.println("Ah asertado el golpe en el cuerpo!!");
                            System.out.println("El dragon pierde -1 puntos de vida");
                            HPDragon --;
                            System.out.println("HP del Heroe: " + vidasHeroe);
                            System.out.println("HP del Dragon:" + HPDragon);
                        }
                    }
                }else {
                    System.out.println("El dragon lanza un ataque!!");
                    if (Math.round(Math.random() * 1) == 1){
                        System.out.println("Ah asertado su ataque contra el heroe!");
                        System.out.println("El heroe pierde -1 puntos de vida");
                        vidasHeroe -- ;
                        System.out.println("HP del Heroe: " + vidasHeroe);
                        System.out.println("HP del Dragon:" + HPDragon);
                    }else {
                        System.out.println("El heroe ah evadido su ataque!!");
                    }
                }
            }
            if (vidasHeroe == 0){
                System.out.println("El heroe a muerto");
            }
            if (HPDragon == 0){
                System.out.println("El dragon ah sido derrotado... Las Tierras Intermedias finalmente han sido lobradas del caos, y nuestro heroe se alza como el salvador de este mundo");
            }
        }
    }
}
