package de.gailernet.bedingteanweisungenundschleifen.dieeinzweigigeifanweisung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InternetDelikatessen {
    public static void main(String[] args) {
        String name;
        double price;
        boolean express;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Geben Sie den Artikel ein: ");
            name = scanner.next();

            System.out.print("Geben Sie den Preis ein: ");
            price = scanner.nextDouble();

            System.out.print("Expressversand (true/false): ");
            express = scanner.nextBoolean();

            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe gültige Daten an!");
            return;
        }

        double shippingPrice;
        if (price < 10) shippingPrice = 2;
        else shippingPrice = 3;
        if (express) shippingPrice += 5;

        System.out.println("\nRechnung");
        System.out.println("\t" + name + ": " + price);
        System.out.println("\tVersand: " + shippingPrice);
        System.out.println("\tGesamt: " + (price + shippingPrice));
    }
}