package de.gailernet.bedingteanweisungenundschleifen.dieifanweisung;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Y2KProblemDetector {
    public static void main(String[] args) {
        int birthyear;
        int currentyear;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Geburtsjahr: ");
            birthyear = scanner.nextInt();
            try {
                System.out.print("Aktuelles Jahr: ");
                currentyear = scanner.nextInt();
            } catch (InputMismatchException exception) {
                currentyear = Integer.valueOf(new SimpleDateFormat("yy").format(new Date()));
            }

            scanner.close();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe eine richtige Zahl ein!");
            return;
        }

        if(birthyear > currentyear) {
            currentyear += 100;
        }

        System.out.println("Ihr Alter ist: " + (currentyear - birthyear));
    }
}