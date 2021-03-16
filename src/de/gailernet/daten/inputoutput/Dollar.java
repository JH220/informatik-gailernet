package de.gailernet.daten.inputoutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dollar {
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

        int dollar = input / 100;
        int cent = input % 100;

        System.out.println("Das ergibt " + dollar + " Dollar und " + cent + " Cent.");
    }
}