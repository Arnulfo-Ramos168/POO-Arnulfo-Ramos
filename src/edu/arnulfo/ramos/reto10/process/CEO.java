package edu.arnulfo.ramos.reto10.process;

import java.util.List;

/**
 La clase CEO representa al jefe ejecutivo de la empresa que extiende de la clase Manager.

 Contiene el número de empleados a su cargo.
 */
public class CEO extends Manager {
    private int numEmpleados;

    /**
     Constructor vacío de la clase CEO.
     */
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

    /**
     Método sobreescrito que representa al CEO entrevistando a un candidato.
     */
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
