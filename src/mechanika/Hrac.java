package mechanika;

import java.util.ArrayList;
import java.util.HashMap;

public class Hrac {
    private HashMap<String,Predmet> inventar;
    private int penize;
    private Mistnost aktualniMistnost;

    public Hrac() {
        // TODO
    }


    public void uberVec(String nazev) {
        // TODO
    }

    public String vypisInventar() {
        return inventar.toString();
    }

    public boolean maKartu() {
        // TODO
        return false;
    }

    public void setAktualniMistnost(Mistnost aktualniMistnost) {
        this.aktualniMistnost = aktualniMistnost;
    }

    public Mistnost getAktualniMistnost() {
        return aktualniMistnost;
    }

    public HashMap<String, Predmet> getInventar() {
        return inventar;
    }

    public void setInventar(HashMap<String, Predmet> inventar) {
        this.inventar = inventar;
    }

    public int getPenize() {
        return penize;
    }

    public void setPenize(int penize) {
        this.penize = penize;
    }

    public boolean pridatPredmet(Predmet p){
        inventar.put(Integer.toString(inventar.size()),p);
    }
}
