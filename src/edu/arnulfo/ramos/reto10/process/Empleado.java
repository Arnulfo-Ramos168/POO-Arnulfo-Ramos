package edu.arnulfo.ramos.reto10.process;

/**

 Clase abstracta que define los atributos y métodos básicos de un empleado.
 */
public abstract class Empleado {
    //Atributos base
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int numTelefono;

    /**
     Constructor por defecto de la clase Empleado.
     */
    public Empleado(){

    }
    //Constructores
    /**
    Constructor de la clase Empleado que inicializa los atributos con los valores proporcionados.
    @param nombre El nombre del empleado.
    @param apellido1 El primer apellido del empleado.
    @param apellido2 El segundo apellido del empleado.
    @param numTelefono El número de teléfono del empleado.
*/
    public Empleado(String nombre, String apellido1, String apellido2, int numTelefono){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.numTelefono=numTelefono;
    }

    //Métodos

    /**
     Método abstracto que define la acción de trabajar para un empleado.
     */
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
