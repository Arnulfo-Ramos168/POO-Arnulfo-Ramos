package edu.arnulfo.ramos.practicas;

public class Programmer extends Empleado{
    public Programmer(String nombre, String apellido1, String apellido2, int matricula, int edad) {
        super(nombre, apellido1, apellido2, matricula, edad);
    }

    @Override
    public void trabajar() {

    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellido1() {
        return super.getApellido1();
    }

    @Override
    public void setApellido1(String apellido1) {
        super.setApellido1(apellido1);
    }

    @Override
    public String getApellido2() {
        return super.getApellido2();
    }

    @Override
    public void setApellido2(String apellido2) {
        super.setApellido2(apellido2);
    }

    @Override
    public int getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setMatricula(int matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }
}
