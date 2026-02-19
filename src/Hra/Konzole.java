package Hra;

import mechanika.Hrac;
import prikazy.*;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Trida pro spracovani prikazu
 * @author romek studios
 */

public class Konzole {

    private HashMap<String, Prikaz> prikazy;

    private Scanner scanner;

    public Konzole() {
        scanner = new Scanner(System.in);
        prikazy = new HashMap<>();
    }

    /**
     * nacte prikazy
     * @param g GameData data nactene z jsonu
     * @param h Hrac instance hrace
     */
    public void inicializatorPrikazu(GameData g, Hrac h) {
        prikazy.put("jdi", new Jdi(g, h));
        prikazy.put("inventar", new InventarPrikaz(h));
        prikazy.put("mluv", new Mluv(h));
        prikazy.put("otevrit", new Otevrit(h));
        prikazy.put("pouzij", new Pouzij(h));
        prikazy.put("seber", new Seber(h,g));
prikazy.put("ukoncit", new Ukoncit());
prikazy.put("pomoc", new Pomoc());
    }

    /**
     * Vykona zadany prikaz
     */
    public void execute() {
        System.out.print(" -- ");
        String command = scanner.nextLine();
        String[] pr = command.trim().toLowerCase().split(" ");
        if (prikazy.containsKey(pr[0])) {
            switch (pr.length){
                case 1:System.out.println(prikazy.get(pr[0]).konej("--"));
                break;
                case 2:System.out.println(prikazy.get(pr[0]).konej(pr[1]));
                break;
                default:
                    System.out.println("o co se snazis musi to byt dlouhy 1,2. >]");
            }
        }



    }


    public HashMap<String, Prikaz> getPrikazy() {
        return prikazy;
    }


}
