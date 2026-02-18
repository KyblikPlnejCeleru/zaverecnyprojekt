package prikazy;

import Hra.GameData;
import mechanika.Hrac;

public class InventarPrikaz implements Prikaz {

    private Hrac h;

    @Override
    public String konej(String vstup) {
        if (h.getInventar()==null){
            return "nic nemas";
        } else if (h.getInventar().isEmpty()) {
            return "nic nemas";
        }
        return h.vypisInventar();
    }


    public InventarPrikaz(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return false;//TODO
    }
}

