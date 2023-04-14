package edu.arnulfo.ramos.reto10.process;

/**
 Clase Manager que extiende de la clase Empleado e implementa la interfaz Interviewer.

 Representa a un gerente que trabaja en una empresa y es capaz de realizar entrevistas.
 */
public class Manager extends Empleado implements Interviewer{
    //Atributos
    /**
Atributo que representa el sector en el que trabaja el gerente.
*/
    public String sector;

    /**
     Constructor vacío de la clase Manager.
     */
    public Manager(){
    }

    public Manager(String nombre, String apellido1, String apellido2, String sector, int numTelefono) {
        super(nombre, apellido1, apellido2, numTelefono);
        this.sector=sector;
    }
    //metodos
    @Override
    public void trabajar() {

    }

    /**
     Método sobreescrito de la interfaz Interviewer que define la tarea de entrevistar del gerente.
     */
    @Override
    public void Entrevistar() {

    }

    public String getSector(){
        return sector;
    }
    public void setSector(String sector){
        this.sector=sector;
    }
}
