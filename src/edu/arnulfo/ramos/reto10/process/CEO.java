package edu.arnulfo.ramos.reto10.process;

import java.util.List;

public class CEO extends Manager {
    private int numEmpleados;
    public CEO(){

    }
    public CEO(String nombre, String apellido1, String apellido2, String sector, int numTelefono, int numEmpleados) {
        super(nombre, apellido1, apellido2, sector, numTelefono);
        this.numEmpleados=numEmpleados;
    }

    @Override
    public void trabajar() {
        super.trabajar();
    }

    @Override
    public void Entrevistar() {
        super.Entrevistar();
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }
}
