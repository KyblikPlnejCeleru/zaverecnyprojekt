package mechanika;

public class Postava {
    private String jmeno;
    private Predmet vyzadovanyPredmet;
    private String[] dialog;
    private String popis;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public Predmet getVyzadovanyPredmet() {
        return vyzadovanyPredmet;
    }

    public void setVyzadovanyPredmet(Predmet vyzadovanyPredmet) {
        this.vyzadovanyPredmet = vyzadovanyPredmet;
    }

    public String[] getDialog() {
        return dialog;
    }

    public void setDialog(String[] dialog) {
        this.dialog = dialog;
    }

    public String mluv() {

        return "";
    }
}
