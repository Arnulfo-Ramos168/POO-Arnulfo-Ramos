package edu.arnulfo.ramos.reto10.process;

public class SrEngineer extends JrEngineer implements Interviewer {
    //atributos
    private int trabajosCompletados;
    //constructores

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

    @Override
    public void programar() {
        super.programar();
    }

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
