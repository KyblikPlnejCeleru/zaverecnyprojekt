package prikazy;

import Hra.GameData;
import mechanika.Hrac;

public class Jdi implements Prikaz {

    private GameData hra;
    private Hrac hrac;

    @Override


    public String execute(String vstup) {
        for (int i = 0; i < hra.getLocations().size(); i++) {
        if (vstup.contains(hra.getLocations().get(i).getNazev())){
         hrac.setAktualniMistnost(hra.getLocations().get(i));
        }
        }
        return "";//TODO
    }

    public Jdi(GameData hra, Hrac hrac) {
        this.hra = hra;
        this.hrac=hrac;
    }

    @Override
    public boolean exit() {
        return false;//TODO
    }
}