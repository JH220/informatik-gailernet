package de.gailernet.daten.inputoutput;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Wechselgeld {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Cent ein: ");

        try {
            input = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException exception) {
            System.out.println("Gebe eine gültige Zahl an!");
            return;
        }

        Map<Integer, String> name = new HashMap<>();
        Map<Integer, Integer> unit = new HashMap<>();

        name.put(1, "Dollar");
        unit.put(1, 100);
        name.put(2, "Quarter");
        unit.put(2, 25);
        name.put(3, "Dime");
        unit.put(3, 10);
        name.put(4, "Nickel");
        unit.put(4, 5);
        name.put(5, "Cent");
        unit.put(5, 1);

        int rest = input;
        String message = "Das Wechselgeld ist ";

        for (int i = 1; i <= name.size(); i++) {
            int einheit = unit.get(i);

            int value = rest / einheit;
            rest = rest % einheit;

            String suffix = ", ";
            if (name.size() == i) suffix = ".";
            if ((name.size() - 1) == i) suffix = " und ";
            message += value + " " + name.get(i) + suffix;
        }

        System.out.println(message);
    }
}