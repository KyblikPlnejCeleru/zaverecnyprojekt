package Tests;

import mechanika.Hrac;
import mechanika.Predmet;
import org.junit.jupiter.api.Test;
import prikazy.Otevrit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test pro prikaz ohledne dohrani hry
 * @author romek studios
 */

class OtevritTest {

    @Test
    /**
     * Test pro prikaz ohledne dohrani hry
     */
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