package de.gailernet.daten.ausdrueckeundarithmetischeoperatoren;

import java.util.HashMap;
import java.util.Map;

public class Niederschlagsmenge {
    public static void main(String[] args) {
        Map<String, Integer> monate = new HashMap<>();

        monate.put("april", 12);
        monate.put("mai", 14);
        monate.put("juni", 8);

        int summe = 0;
        for(int i : monate.values()) summe += i;
        double anzahl = monate.size();
        double durchschnitt = summe/anzahl;

        System.out.println("Durchschnitt: \t" +durchschnitt);
    }
}