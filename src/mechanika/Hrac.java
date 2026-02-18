package mechanika;

import java.util.ArrayList;
import java.util.HashMap;

public class Hrac {
    private ArrayList<Predmet> inventar;
    private int penize;
    private Mistnost aktualniMistnost;

    @Override
    public String toString() {
        return "Hrac{" +
                "inventar=" + inventar +
                ", penize=" + penize +
                ", aktualniMistnost=" + aktualniMistnost +
                '}';
    }

    public Hrac() {
        this.inventar = new ArrayList<>();
        this.penize = 0;
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



    public int getPenize() {
        return penize;
    }

    public void setPenize(int penize) {
        this.penize = penize;
    }

    public boolean pridatPredmet(Predmet p){
        return inventar.add(p);
    }

    public ArrayList<Predmet> getInventar() {
        return inventar;
    }

    public void setInventar() {
        this.inventar = new ArrayList<>();
    }
    public boolean odeberPredmet(Predmet p){
       return inventar.remove(p);

    }
}
