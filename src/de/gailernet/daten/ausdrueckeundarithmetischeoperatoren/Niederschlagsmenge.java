package de.gailernet.daten.ausdrueckeundarithmetischeoperatoren;

import java.util.HashMap;
import java.util.Map;

public class Niederschlagsmenge {
    public static void main(String[] args) {
        Map<String, Integer> monate = new HashMap<>();

        monate.put("April", 12);
        monate.put("Mai", 14);
        monate.put("Juni", 8);

        int summe = 0;
        for(int i : monate.values()) {
            summe += i;
        }
        double anzahl = monate.size();
        double durchschnitt = summe / anzahl;

        for(int i = 0; i < monate.size(); i++) {
            String key = (String) monate.keySet().toArray()[i];
            int value = monate.get(key);

            System.out.println("Niederschlag im " +key+ ":\t" +value);
        }
        System.out.println("Durchschnitt: " +durchschnitt);
    }
}