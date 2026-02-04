package prikazy;

public class Ukoncit implements Prikaz{
    @Override
    public String konej(String vstup) {
        ukonceni()=true;
        return "konec hry bro";
    }

    @Override
    public boolean ukonceni() {
        return false;
    }
}
