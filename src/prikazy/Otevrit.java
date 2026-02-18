package prikazy;

import mechanika.Hrac;


/**
 *Prikaz pro uspesne dohrani hry
 * @author romek studios
 */
public class Otevrit implements Prikaz {
    Hrac h;
private boolean konec;

    /**
     * Prikaz pro otevreni dveri a uspesneho dohrani hry
     * @param vstup nemusi nic
     * @return vraci text a nebo ukonci program
     */
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
        return konec;
    }
}
