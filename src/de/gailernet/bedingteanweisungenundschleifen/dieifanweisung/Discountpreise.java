package de.gailernet.bedingteanweisungenundschleifen.dieifanweisung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Discountpreise {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Gesamtbetrag in Cent ein: ");

        try {
            input = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Gebe eine gültige Zahl in Cent an!");
            return;
        }

        int discount = 0;

        if (input >= 1000) {
            discount = (int) (input * 0.1);
        }

        System.out.println("Discountpreis: " + (input - discount));
    }
}