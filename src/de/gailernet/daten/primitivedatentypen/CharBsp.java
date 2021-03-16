package de.gailernet.daten.primitivedatentypen;

public class CharBsp {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("Ein char: " + ch);

        /*
        Es kommt ein Fehler bei:
        - 'AA' -> Grund: Zwei Character
        - ''   -> Grund: Es gibt kein Character: leer
        - "A"  -> Grund: Anführungszeichen für String
         */
    }
}