package de.gailernet.bedingteanweisungenundschleifen.zaehlschleifen;

import java.util.Scanner;

public class Summe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie n ein: ");
        int n = scanner.nextInt();
        scanner.close();

        double total = 0;
        for(int i = 1; i <= n; i++) total += 1.0/i;
        total += 1.0/n;
        System.out.println("Die Summe ist: " + total);
    }
}