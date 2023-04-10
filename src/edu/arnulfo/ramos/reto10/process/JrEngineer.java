package edu.arnulfo.ramos.reto10.process;

public class JrEngineer extends Empleado implements Programmer {
    //Atributos
    private String lenguajesConocidos;

    //Constructores
    public JrEngineer(){

    }

    public JrEngineer(String nombre, String apellido1, String apellido2,String lenguajesConocidos, int numTelefono) {
        super(nombre, apellido1, apellido2, numTelefono);
        this.lenguajesConocidos = lenguajesConocidos;
    }
    //Métodos
    @Override
    public void trabajar() {

    }

    @Override
    public void programar() {

    }


    public String getLenguajesConocidos() {
        return lenguajesConocidos;
    }

    public void setLenguajesConocidos(String lenguajesConocidos) {
        this.lenguajesConocidos = lenguajesConocidos;
    }
}
