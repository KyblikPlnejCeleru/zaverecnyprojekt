package mechanika;


import java.util.ArrayList;

public class Mistnost {
    private String nazev;
    private String popis;
    private int id;
    private ArrayList<Integer> vstupy;
    private ArrayList<Predmet> predmety;
    private Postava postava;

    public Mistnost() {
    }

    public Mistnost(String nazev, int id, ArrayList<Integer> vstupy) {
        this.nazev = nazev;
        this.id = id;
        this.vstupy = vstupy;
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

    public Postava getPostavy() {
        return postava;
    }

    public void setPostavy(Postava postavy) {
        this.postava = postavy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "nazev='" + nazev + '\'' +
                ", popis='" + popis + '\'' +
                ", id=" + id +
                ", vstupy=" + vstupy +
                ", predmety=" + predmety +
                ", postavy=" + postava +
                '}';
    }
}

