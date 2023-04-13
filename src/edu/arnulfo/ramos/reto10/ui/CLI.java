package edu.arnulfo.ramos.reto10.ui;
import edu.arnulfo.ramos.reto10.process.*;
public class CLI    {
    public static void mostarMenu() {
        JrEngineer jr1 = new JrEngineer("Alejandro", "Ramirez", "Lopez","Phyton, Java Strip, C", 333203123);
        SrEngineer sr1 = new SrEngineer("Santiago", "Ramirez", "Lopez", "Phyton, Java, Java Stript, C, C++, C#, PHP, R, Swift", 333213220, 83);
        Manager mng1 = new Manager("Fernando", "Ochoa", "Martinez", "Alpha", 335847684);
        CEO ceo1 = new CEO("Jessica", "Gonzales", "Ramos", "Global", 334861821, 2000);
        HR hr1 = new HR("Andrea", "Salcedo", "Ortiz", 524818624, 3027 );


        testEmpleado(jr1);
        testEmpleado(sr1);
        testEmpleado(mng1);
        testEmpleado(ceo1);
        testEmpleado(hr1);
        System.out.println();

        testProgrammer(jr1);
        testProgrammer(sr1);
        testProgrammer(mng1);
        testProgrammer(ceo1);
        testProgrammer(hr1);
        System.out.println();

        testInterviewer(jr1);
        testInterviewer(sr1);
        testInterviewer(mng1);
        testInterviewer(ceo1);
        testInterviewer(hr1);


    }
    public static void testEmpleado(Object object){
        if (object instanceof Empleado){
            System.out.println("El sujeto es un empleado: " + "" + object.getClass().getSimpleName());
        } else {
            System.out.println("El sujeto no es un empleado: " + "" + object.getClass().getSimpleName());
        }
    }
    public static void testProgrammer(Object object){
        if (object instanceof Programmer){
            System.out.println("El empleado es un programador: " + "" + object.getClass().getSimpleName());
        } else {
            System.out.println("El empleado no es un programador: " + "" + object.getClass().getSimpleName());
        }
    }

    public static void testInterviewer(Object object){
        if (object instanceof Interviewer){
            System.out.println("El empleado es un entrevistador: " + "" + object.getClass().getSimpleName());
        } else {
            System.out.println("El empleado no es un entrevistador: " + "" + object.getClass().getSimpleName());
        }
    }
}
