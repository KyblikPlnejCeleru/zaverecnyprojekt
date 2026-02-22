package Hra;

import java.io.*;
import java.util.ArrayList;

/**
 * Trida ktera slouzi pro nacitani a zpracovani zacatecniho dialogu >]
 * @author romek studios + matej pospisil
 */
public class ZacatecniDialog {
    /**
     * Metoda pro nacteni a vypsani toho dialogu z textoveho souboru kterej je typu .txt {to uz je funfact}
     * @return vraci ten dialog bro
     */
    public String dialog() {
        StringBuilder vystup = new StringBuilder();
        InputStream stream = ZacatecniDialog.class.getResourceAsStream("/dialog.txt");
        if (stream == null) {
            return "Jestli toto vidis tak jsem to pokazil co kdyztak kontaktujte email potocek{zavinac}spsejecna.cz";
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(stream))) {
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
