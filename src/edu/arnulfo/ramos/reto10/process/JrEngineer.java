package edu.arnulfo.ramos.reto10.process;

/**
 Clase JrEngineer que extiende de Empleado e implementa la interfaz Programmer.

 Contiene los atributos y métodos propios de un ingeniero junior.
 */
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

    /**
     Método sobreescrito de la interfaz Programmer.
     Define la acción de programar para el JrEngineer.
     */
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
