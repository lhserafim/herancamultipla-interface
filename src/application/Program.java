package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

// O Java não permite a herança múltipla. Portanto é tratado com interface
public class Program {
    public static void main(String args[]) {

        ConcretePrinter p = new ConcretePrinter("2000");
        p.processDoc("My letter");
        p.print("My letter");
        System.out.println("");

        ConcreteScanner s = new ConcreteScanner("2001");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
        System.out.println("");

        ComboDevice c = new ComboDevice("2002");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
        System.out.println("");

        // Isso NÃO É herança múltipla pois NÃO HÁ REUSO
        // ComboDevice implementa as interfaces = cumpre o contrato

    }
}
