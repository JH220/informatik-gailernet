package de.gailernet.bedingteanweisungenundschleifen.zaehlschleifen;

import java.util.Scanner;

public class IntegerAddieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele Integer sollen addiert werden: ");
        int amount = scanner.nextInt();
        System.out.println();

        int total = 0;
        for(int i = 1; i <= amount; i++) {
            System.out.print("Geben Sie den " + i + ". Integer ein: ");
            total += scanner.nextInt();
        }

        scanner.close();
        System.out.println("\nDie Summe ist " + total);
    }
}