package prikazy;

import Hra.GameData;
import mechanika.Hrac;
import mechanika.Mistnost;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JdiTest {
    Hrac h = new Hrac();
    GameData g = new GameData();
    @org.junit.jupiter.api.Test
    void konej() {
        Jdi j = new Jdi(g,h);
        inicializace();
        assertEquals(g.getMistnosti().get(0).toString(),h.getAktualniMistnost().toString());
        j.konej("zitek");
        assertEquals(g.getMistnosti().get(1).toString(),h.getAktualniMistnost().toString());
        j.konej("uzchcikonecpls");
        assertEquals(g.getMistnosti().get(1).toString(),h.getAktualniMistnost().toString());
    }


    public void inicializace(){
        ArrayList<Integer> jedna = new ArrayList<>();
        ArrayList<Integer> dva = new ArrayList<>();
        ArrayList<Integer> tri = new ArrayList<>();
        jedna.add(2);
        jedna.add(3);
        dva.add(1);

        ArrayList<Mistnost> m = new ArrayList<>();
        m. add(new Mistnost("denis",1,jedna));
        m.add(new Mistnost("zitek",2,dva));
        m.add(new Mistnost("uzchcikonecpls",3,tri));
        g.setMistnosti(m);
        h.setAktualniMistnost((new Mistnost("denis",1,jedna)));
}}