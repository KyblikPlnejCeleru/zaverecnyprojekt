package mechanika;

public class Predmet {
    private int id;
    private String nazev;
    private String popis;

    @Override
    public String toString() {
        return "Predmet{" +
                "id=" + id +
                ", nazev='" + nazev + '\'' +
                ", popis='" + popis + '\'' +
                '}';
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
