package mechanika;

import java.util.ArrayList;

public class Hrac {
    private ArrayList<Predmet> inventar;
    private int penize;
    private Mistnost aktualniMistnost;

    public Hrac() {
        // TODO
    }

    public void pridejVec(Predmet vec) {
        // TODO
    }

    public void uberVec(String nazev) {
        // TODO
    }

    public String vypisInventar() {
        // TODO
        return "";
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
}
