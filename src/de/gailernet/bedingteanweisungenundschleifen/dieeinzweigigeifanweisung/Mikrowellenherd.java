package de.gailernet.bedingteanweisungenundschleifen.dieeinzweigigeifanweisung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mikrowellenherd {
    public static void main(String[] args) {
        int amount;
        int heatingTime;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Anzahl der Posten: ");
            amount = scanner.nextInt();

            if (amount < 1) {
                System.err.println("Bitte gebe mindestens einen Posten an!");
                return;
            } else if (amount > 3) {
                System.err.println("Es wird nicht empfohlen mehr als drei Posten zu erhitzen!");
                return;
            }

            System.out.print("Erhitzungszeit: ");
            heatingTime = scanner.nextInt();

            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe gültige Daten an!");
            return;
        }

        int suggestedHeatingTime = heatingTime;
        if (amount == 2) suggestedHeatingTime = (int) (heatingTime * 1.5);
        else if (amount == 3) suggestedHeatingTime = heatingTime * 2;

        System.out.println("\nEmpfohlende Erhitzungszeit: " + suggestedHeatingTime);
    }
}