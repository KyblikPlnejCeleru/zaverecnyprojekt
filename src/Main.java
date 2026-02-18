import Hra.Hra;
import prikazy.Jdi;


/**
 * Hlavni trida, ktera spousti celou hru.
 * @author romek studios
 */
public class Main {
    /**
     * Hlavni metoda, ktera se vola pri startu programu.
     * Vytvori novou instanci hry a spusti ji.
     */
    public static void main(String[] args) {
//testovaci veci {po spusteni hry napiste jdi {mistnost} mistnosti jsou ulozene v jsonu
        Hra hra = new Hra();
        hra.spusti();

    }
}