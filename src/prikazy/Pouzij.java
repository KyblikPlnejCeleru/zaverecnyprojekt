package prikazy;

import Hra.GameData;
import mechanika.Hrac;

public class Pouzij implements Prikaz {
Hrac h;
    @Override
    public String konej(String vstup) {
        for (int i = 0; i < h.getInventar().size(); i++) {
            if (h.getInventar().get(i).getNazev().equalsIgnoreCase(vstup)){
                if(h.getInventar().get(i).getNazev().equals(h.getAktualniMistnost().getPostavy().getVyzadovanyPredmet().getNazev())) {
                    h.odeberPredmet(h.getInventar().get(i));
                    h.getAktualniMistnost().getPostavy().getRada();
                    return "jaj pekny";
                }
                }
            }

        return "";
    }
    public Pouzij(Hrac h) {
        this.h = h;
    }



    @Override
    public boolean ukonceni() {
        return false;//TODO
    }
}
