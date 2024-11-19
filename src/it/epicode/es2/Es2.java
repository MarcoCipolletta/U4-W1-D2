package it.epicode.es2;


import java.util.Scanner;

public class Es2 {
    public static void stampaInLettere(Scanner scanner) {

        System.out.println("inserisci un numero intero");
        int n = scanner.nextInt();
        switch (n) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Numero non conosciuto");
        }
    }
}
