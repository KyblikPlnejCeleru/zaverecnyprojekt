package prikazy;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pomoc implements Prikaz{

    @Override
    public String konej(String vstup) {
        StringBuilder vystup = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("res/pomoc.txt"))) {
            String radek;
            while ((radek = br.readLine()) != null) {
                vystup.append(radek).append("\n");
            }
        } catch (IOException e) {
            return "Jestli toto vidis tak jsem to pokazil co kdyztak kontaktujte email potocek{zavinac}spsejecna.cz";
        }
        return vystup.toString();
    }





    @Override
    public boolean ukonceni() {
        return false;
    }
}
