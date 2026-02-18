package mechanika;

import java.util.Arrays;

public class Postava {
    private String jmeno;
    private Predmet vyzadovanyPredmet;
    private String[] dialog;
    private String popis;
    private String rada;

    public Postava(String jmeno, String rada, Predmet vyzadovanyPredmet) {
        this.jmeno = jmeno;
        this.rada = rada;
        this.vyzadovanyPredmet = vyzadovanyPredmet;
    }

    public Postava() {
    }

    public Postava(String jmeno, String[] dialog) {
        this.jmeno = jmeno;
        this.dialog = dialog;
    }

    @Override
    public String toString() {
        return "Postava{" +
                "jmeno='" + jmeno + '\'' +
                ", vyzadovanyPredmet=" + vyzadovanyPredmet +
                ", dialog=" + Arrays.toString(dialog) +
                ", popis='" + popis + '\'' +
                '}';
    }

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

    public String getRada() {
        return rada;
    }

    public String getPopis() {
        return popis;
    }

    public String mluv() {
        for (int i = 0; i < dialog.length; i++) {

            try{
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(dialog[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return " ";
    }
}
