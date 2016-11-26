package praktikum6;

import lib.TextIO;

/**
 * Created by svetlana on 26.11.16.
 */
public class Meetodid3 {
    public static void main(String[] args) {

        System.out.println("Sisesta inimeste arv!");
        int inimesteArv = TextIO.getlnInt();

        System.out.println(valik(inimesteArv));
    }

    public static int valik(int inimesteArv) {

        return (int) (Math.random() * inimesteArv + 1);
    }
}
