package de.gailernet.bedingteanweisungenundschleifen.schleifenunddiewhileanweisung;

import java.util.Scanner;

public class AufgabeDrei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie das erste Wort ein: ");
        String first = scanner.nextLine();
        System.out.print("Geben Sie das zweite Wort ein: ");
        String second = scanner.nextLine();
        scanner.close();

        StringBuilder builder = new StringBuilder(first);
        for (int i = 30; i > 0; i--) builder.append(".");
        builder.append(second);
        System.out.println(builder);
    }
}