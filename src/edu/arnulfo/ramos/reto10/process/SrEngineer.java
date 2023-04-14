package edu.arnulfo.ramos.reto10.process;

/**

 La clase SrEngineer representa a un ingeniero de software senior, que hereda de la clase JrEngineer y

 implementa la interfaz Interviewer.

 @author Arnulfo Ramos

 */
public class SrEngineer extends JrEngineer implements Interviewer {
    //atributos
    private int trabajosCompletados;
    // El número de trabajos completados por el ingeniero senior

    //constructores
    /**

     Constructor sin argumentos que llama al constructor sin argumentos de la superclase (JrEngineer).
     */
    public SrEngineer() {
        super();
    }

    public SrEngineer(String nombre, String apellido1, String apellido2, String lenguajesConocidos, int numTelefono, int trabajosCompletados) {
        super(nombre, apellido1, apellido2, lenguajesConocidos, numTelefono);
        this.trabajosCompletados = trabajosCompletados;
    }
    //métodos

    @Override
    public void trabajar() {
        super.trabajar();
    }

    /**
     Sobrescribe el método "programar" de la clase JrEngineer para llamar al método "programar" de la superclase.
     */
    @Override
    public void programar() {
        super.programar();
    }

    /**
     Implementa el método "Entrevistar" de la interfaz Interviewer.
     */
    @Override
    public void Entrevistar() {

    }

    public int getTrabajosCompletados() {
        return trabajosCompletados;
    }

    public void setTrabajosCompletados(int trabajosCompletados) {
        this.trabajosCompletados = trabajosCompletados;
    }
}
