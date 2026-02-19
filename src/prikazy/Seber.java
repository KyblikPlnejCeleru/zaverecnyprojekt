package prikazy;

import Hra.GameData;
import mechanika.Hrac;

/**
 * Trida pro prikaz ohledne sbirani predmetu ktere jsou v mistnosti
 * @author romek studios
 */

public class Seber implements Prikaz {

Hrac h;
GameData g;

    /**
     * Prikaz ohledne sbirani predmetu ktere jsou v mistnosti
     * @param vstup nazev predmetu co chci sebrat
     * @return vraci text nebo chybu
     */
    @Override
    public String konej(String vstup) {
        for (int i = 0; i < h.getAktualniMistnost().getPredmety().size(); i++) {
            if (h.getAktualniMistnost().getPredmety().get(i).getNazev().equalsIgnoreCase(vstup)&& !(h.getAktualniMistnost().equals(g.getMistnosti().getLast()))){
                h.pridatPredmet(h.getAktualniMistnost().getPredmety().get(i));
                h.getAktualniMistnost().getPredmety().get(i).getPopis();
                h.getAktualniMistnost().getPredmety().remove(h.getInventar().getLast());
                return "sebral jsi to";
            }else if (h.getAktualniMistnost().equals(g.getMistnosti().getLast())&&h.getAktualniMistnost().getPredmety().get(i).getNazev().equalsIgnoreCase(vstup)&&h.getPenize()>=40) {
                h.setPenize(h.getPenize() - 40);
                h.pridatPredmet(h.getAktualniMistnost().getPredmety().get(i));
                h.getAktualniMistnost().getPredmety().get(i).getPopis();
                h.getAktualniMistnost().getPredmety().remove(h.getInventar().getLast());
                return "koupil sis bagetku bro";
            } else if (h.getAktualniMistnost().equals(g.getMistnosti().getLast())&&h.getAktualniMistnost().getPredmety().get(i).getNazev().equalsIgnoreCase(vstup)&& !(h.getPenize() >=40)) {
                return "bageta stoji 40kc a ty mas "+ h.getPenize()+ " , zkus odevzdat vic predmetu postavam";
            }
        }
        return "TOTO TU NENI! zkus"+h.getAktualniMistnost().getPredmety();
    }
    public Seber(Hrac h, GameData g) {
        this.h = h;
        this.g = g;
    }

    @Override
    public boolean ukonceni() {
        return false;//TODO
    }
}
