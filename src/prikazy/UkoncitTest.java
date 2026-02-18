package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UkoncitTest {

    @Test
    void konej() {
        Ukoncit u = new Ukoncit();
        assertFalse(u.ukonceni());
        u.konej("nebavi me to");
        assertTrue(u.ukonceni());


    }
}