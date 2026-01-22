package prikazy;

import Hra.GameData;
import mechanika.Hrac;

public class Jdi implements Prikaz {

    private GameData hra;
    private Hrac hrac;

    @Override


    public String execute(String vstup) {
        for (int i = 0; i < hra.getLocations().size(); i++) {
            if (hra.getLocations().get(i).getNazev().contains(vstup.toLowerCase().trim())) {
                if (hrac.getAktualniMistnost().getVstupy().contains(hra.getLocations().get(i).getId())) {
                    hrac.setAktualniMistnost(hra.getLocations().get(i));
                    System.out.println("Aktualni mistnost " + hrac.getAktualniMistnost());
                }
            }
        }
        return "";//TODO
    }

    public Jdi(GameData hra, Hrac hrac) {
        this.hra = hra;
        this.hrac = hrac;
    }

    @Override
    public boolean exit() {
        return false;//TODO
    }
}