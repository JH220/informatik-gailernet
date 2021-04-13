package de.gailernet.bedingteanweisungenundschleifen.dieifanweisung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bestellüberprüfung {
    public static void main(String[] args) {
        int schrauben = getInt("Schrauben");
        int muttern = getInt("Muttern");
        int unterlegscheiben = getInt("Unterlegscheiben");

        if (schrauben > muttern) {
            System.out.println("\nKontrollieren Sie Ihre Bestellung!\n");
        }

        System.out.println("Gesamtbetrag: " + (schrauben + muttern + unterlegscheiben));
    }

    private static int getInt(String name) {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anzahl der " + name + ": ");

        try {
            input = scanner.nextInt();
        } catch (InputMismatchException exception) {
        }

        return input;
    }
}