package prikazy;

import mechanika.Hrac;

public class Seber implements Prikaz {

Hrac h;
    @Override
    public String konej(String vstup) {
        for (int i = 0; i < h.getAktualniMistnost().getPredmety().size(); i++) {
            if (h.getAktualniMistnost().getPredmety().get(i).getNazev().contains(vstup)){
                h.pridatPredmet(h.getAktualniMistnost().getPredmety().get(i));
                h.getAktualniMistnost().getPredmety().remove(h.getInventar().getLast());
            }
        }
        return "sebral jsi to";
    }
    public Seber(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return false;//TODO
    }
}
