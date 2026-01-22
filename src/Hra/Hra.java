package Hra;

import mechanika.Hrac;
import prikazy.Jdi;

public class Hra {
    private Hrac hrac;
    private boolean konec;

    //Nacte game data hrace a spusti hru
    public void spusti() {
        GameData data = GameData.loadGameDataFromResources("res/GameData.json");
        Konzole k = new Konzole();
        Hrac h = new Hrac();
        h.setAktualniMistnost(data.getLocations().getFirst());
        k.inicializatorPrikazu(data, h);
        k.execute();
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
