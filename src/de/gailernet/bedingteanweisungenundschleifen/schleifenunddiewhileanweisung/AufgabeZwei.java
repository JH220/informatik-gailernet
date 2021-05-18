package de.gailernet.bedingteanweisungenundschleifen.schleifenunddiewhileanweisung;

import java.util.Scanner;

public class AufgabeZwei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Wort ein: ");
        String input = scanner.nextLine();
        scanner.close();

        for (int count = input.length(); count > 0; count--) {
            System.out.println(input);
        }
    }
}