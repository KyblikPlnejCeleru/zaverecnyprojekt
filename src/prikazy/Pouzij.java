package prikazy;

import Hra.GameData;
import mechanika.Hrac;

/**
 * Trida prikazu pro pouziti predmetu
 * @author romek studios
 */
public class Pouzij implements Prikaz {


Hrac h;

    /**
     * Prikaz pro pouziti predmetu
     * @param vstup nazev predmetu
     * @return bud-li napovedu nebo chybu
     */
    @Override
    public String konej(String vstup) {
        for (int i = 0; i < h.getInventar().size(); i++) {
            if (h.getInventar().get(i).getNazev().equalsIgnoreCase(vstup)){
                if(h.getInventar().get(i).getNazev().equals(h.getAktualniMistnost().getPostavy().getVyzadovanyPredmet().getNazev())) {
                    h.odeberPredmet(h.getInventar().get(i));
                    h.pridatPrachy();
                    return h.getAktualniMistnost().getPostavy().getRada()+" dostal jsi 10kc.";
                }
                }
            }
        return "nemas to co chce ";
    }
    public Pouzij(Hrac h) {
        this.h = h;
    }



    @Override
    public boolean ukonceni() {
        return false;
    }
}
