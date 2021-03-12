package de.gailernet.daten.inputoutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wechselgeld {
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

        int rest = input;

        int dollar = rest / 100; rest = rest % 100;
        int quarter = rest / 25; rest = rest % 25;
        int dime = rest / 10; rest = rest % 10;
        int nickel = rest / 5; rest = rest % 5;
        int cent = rest;

        System.out.println("Das Wechselgeld ist " +dollar+ " Dollar, " +quarter+ " Quarter, " +dime+ " Dime, " +nickel+ " Nickel und " +cent+ " Cent.");
    }
}