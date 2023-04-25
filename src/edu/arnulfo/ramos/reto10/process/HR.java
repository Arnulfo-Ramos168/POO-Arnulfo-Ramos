package edu.arnulfo.ramos.reto10.process;

public class HR extends Empleado implements Interviewer {
    //Atributos
    private int personalSupervisado;
    //Constructores
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
