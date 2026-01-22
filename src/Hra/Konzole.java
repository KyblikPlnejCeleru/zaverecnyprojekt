package Hra;

import mechanika.Hrac;
import prikazy.Jdi;
import prikazy.Prikaz;

import java.util.HashMap;
import java.util.Scanner;

public class Konzole {

    private HashMap<String, Prikaz> prikazy;

    private Scanner scanner;

    public Konzole() {
        scanner = new Scanner(System.in);
        prikazy = new HashMap<>();
    }

    public void inicializatorPrikazu(GameData g, Hrac h) {
        prikazy.put("jdi", new Jdi(g, h));

    }

    public void execute() {
        System.out.print(" -- ");
        String command = scanner.nextLine();
        String[] pr = command.trim().toLowerCase().split(" ");
        if (prikazy.containsKey(pr[0])) {
            System.out.println(prikazy.get(pr[0]).execute(pr[1]));
        }

    }


    public HashMap<String, Prikaz> getPrikazy() {
        return prikazy;
    }


}
