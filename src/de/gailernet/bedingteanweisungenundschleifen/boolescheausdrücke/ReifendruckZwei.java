package de.gailernet.bedingteanweisungenundschleifen.boolescheausdrücke;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReifendruckZwei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int frontRight = getPressure(scanner, "rechten Vorderreifens");
        int frontLeft = getPressure(scanner, "linken Vorderreifens");
        int backRight = getPressure(scanner, "rechten Hinterreifens");
        int backLeft = getPressure(scanner, "linken Hinterreifens");
        scanner.close();

        boolean okay = true;
        if(frontRight != frontLeft) okay = false;
        if(backRight != backLeft) okay = false;

        if(okay) System.out.println("\nDer Reifendruck ist OK.");
        else System.out.println("\nDer Reifendruck ist nicht in Ordnung!");
    }

    private static int getPressure(Scanner scanner, String name) {
        try {
            System.out.print("Reifendruck des " + name + ": ");
            int i = scanner.nextInt();
            if(i < 35 || i > 45) System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereiches!");
            return i;
        } catch (InputMismatchException exception) {
            System.err.println("Bitte gebe eine gültige Zahl an!");
            return -1;
        }
    }
}