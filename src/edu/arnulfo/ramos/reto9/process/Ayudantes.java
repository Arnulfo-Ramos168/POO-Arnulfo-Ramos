package edu.arnulfo.ramos.reto9.process;
import java.util.Random;
/**
 * La clase Ayudantes seencarga de generar ayudantes de manera aleagoria con un rango de caracteristicas
 * las cuales tambien son seleccionadas de manera aleatoria para cada ayudante generado
 */
public class Ayudantes {
    private int numOjos;
    private String colorPiel;
    private String altura;
    private int nivelObjetos;
    private int arreglarCosas;
    private int destructivo;

    /**
     * Constructor de la clase Ayudantes que permite crear un objeto con características específicas.
     *
     * @param numOjos El número de ojos del ayudante.
     * @param colorPiel El color de piel del ayudante.
     * @param altura La altura del ayudante.
     * @param nivelObjetos El nivel de creación de objetos del ayudante.
     * @param arreglarCosas El nivel para arreglar cosas del ayudante.
     * @param destructivo El nivel de destrucción del ayudante.
     */
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
    /**

     Constructor de la clase Ayudantes que genera un nuevo ayudante con características aleatorias.
     Utiliza la clase Random de Java para generar valores aleatorios para cada una de las características del ayudante.
     @param numOjos El número de ojos del ayudante, debe ser un número entero entre 1 y 2.
     @param colorPiel El color de piel del ayudante, debe ser "amarillo" o "morado".
     @param altura La altura del ayudante, debe ser "mediano" o "alto".
     @param nivelObjetos El nivel de creación de objetos del ayudante, debe ser un número entero entre 1 y 5.
     @param arreglarCosas El nivel para arreglar cosas del ayudante, debe ser un número entero entre 1 y 5.
     @param destructivo El nivel de destrucción del ayudante, debe ser un número entero entre 1 y 5.
     */
    public Ayudantes (){
        Random random = new Random();
        this.numOjos = random.nextInt(2) + 1;
        this.colorPiel = random.nextBoolean() ? "amarillo" : "morado";
        this.altura = random.nextBoolean() ? "mediano" : "alto";
        this.nivelObjetos = random.nextInt(5) + 1;
        this.arreglarCosas = random.nextInt(5) + 1;
        this.destructivo = random.nextInt(5) + 1;
    }
    /**

     Este método muestra las características del ayudante.
     Muestra el número de ojos, color de piel, altura, nivel de creación de objetos,
     nivel para arreglar cosas y nivel de destrucción del ayudante.
     */
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