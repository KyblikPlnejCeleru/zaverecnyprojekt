package prikazy;

import mechanika.Hrac;

public class Otevrit implements Prikaz {
    Hrac h;

    @Override
    public String konej(String vstup) {
        for (int i = 0; i <h.getInventar().size() ; i++) {
            if (h.getInventar().get(i).getNazev().contains("kartakodchodu")){
                ukonceni();
            }
        }

        return "";
    }

    public Otevrit(Hrac h) {
        this.h = h;
    }

    @Override
    public boolean ukonceni() {
        return true;//TODO
    }
}
