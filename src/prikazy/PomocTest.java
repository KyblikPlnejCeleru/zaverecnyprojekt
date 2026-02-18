package prikazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PomocTest {

    @Test
    void konej() {
        Pomoc p = new Pomoc();
        p.konej("casda");
        assertEquals(p.konej("s"),p.konej("pomoc"));
    }
}