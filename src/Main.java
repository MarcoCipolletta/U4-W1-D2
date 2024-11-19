import it.epicode.es1.Es1;
import it.epicode.es2.Es2;
import it.epicode.es3.Es3;
import it.epicode.es4.Es4;

import java.util.Scanner;

public class Main {

public static Es1 es1 = new Es1();
public static Es2 es2 = new Es2();
public static Es3 es3 = new Es3();
public static Es4 es4 = new Es4();






    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Strigna Pari? " + es1.stringaPariDispari("Ciao"));
        System.out.println("Anno bisestile? " + es1.annoBisestile(2024));
        es2.stampaInLettere(scanner);
        es3.separaConVirgole(scanner);
        es4.contoAllaRovescia(scanner);

        scanner.close();
    }
}