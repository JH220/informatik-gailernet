package de.gailernet.bedingteanweisungenundschleifen.schleifenunddiewhileanweisung;

import java.util.Scanner;

public class AufgabeEins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Startwert: ");
        int start = scanner.nextInt();
        System.out.print("Endwert: ");
        int end = scanner.nextInt();
        scanner.close();

        for(int count = start; count <= end; count++) {
            System.out.println(count);
        }
    }
}