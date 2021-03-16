package de.gailernet.daten.inputoutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KreisFlaeche {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Radius an: ");

        try {
            input = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Gebe eine gültige Zahl an!");
            return;
        }

        int radius = input;
        double area = radius * radius * Math.PI;

        System.out.println("Der Radius ist: " + radius);
        System.out.println("Die Fläche beträgt: " + area);
        System.out.println("Gerundet beträgt die Fläche: " + Math.round(area));
    }
}