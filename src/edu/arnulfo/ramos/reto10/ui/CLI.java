package edu.arnulfo.ramos.reto10.ui;
import edu.arnulfo.ramos.reto10.process.*;
public class CLI {
    public static void mostarMenu() {
        JrEngineer jr1 = new JrEngineer("Alejandro", "Ramirez", "Lopez", "Phyton, Java Strip, C", 333203123);
        SrEngineer sr1 = new SrEngineer("Santiago", "Ramirez", "Lopez", "Phyton, Java, Java Stript, C, C++, C#, PHP, R, Swift", 333213220, 83);
        Manager mng1 = new Manager("Fernando", "Ochoa", "Martinez", "Alpha", 335847684);
        CEO ceo1 = new CEO("Jessica", "Gonzales", "Ramos", "Global", 334861821, 2000);
        HR hr1 = new HR("Andrea", "Salcedo", "Ortiz", 524818624, 3027);

    }
}



