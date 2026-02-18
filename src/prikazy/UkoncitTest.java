package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test prikazu pro ukonceni hry
 */
class UkoncitTest {

    /**
     * Test prikazu pro ukonceni hry
     */
    @Test
    void konej() {
        Ukoncit u = new Ukoncit();
        assertFalse(u.ukonceni());
        u.konej("nebavi me to");
        assertTrue(u.ukonceni());


    }
}