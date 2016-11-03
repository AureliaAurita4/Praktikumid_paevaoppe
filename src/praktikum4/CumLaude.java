package praktikum4;

import lib.TextIO;

import java.util.Scanner;

/**
 * Created by svetlana on 3.11.16.
 */
public class CumLaude {

    public static void main(String[] args) {

//        System.out.println("Sisesta lõputöö hinne");
//        int l6putoo = TextIO.getlnInt();
//        if (l6putoo < 0 || l6putoo > 5) {
//            System.out.println("See ei ole korrektne l6putoo hinne");
//            return;
//        }
//
//        System.out.println("Sisesta keskminne hinne");
//        double keskmine = TextIO.getlnDouble();
//        if (keskmine < 0 || keskmine > 5) {
//            System.out.println("See ei ole korrektne keskmine hinne");
//            return;
//        }

        int l6putoo = (int) kysiHinne("Sisesta l6putoo hinne");
        double keskmine = kysiHinne("Sisesta keskminne hinne");

        if (l6putoo == 5 && keskmine >= 4.5) {
            System.out.println("Saad Cum Laude");

        } else {
            System.out.println("Ei saa Cum Laudet");
        }

    }

    private static double kysiHinne(String kysimus) {
        System.out.println(kysimus);
        double hinne = TextIO.getlnDouble();
        if (hinne < 0 || hinne > 5) {
            System.out.println("See ei ole korrektne hinne hinne");
            System.exit(0);
        }
        return hinne;
    }
}
