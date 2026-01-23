package prikazy;

import Hra.GameData;
import mechanika.Hrac;

public class Pouzij implements Prikaz {
Hrac h;
    @Override
    public String konej(String vstup) {
        for (int i = 0; i < h.getInventar().size(); i++) {
            if (h.getInventar().get(i).getNazev().equalsIgnoreCase(vstup)){
                for (int j = 0; j < h.getAktualniMistnost().getPostavy().size(); j++) {
                if(h.getInventar().get(i).equals(h.getAktualniMistnost().getPostavy().get(i).getVyzadovanyPredmet())) {
                    h.odeberPredmet(h.getInventar().get(i));
                    return "jaj pekny";
                }
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
