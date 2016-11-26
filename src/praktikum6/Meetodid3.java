package praktikum6;

import lib.TextIO;

/**
 * Created by svetlana on 26.11.16.
 */
public class Meetodid3 {
    public static void main(String[] args) {
        System.out.println("Sisesta inimeste arv!");
        int inimesteArv = TextIO.getlnInt();
        System.out.println(valik(1, inimesteArv));
    }

    public static int valik(int min, int max) {
        int vahemik = max - min + 1;
        return min + (int) (Math.random() * vahemik);
    }
}
