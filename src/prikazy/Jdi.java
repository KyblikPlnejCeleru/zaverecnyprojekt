package prikazy;

import Hra.GameData;
import mechanika.Hrac;

public class Jdi implements Prikaz {

    private GameData hra;
    private Hrac hrac;

    @Override

/**
 * prochazeni mezi mistnostma
 * @param vstup nazev mistnosti kam ten uzivatel chce jit
 */
    public String konej(String vstup) {
        for (int i = 0; i < hra.getLocations().size(); i++) {
            if (hra.getLocations().get(i).getNazev().contains(vstup.toLowerCase().trim())) {
                if (hrac.getAktualniMistnost().getVstupy().contains(hra.getLocations().get(i).getId())) {
                    hrac.setAktualniMistnost(hra.getLocations().get(i));
                    System.out.println("Aktualni mistnost " + hrac.getAktualniMistnost());
                }
            }
        }
        return "kouzlo";
    }

    public Jdi(GameData hra, Hrac hrac) {
        this.hra = hra;
        this.hrac = hrac;
    }

    @Override
    public boolean ukonceni() {
        return false;//TODO
    }
}