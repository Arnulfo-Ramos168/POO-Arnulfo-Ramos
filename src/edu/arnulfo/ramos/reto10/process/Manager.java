package edu.arnulfo.ramos.reto10.process;

public class Manager extends Empleado implements Interviewer{
    //Atributos
    public String sector;
    public Manager(){
    }

    public Manager(String nombre, String apellido1, String apellido2, String sector, int numTelefono) {
        super(nombre, apellido1, apellido2, numTelefono);
        this.sector=sector;
    }
    //metodos
    @Override
    public void trabajar() {

    }

    @Override
    public void Entrevistar() {

    }

    public String getSector(){
        return sector;
    }
    public void setSector(String sector){
        this.sector=sector;
    }
}
