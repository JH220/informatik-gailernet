package de.gailernet.bedingteanweisungenundschleifen.boolescheausdrücke;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReifendruckDrei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int frontRight = getPressure(scanner, "rechten Vorderreifens");
        int frontLeft = getPressure(scanner, "linken Vorderreifens");
        int backRight = getPressure(scanner, "rechten Hinterreifens");
        int backLeft = getPressure(scanner, "linken Hinterreifens");
        scanner.close();

        boolean okay = true;

        int front = frontRight - frontLeft;
        if (front > 3 || front < -3) okay = false;
        int back = backRight - backLeft;
        if (back > 3 || back < -3) okay = false;

        if (okay) System.out.println("\nDer Reifendruck ist OK.");
        else System.out.println("\nDer Reifendruck ist nicht in Ordnung!");
    }

    private static int getPressure(Scanner scanner, String name) {
        try {
            System.out.print("Reifendruck des " + name + ": ");
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe eine gültige Zahl an!");
            return -1;
        }
    }
}