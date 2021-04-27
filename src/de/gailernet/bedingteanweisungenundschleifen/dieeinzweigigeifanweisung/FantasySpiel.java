package de.gailernet.bedingteanweisungenundschleifen.dieeinzweigigeifanweisung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FantasySpiel {
    public static void main(String[] args) {
        System.out.println("Willkommen zu Yertle's Schatzsuche");

        String name;
        int strength;
        int health;
        int luck;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Geben Sie den Namen der Spielfigur ein: ");
            name = scanner.next();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe einen gültigen String an!");
            return;
        }

        try {
            System.out.print("Stärke eingeben (1-10): ");
            strength = scanner.nextInt();

            System.out.print("Gesundheit eingeben (1-10): ");
            health = scanner.nextInt();

            System.out.print("Glück eingeben (1-10): ");
            luck = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe eine gültige Zahl von 1 bis 10 an!");
            return;
        }

        int totalPoints = strength + health + luck;
        if(totalPoints > 15) {
            System.out.println("\nSie haben Ihrer Spielfigur zu viele Punkte gegeben!");

            strength = 5;
            health = 5;
            luck = 5;
            totalPoints = 15;
        }

        System.out.print("\n" + name);
        System.out.print(", Stärke: " + strength);
        System.out.print(", Gesundheit: " + health);
        System.out.println(", Glück: " + luck);

        System.out.println("Gesamtpunktzahl: " + totalPoints);
    }
}