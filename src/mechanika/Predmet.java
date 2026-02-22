package mechanika;

/**
 * Trida co ma vsechny potrebne vlastnosti predmetu
 * @author romek studios
 */
public class Predmet {
    private int id;
    private String nazev;
    private String popis;

    public Predmet() {
    }

    public Predmet(String nazev) {
        this.nazev = nazev;
    }

    @Override
    public String toString() {
        return "nazev:" + nazev + '\'' +
                "popis:" + popis + "\n";
    }

    public String getPopis() {
        return popis;
    }

    public String getNazev() {
        return nazev;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
}
