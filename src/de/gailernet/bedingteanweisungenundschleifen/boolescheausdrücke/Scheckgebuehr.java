package de.gailernet.bedingteanweisungenundschleifen.boolescheausdrücke;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scheckgebuehr {
    public static void main(String[] args) {
        double giro;
        double deposit;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Guthaben des Girokontos: ");
            giro = scanner.nextInt();

            System.out.print("Guthaben des Sparkontos: ");
            deposit = scanner.nextInt();

            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe eine gültige Zahl an!");
            return;
        }

        if(giro > 1000 || deposit > 1500) {
            System.out.println("Es ist keine Checkgebühr fällig.");
        } else {
            System.out.println("Es ist eine Checkgebühr von '0.15$' fällig.");
        }
    }
}