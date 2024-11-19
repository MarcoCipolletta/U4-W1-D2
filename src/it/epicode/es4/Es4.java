package it.epicode.es4;

import java.util.Scanner;

public class Es4 {
    public void contoAllaRovescia(Scanner scanner){
        System.out.println("Inserisci un numero per il timer");
        int timer = scanner.nextInt();
        for (int i = timer; i >= 0; i-- ){
            System.out.println(i);
        }

    }
}
