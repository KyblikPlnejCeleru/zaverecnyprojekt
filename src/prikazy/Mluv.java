package prikazy;

import Hra.GameData;
import mechanika.Hrac;

import java.util.Locale;

/**
 * Trida prikazu pro mluveni s Postavy
 * @author romek studios
 */
public class Mluv implements Prikaz {
    Hrac h;

    /**
     * Prikaz ohledne mluveni s Postavy
     * @param vstup
     * @return vraci bud dialog nebo jmena ostatnich postav v mistnosti
     */
    @Override
    public String konej(String vstup) {
            if (h.getAktualniMistnost().getPostavy()!=null&&h.getAktualniMistnost().getPostavy().getJmeno().toLowerCase().trim().equals(vstup.toLowerCase().trim())){
                return h.getAktualniMistnost().getPostavy().mluv();
        }return "NENI MOZNY, zkus "+h.getAktualniMistnost().getPostavy().getJmeno();
    }


    public Mluv(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return false; //TODO
    }
}
