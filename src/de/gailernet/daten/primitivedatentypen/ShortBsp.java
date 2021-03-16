package de.gailernet.daten.primitivedatentypen;

public class ShortBsp {
    public static void main(String[] args) {
        short zahl1 = 32;
        zahl1 = 356;
        System.out.println("Eine short-Variable: " + zahl1);

        int zahl2 = 35000;
        System.out.println("Eine int-Variable: " + zahl2);

         /*
         Eine Short-Variable maximal 16-Bit speichern.
         Ein Integer hingegen 32-Bit.

         Daher gibt es einen Fehler, wenn man eine längere Variable als Short abspeichert.
         Ein Int kann hingegen mehr Zeichen abspeichern.
          */
    }
}