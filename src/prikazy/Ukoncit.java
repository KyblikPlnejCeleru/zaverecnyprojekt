package prikazy;

/**
 * Trida pro prikaz ohledne ukonceni cele hry aniz by to uzivatel dohral
 * @author romek studios
 */
public class Ukoncit implements Prikaz{

    private boolean konec = false;

    @Override

/**
 * proste to ukonci hru
 * @param vstup nic nemusis
 * @return ukonci hru + text
 */
    public String konej(String vstup) {
        konec=true;
        return "konec hry bro";
    }

    @Override
    public boolean ukonceni() {
        return konec;
    }
}
