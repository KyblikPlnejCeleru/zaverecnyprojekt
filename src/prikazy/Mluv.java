package prikazy;

import Hra.GameData;
import mechanika.Hrac;

import java.util.Locale;

public class Mluv implements Prikaz {
    Hrac h;
    @Override
    public String konej(String vstup) {
        for (int i = 0; i <h.getAktualniMistnost().getPostavy().size() ; i++) {
            if (h.getAktualniMistnost().getPostavy().equals(vstup.toLowerCase().trim())){
                return h.getAktualniMistnost().getPostavy().get(i).mluv();
            }
        }return "";
    }

    public Mluv(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return false; //TODO
    }
}
