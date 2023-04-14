package edu.arnulfo.ramos.reto10.process;

/**
 Esta clase representa un empleado en el área de Recursos Humanos (RH) que es capaz de entrevistar a candidatos para puestos de trabajo.

 Hereda de la clase Empleado y también implementa la interfaz Interviewer.
 */
public class HR extends Empleado implements Interviewer {
    //Atributos
    private int personalSupervisado;

    //Constructores

    /**
     Constructor por defecto sin parámetros.
     */
    public HR() {

    }

    public HR(String nombre, String apellido1, String apellido2, int numTelefono, int personalSupervisado) {
        super(nombre, apellido1, apellido2, numTelefono);
        this.personalSupervisado=personalSupervisado;
    }
    //Métodos
    @Override
    public void trabajar() {

    }

    /**
     Este método implementa la interfaz Interviewer, pero no tiene implementación en esta clase. Debe ser sobrescrito en una subclase para definir la lógica de la entrevista.
     */
    @Override
    public void Entrevistar() {

    }

    public int getPersonalSupervisado() {
        return personalSupervisado;
    }

    public void setPersonalSupervisado(int personalSupervisado) {
        this.personalSupervisado = personalSupervisado;
    }
}
