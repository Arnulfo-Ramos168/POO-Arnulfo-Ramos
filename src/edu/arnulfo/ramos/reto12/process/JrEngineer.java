package edu.arnulfo.ramos.reto12.process;

import edu.arnulfo.ramos.reto11.process.Empleado;

//Esta clase hereda metodos y atributos de la clase Empleado
public class JrEngineer extends Empleado {
    //Atributos
    public String RFC;

    //Constructores
    public JrEngineer(String nombre, int edad, String RFC){
        super(nombre, edad);
        this.RFC = RFC;
    }

    public JrEngineer(String objeto, String nombre, int edad, String RFC) {
        super();
    }

    //
    @Override
    public String toString() {
        return super.toString();
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public void trabajar() {

    }
}
