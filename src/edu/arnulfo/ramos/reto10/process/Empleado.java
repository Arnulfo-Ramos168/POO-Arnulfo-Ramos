package edu.arnulfo.ramos.reto10.process;

public abstract class Empleado{

    //Atributos base
    private String nombre;
    String nombre2;
    private String apellido1;
    private String apellido2;
    private int numTelefono;
    public Empleado(){

    }
    //Constructores
    public Empleado(String nombre, String apellido1, String apellido2, int numTelefono){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.numTelefono=numTelefono;
    }
    //Métodos
    public abstract void trabajar();

    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public int getNumTelefono(){
        return numTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
}
