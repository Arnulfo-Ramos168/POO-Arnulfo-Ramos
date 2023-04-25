package edu.arnulfo.ramos.reto11.process;

import edu.arnulfo.ramos.reto11.process.Empleado;

//Esta clase hereda metodos y atributos de la clase Empleado
public class JrEngineer extends Empleado {
    //Atributos
    public int lenguajesAprendidos;

    //Constructores
    public JrEngineer(String nombre, int edad, int lenguajesAprendidos){
        super(nombre, edad);
        this.lenguajesAprendidos = lenguajesAprendidos;
    }

    public JrEngineer() {
        super();
    }

//
    @Override
    public String toString() {
        return super.toString();
    }

    public int getLenguajesAprendidos() {
        return lenguajesAprendidos;
    }

    public void setLenguajesAprendidos(int lenguajesAprendidos) {
        this.lenguajesAprendidos = lenguajesAprendidos;
    }

    @Override
    public void trabajar() {

    }
}
