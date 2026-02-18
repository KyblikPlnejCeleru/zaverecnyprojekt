package prikazy;

import Hra.GameData;
import mechanika.Hrac;

import java.util.Arrays;

/**
 * Trida prikazu pro chozeni mezi mistnostma
 * @author romek studios
 */

public class Jdi implements Prikaz {

    private GameData hra;
    private Hrac hrac;


    @Override

/**
 * Prikaz pro prochazeni mezi mistnostma
 * @param vstup nazev mistnosti kam ten uzivatel chce jit
 */
    public String konej(String vstup) {
        for (int i = 0; i < hra.getLocations().size(); i++) {
            if (hra.getLocations().get(i).getNazev().contains(vstup.toLowerCase().trim())) {
                if (hrac.getAktualniMistnost().getVstupy().contains(hra.getLocations().get(i).getId())) {
                    hrac.setAktualniMistnost(hra.getLocations().get(i));
                    return "Aktualni mistnost "+ hrac.getAktualniMistnost();
                }
            }
        }
        String[] vs = new String[hrac.getAktualniMistnost().getVstupy().size()];
        for (int i = 0; i <hrac.getAktualniMistnost().getVstupy().size() ; i++) {
            vs[i]=hra.getLocations().get(i).getNazev();
        };
        return "bohuzel tam nelze jit, zkus tyhle mistnosti" + Arrays.toString(vs);
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