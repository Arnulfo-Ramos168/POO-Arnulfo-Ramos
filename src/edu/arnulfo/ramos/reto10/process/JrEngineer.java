package edu.arnulfo.ramos.reto10.process;

public class JrEngineer extends Empleado implements Programmer {
    //Atributos
    private String lenguajesConocidos;

    //Constructores
    public JrEngineer(){

    }

    public JrEngineer(String nombre, String apellido1, String apellido2,String lenguajesConocidos, int numTelefono) {
        super(nombre, apellido1, apellido2, numTelefono);
        this.lenguajesConocidos = lenguajesConocidos;
    }
    //Métodos
    @Override
    public void trabajar() {
        System.out.println("Trabaja como sabe");
    }

    //@Override
    //public int compareTo(Empleado empleado) {
       // return nombre2 - empleado.nombre2;
  //  }

    @Override
    public void programar() {
        System.out.println("Conoce algunos lenguajes");
    }


    public String getLenguajesConocidos() {
        return lenguajesConocidos;
    }

    public void setLenguajesConocidos(String lenguajesConocidos) {
        this.lenguajesConocidos = lenguajesConocidos;
    }
}
