package parktikum5;

import lib.TextIO;

/**
 * Created by svetlana on 5.11.16.
 */
public class Tabel2 {

    public static void main(String[] args) {

        System.out.println("Sisesta tabeli suurust");
        int tabeliSuurus = TextIO.getlnInt();

        for (int x = 0; x <= tabeliSuurus + 1; x++) {
            System.out.print("--");
        }
        System.out.println();

        for (int i = 0; i < tabeliSuurus; i++) {
            System.out.print("| ");
            for (int j = 0; j < tabeliSuurus; j++) {

                if (i == j || i + j == (tabeliSuurus - 1)) {
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");
                }
                //System.out.print("(i:" + i + " j:" + j + ") ");
            }
            System.out.println("|"); //reavahetus

        }

        for (int y = 0; y <= tabeliSuurus + 1; y++) {
            System.out.print("--");
        }
        System.out.println();
    }

}
