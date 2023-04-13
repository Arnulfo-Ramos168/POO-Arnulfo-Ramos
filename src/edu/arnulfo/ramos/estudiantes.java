package edu.arnulfo.ramos;
import java.util.Objects;
public class estudiantes extends Object {
    private String nombre;
    private int edad;
    private String matricula;

    public estudiantes(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public estudiantes(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof estudiantes that)) return false;
        return edad == that.edad && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    public estudiantes() {
    }

    public static void main(String[] args) {
        estudiantes mateo = new estudiantes();
        mateo.nombre = "fito";
        mateo.edad = 19;
        estudiantes rodolfo = new estudiantes();
        rodolfo.nombre = "fito";
        rodolfo.edad = 19;
        System.out.println(mateo.equals(rodolfo));
        System.out.println(mateo);
        System.out.println(rodolfo);
    }
}
