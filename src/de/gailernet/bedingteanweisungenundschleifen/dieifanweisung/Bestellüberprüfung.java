package de.gailernet.bedingteanweisungenundschleifen.dieifanweisung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bestellüberprüfung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int schrauben = getMaterial(scanner, "Schrauben");
        int muttern = getMaterial(scanner, "Muttern");
        int unterlegscheiben = getMaterial(scanner, "Unterlegscheiben");
        scanner.close();

        if (schrauben > muttern) {
            System.out.println("\nKontrollieren Sie Ihre Bestellung!\n");
        } else {
            System.out.println("\nDie Bestellung ist okay.\n");
        }

        System.out.println("Gesamtbetrag: " + ((schrauben * 5) + (muttern * 3) + unterlegscheiben) + " Cent");
    }

    private static int getMaterial(Scanner scanner, String name) {
        int input = 0;
        System.out.print("Anzahl der " + name + ": ");
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException exception) {
        }

        return input;
    }
}