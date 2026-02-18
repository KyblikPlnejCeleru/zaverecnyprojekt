package prikazy;

import mechanika.Hrac;

/**
 * Trida pro prikaz ohledne sbirani predmetu ktere jsou v mistnosti
 * @author romek studios
 */

public class Seber implements Prikaz {

Hrac h;

    /**
     * Prikaz ohledne sbirani predmetu ktere jsou v mistnosti
     * @param vstup nazev predmetu co chci sebrat
     * @return vraci text nebo chybu
     */
    @Override
    public String konej(String vstup) {
        for (int i = 0; i < h.getAktualniMistnost().getPredmety().size(); i++) {
            if (h.getAktualniMistnost().getPredmety().get(i).getNazev().contains(vstup)){
                h.pridatPredmet(h.getAktualniMistnost().getPredmety().get(i));
                h.getAktualniMistnost().getPredmety().get(i).getPopis();
                h.getAktualniMistnost().getPredmety().remove(h.getInventar().getLast());
                return "sebral jsi to";
            }
        }
        return "TOTO TU NENI! zkus"+h.getAktualniMistnost().getPredmety();
    }
    public Seber(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return false;//TODO
    }
}
