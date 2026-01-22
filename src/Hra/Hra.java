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
        h.setAktualniMistnost(data.getLocations().getFirst());
        k.inicializatorPrikazu(data, h);
        do {
            k.execute();
        }while (!konec);
        // TODO dodelat konec smycky
    }

    private void vytvorSvet() {
        // TODO
    }

    public String vstup(String radek) {
        // TODO
        return "";
    }

    public boolean jeKonec() {
        // TODO kontrola
        return false;
    }
}
