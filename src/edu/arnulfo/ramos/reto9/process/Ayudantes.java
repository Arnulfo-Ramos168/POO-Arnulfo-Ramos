package edu.arnulfo.ramos.reto9.process;
import java.util.Random;
public class Ayudantes {
    private int numOjos;
    private String colorPiel;
    private String altura;
    private int nivelObjetos;
    private int arreglarCosas;
    private int destructivo;

    public Ayudantes(int numOjos, String colorPiel, String altura, int nivelObjetos, int arreglarCosas, int destructivo){
        this.numOjos = numOjos;
        this.colorPiel = colorPiel;
        this.altura = altura;
        this.nivelObjetos = nivelObjetos;
        this.arreglarCosas = arreglarCosas;
        this.destructivo = destructivo;
    }

    public int getNumOjos() {
        return numOjos;
    }

    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getNivelObjetos() {
        return nivelObjetos;
    }

    public void setNivelObjetos(int nivelObjetos) {
        this.nivelObjetos = nivelObjetos;
    }

    public int getArreglarCosas() {
        return arreglarCosas;
    }

    public void setArreglarCosas(int arreglarCosas) {
        this.arreglarCosas = arreglarCosas;
    }

    public int getDestructivo() {
        return destructivo;
    }

    public void setDestructivo(int destructivo) {
        this.destructivo = destructivo;
    }

    public Ayudantes (){
        Random random = new Random();
        this.numOjos = random.nextInt(2) + 1;
        this.colorPiel = random.nextBoolean() ? "amarillo" : "morado";
        this.altura = random.nextBoolean() ? "mediano" : "alto";
        this.nivelObjetos = random.nextInt(5) + 1;
        this.arreglarCosas = random.nextInt(5) + 1;
        this.destructivo = random.nextInt(5) + 1;
    }
    public void mostrarCaracteristicas(){
        System.out.println("Ayudante:");
        System.out.println("Numero de ojos:" + numOjos);
        System.out.println("Color de piel:" + colorPiel);
        System.out.println("Altura:" + altura);
        System.out.println("Nivel de creacion de objetos:" + nivelObjetos);
        System.out.println("Nivel para arreglar cosas" + arreglarCosas);
        System.out.println("Nivel de destruccion:" + destructivo);
    }
}