package parktikum5;

/**
 * Created by svetlana on 5.11.16.
 */
public class Tabel {
    public static void main(String[] args) {

        int tabeliSuurus = 5;

        for (int j = 0; j < tabeliSuurus; j++) {
            for (int i = 0; i < tabeliSuurus; i++) {
                if (j == i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); //reavahetus
        }

    }
}
