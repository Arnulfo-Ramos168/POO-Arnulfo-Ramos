package edu.arnulfo.ramos.reto11.process;

/**
 en esta clase se establecen los atributos base que llevaran las clases
 a quien hereda la clase Empleado, en este caso a JrEngineer
 @author Arnulfo Ramos
 */
public abstract class Empleado {
    /**
    //     * Atributos de la clase Empleado que permite crear un objeto con características específicas.
    //     *
    //     * @param nombre El nombre del empleado.
    //     * @param edad La edad del empleado.
    //     */
    private String nombre;
    private int edad;

    //Constructores
    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Empleado() {

    }
    //Metodos
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public abstract void trabajar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

