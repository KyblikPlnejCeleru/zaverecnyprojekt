package prikazy;

import mechanika.Hrac;

public class Otevrit implements Prikaz {
    Hrac h;
private boolean konec;

    @Override
    public String konej(String vstup) {
        for (int i = 0; i <h.getInventar().size() ; i++) {
            if (h.getInventar().get(i).getNazev().contains("kartakodchodu")) {
                konec = true;
                return "dobra prace konec hry bageta je mozna odmena";
            }
        }
        return "nemas kartu";
    }


    public Otevrit(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return konec;//TODO
    }
}
