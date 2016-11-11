package parktikum5;

/**
 * Created by svetlana on 6.11.16.
 */
public class Tabel3 {
    public static void main(String[] args) {

        int tabeliSuurus = 7;

        for (int i = 0; i < tabeliSuurus; i++) {
            System.out.print(i + " ");

            if (i == tabeliSuurus) {
                i = 0;
                for (i = 0; i < tabeliSuurus; i++) {
                    System.out.print(i + " ");
                }
            }

            for (int j = i + 1; j < tabeliSuurus; j ++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }


//        for (int i = 0; i < tabeliSuurus; i++) {
//            for (int j = 0; j < tabeliSuurus; j++) {
//                if (i == j) {
//                    System.out.print(i + " ");
//                } else {
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println(); //reavahetus
//        }

    }
}
