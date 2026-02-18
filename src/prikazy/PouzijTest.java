package prikazy;

import mechanika.Hrac;
import mechanika.Mistnost;
import mechanika.Postava;
import mechanika.Predmet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PouzijTest {
Hrac h = new Hrac();
    @Test
    void konej() {
        Pouzij p = new Pouzij(h);
        h.setAktualniMistnost(new Mistnost("efn",new Postava("lopocha", "tamhle",new Predmet("denis"))));
        h.getInventar().add(new Predmet("denis"));
        assertEquals(p.konej("denis"),h.getAktualniMistnost().getPostavy().getRada());
        h.setAktualniMistnost(new Mistnost("efn",new Postava("lopocha", "tamhle",new Predmet("denis"))));
        assertNotEquals(p.konej("nenidenis"),h.getAktualniMistnost().getPostavy().getRada());

    }
}