package Hra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Trida ktera slouzi pro nacitani a zpracovani zacatecniho dialogu >]
 * @author romek studios
 */

public class ZacatecniDialog {

    /**
     * Metoda pro nacteni a vypsani toho dialogu z textoveho souboru kterej je typu .txt {to uz je funfact}
     * @return vraci ten dialog bro
     */
    public String dialog() {
        StringBuilder vystup = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("res/dialog.txt"))) {
            String radek;
            while ((radek = br.readLine()) != null) {
                vystup.append(radek).append("\n");
            }
        } catch (IOException e) {
            return "Jestli toto vidis tak jsem to pokazil co kdyztak kontaktujte email potocek{zavinac}spsejecna.cz";
        }
        return vystup.toString();
    }

}
