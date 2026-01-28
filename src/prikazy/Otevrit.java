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
                break;
            }
        }

        return "";
    }

    public Otevrit(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return konec;//TODO
    }
}
