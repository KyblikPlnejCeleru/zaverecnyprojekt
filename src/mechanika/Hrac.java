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

    public ArrayList<Predmet> getInventar() {
        return inventar;
    }

    public void setInventar(ArrayList<Predmet> inventar) {
        this.inventar = inventar;
    }

    public int getPenize() {
        return penize;
    }

    public void setPenize(int penize) {
        this.penize = penize;
    }
}
