package mechanika;

public class Predmet {
    private int id;
    private String nazev;
    private String popis;


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
