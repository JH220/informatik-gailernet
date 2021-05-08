package de.gailernet.bedingteanweisungenundschleifen.boolescheausdrücke;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TortenEssen {
    public static void main(String[] args) {
        int weight;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Geben sie Ihr Gewicht an: ");
            weight = scanner.nextInt();

            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe eine gültige Zahl an!");
            return;
        }

        if(weight >= 235 && weight <= 265) {
            System.out.println("Herzlichen Glückwunsch, sie sind zum Wettbewerb zugelassen.");
        } else {
            System.out.println("Sie wurden leider nicht zum Wettbewerb zugelassen.");
        }
    }
}