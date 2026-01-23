package prikazy;

import Hra.GameData;
import mechanika.Hrac;

public class InventarPrikaz implements Prikaz {

    private Hrac h;

    @Override
    public String konej(String vstup) {
        return h.vypisInventar();
    }

    @Override
    public boolean ukonceni() {
        return false;//TODO
    }
}

