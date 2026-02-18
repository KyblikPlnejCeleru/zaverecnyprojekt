package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Trida pro otestovani prikazu pomoc
 * @author romek studios
 */
class PomocTest {

    /**
     * Metoda pro ozkouseni prikazu ohledne pomoci
     */
    @Test
    void konej() {
        Pomoc p = new Pomoc();
        p.konej("casda");
        assertEquals(p.konej("s"),p.konej("pomoc"));
    }
}