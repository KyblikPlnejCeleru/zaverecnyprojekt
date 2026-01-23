package Hra;

import com.sun.tools.javac.Main;
import mechanika.Mistnost;
import mechanika.Postava;
import com.google.gson.Gson;
import mechanika.Predmet;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents the game data loaded from a JSON file.
 * This class serves as a data container for all static game content, such as items, characters, locations, and quests.
 *
 */
public class GameData {

    public HashMap<String,Predmet> Predmety;
    public ArrayList<Postava> postavy;
    private ArrayList<Mistnost> mistnosti;

    /**
     * Loads game data from a JSON file.
     *
     * @param resourcePath path to the resource file
     * @return a GameData object filled with the loaded data
     */
    public static GameData loadGameDataFromResources(String resourcePath) {
        //Vytvoření objektu pro práci s JSON souborem
        Gson gson = new Gson();

        //Načtení souboru gamedata.json, musí být ve složce res/resources, ta musí být označena jako resource složka projektu
        try (Reader rd = new FileReader(resourcePath)) {

            //Přečte celý JSON a vytvoří instanci GameData, naplní vlastnosti podle názvů klíčů v JSONU, vrátí se hotová třída GameData
            return gson.fromJson(
                    rd,
                    GameData.class
            );

        } catch (Exception e) {
            throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
        }

    }

    /**
     * Finds a specific location by its identifier.
     *
     * @param nazev the identifier of the location to be found
     * @return the matching location
     */
    public Mistnost findLocation(String nazev) {
        for (Mistnost l : mistnosti) {
            if (l.getNazev().equals(nazev)) {
                return l;
            }
        }
        throw new IllegalArgumentException("Neexistuje lokace jmenem: " + nazev);
    }
    public ArrayList<Mistnost> getLocations() {
        return mistnosti;
    }
}
