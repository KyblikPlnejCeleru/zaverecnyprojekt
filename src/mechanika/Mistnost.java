package mechanika;


import java.util.ArrayList;

public class Mistnost {
    private String nazev;
    private String popis;
    private int id;
    private ArrayList<Mistnost> vstupy;
    private ArrayList<Predmet> predmety;
    private ArrayList<Postava> postavy;

    public Mistnost(String nazev, String popis) {
        // TODO
    }

    public void pridejVychod(Mistnost soused) {
        // TODO
    }

    public String getDlouhyPopis() {
        // TODO
        return "";
    }

    public Predmet seberPredmet(String nazev) {
        // TODO
        return null;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public ArrayList<Mistnost> getVstupy() {
        return vstupy;
    }

    public void setVstupy(ArrayList<Mistnost> vstupy) {
        this.vstupy = vstupy;
    }

    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }

    public void setPredmety(ArrayList<Predmet> predmety) {
        this.predmety = predmety;
    }

    public ArrayList<Postava> getPostavy() {
        return postavy;
    }

    public void setPostavy(ArrayList<Postava> postavy) {
        this.postavy = postavy;
    }
}

