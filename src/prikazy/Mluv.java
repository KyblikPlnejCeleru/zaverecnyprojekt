package prikazy;

import Hra.GameData;
import mechanika.Hrac;

import java.util.Locale;

public class Mluv implements Prikaz {
    GameData g;
    Hrac h;
    @Override
    public String konej(String vstup) {
        for (int i = 0; i <h.getAktualniMistnost().getPostavy().size() ; i++) {
            if (h.getAktualniMistnost().getPostavy().equals(vstup.toLowerCase().trim())){
                return h.getAktualniMistnost().getPostavy().get(i).mluv();
            }
        }return "";
    }

    @Override
    public boolean ukonceni() {
        return false; //TODO
    }
}
