package prikazy;

import mechanika.Hrac;
import mechanika.Predmet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtevritTest {

    @Test
    void konej() {
        Hrac h = new Hrac();
        Otevrit ot = new Otevrit(h);
        h.pridatPredmet(new Predmet("denisvesely"));
        ot.konej("dobrydenhodnestestiskontrolou");
        assertTrue(!ot.ukonceni());
        h.pridatPredmet(new Predmet("kartakodchodu"));
        ot.konej("chtelobytobagetu");
        assertTrue(ot.ukonceni());


    }

}