package Hra;

import mechanika.Hrac;
import prikazy.Jdi;

public class Hra {
    private Hrac hrac;
    private boolean konec;


    /**
     * Spusti hru a vyporada se se smyckou
     */
    public void spusti() {
        GameData data = GameData.loadGameDataFromResources("res/GameData.json");
        Konzole k = new Konzole();
        Hrac h = new Hrac();
        h.setInventar();
        h.setAktualniMistnost(data.getLocations().getFirst());
        k.inicializatorPrikazu(data, h);
        do {
            k.execute();
        }while (!k.getPrikazy().get("otevrit").ukonceni());
    }


    public String vstup(String radek) {
        // TODO
        return "";
    }
}
