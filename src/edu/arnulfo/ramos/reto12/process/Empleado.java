package edu.arnulfo.ramos.reto12.process;
/**
 //     * Atributos de la clase Empleado que permite crear un objeto con características específicas.
 //     *
 //     * @param nombre El nombre del empleado.
 //     * @param edad La edad del empleado.
 //     */
public abstract class Empleado{
private String nombre;
private int edad;
private String rfc;

//Constructores
public Empleado(String nombre, int edad, String rfc){
        this.nombre = nombre;
        this.edad = edad;
        this.rfc = rfc;
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

    public String getRfc() {
        return rfc;
    }
}