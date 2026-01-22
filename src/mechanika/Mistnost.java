package mechanika;


import java.util.ArrayList;

public class Mistnost {
    private String nazev;
    private String popis;
    private int id;
    private ArrayList<Integer> vstupy;
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

    public ArrayList<Integer> getVstupy() {
        return vstupy;
    }

    public void setVstupy(ArrayList<Integer> vstupy) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mistnost{" +
                "nazev='" + nazev + '\'' +
                ", popis='" + popis + '\'' +
                ", id=" + id +
                ", vstupy=" + vstupy +
                ", predmety=" + predmety +
                ", postavy=" + postavy +
                '}';
    }
}

