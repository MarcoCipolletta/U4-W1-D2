package it.epicode.es1;

public class Es1 {
    public static boolean stringaPariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) return true;
                else return false;
            } else return true;

        } else return false;
    }
}
