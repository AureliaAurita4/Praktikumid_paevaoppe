package praktikum2;

import lib.TextIO;

/**
 * Created by svetlana on 22.10.16.
 */
public class GruppiSuurus {
    public static void main(String[] args) {

        System.out.println("Mitu inimest on kokku?");
        int inimesteArv = TextIO.getlnInt();

        System.out.println("Kui suur grupp olema peab?");
        int grupiSuurus = TextIO.getlnInt();

        int gruppideArv = inimesteArv / grupiSuurus;
        System.out.println("Saab moodustada " + (inimesteArv / grupiSuurus) +
                " gruppi. Üle jääb " + (inimesteArv % grupiSuurus) + " inimest.");


    }
}
