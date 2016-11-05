package parktikum5;

import lib.TextIO;

/**
 * Created by svetlana on 5.11.16.
 */
public class Tabel2 {

    public static void main(String[] args) {

        System.out.println("Sisesta tabeli suurust");
        int tabeliSuurus = TextIO.getlnInt();

        for (int j = 0; j < tabeliSuurus; j++) {
            for (int i = 0; i < tabeliSuurus; i++) {
                if (j == i) {
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");
                }
                System.out.print("(j:" + j + " i:" + i + ") ");
            }
            System.out.println(); //reavahetus
        }
    }
}
