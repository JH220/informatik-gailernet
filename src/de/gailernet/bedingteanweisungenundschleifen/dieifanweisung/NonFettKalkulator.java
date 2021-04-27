package de.gailernet.bedingteanweisungenundschleifen.dieifanweisung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NonFettKalkulator {
    public static void main(String[] args) {
        double apriceperpound;
        double bpriceperpound;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Preis pro Pfund Pakcung A: ");
            double aprice = scanner.nextDouble();
            System.out.print("Prozent mageres Fleisch Packung A: ");
            int apercent = scanner.nextInt();
            apriceperpound = aprice / apercent;

            System.out.print("Preis pro Pfund Pakcung B: ");
            double bprice = scanner.nextDouble();
            System.out.print("Prozent mageres Fleisch Packung B: ");
            int bpercent = scanner.nextInt();
            bpriceperpound = bprice / bpercent;

            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe eine richtige Zahl ein!");
            return;
        }

        System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + (apriceperpound * 100));
        System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + (bpriceperpound * 100));

        if(apriceperpound < bpriceperpound) System.out.println("Packung A ist preiswerter.");
        else if (apriceperpound > bpriceperpound) System.out.println("Packung B ist preiswerter.");
        else System.out.println("Beide Packungen sind gleich wert.");
    }
}