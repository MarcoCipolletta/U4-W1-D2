package it.epicode.es3;

import java.util.Scanner;

public class Es3 {
    public void separaConVirgole(Scanner scanner){


    while (true){
        System.out.println("Scrivi una stringa o ':q' per terminare");
    String stringa = scanner.nextLine();
    if (stringa.equals(":q")){
        break;
    }
   String[] caratteri = stringa.split("");
        System.out.println(String.join("," , caratteri));

    }


    }
}
