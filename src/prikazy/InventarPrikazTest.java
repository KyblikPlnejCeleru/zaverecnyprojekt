package prikazy;

import mechanika.Hrac;
import mechanika.Predmet;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test prikazu pro vypsani inventare
 * @author romek studios
 */
class InventarPrikazTest {


    Hrac h = new Hrac();

    /**
     * Test prikazu pro vypsani inventare
     */
    @Test
    void konej() {
        InventarPrikaz in = new InventarPrikaz(h);
        assertEquals("nic nemas",in.konej(" "));
h.pridatPredmet(new Predmet("DenisJeCutiePie"));
assertEquals(h.getInventar().toString(),in.konej(" "));



    }
}