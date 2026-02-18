package prikazy;

import Hra.GameData;
import mechanika.Hrac;

/**
 * Prikaz pro vypsani inventare
 * @author romek studios
 */

public class InventarPrikaz implements Prikaz {

    private Hrac h;

    /**
     * Prikay pro vypsani inventare
     * @param vstup nemusi byt vubec nic
     * @return vypise inventar
     */

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

