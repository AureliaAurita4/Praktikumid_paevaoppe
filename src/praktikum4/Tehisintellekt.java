package praktikum4;

import lib.TextIO;

/**
 * Created by svetlana on 3.11.16.
 */
public class Tehisintellekt {

    public static void main(String[] args) {

        System.out.println("Palun sisesta kaks vanust");
        int vanus1 = TextIO.getlnInt();
        int vanus2 = TextIO.getlnInt();

        int vahe = Math.abs(vanus1 - vanus2);

        if (vahe > 10) {
            System.out.println("Midagi kr6bedat");
        } else if (vahe > 5) {
            System.out.println("Ikka ei sobi");
        } else {
            System.out.println("Sobib");
        }

    }
}
