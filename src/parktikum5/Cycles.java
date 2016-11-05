package parktikum5;

/**
 * Created by svetlana on 5.11.16.
 */
public class Cycles {

    public static void main(String[] args) {

        if (true) {
            System.out.println("True");
        }

        int j = 0;
        while (j < 3) {
            System.out.println(j + " True");
            j ++;

        }

        for (int i = 0; i < 10; i++) {// 1 - millega alustame tsyklit, 2 - tingimus ise nagu while puhul (j < 3), 3 - tsykli ketramisega muutuja muutmine nagu j++ while puhul
            System.out.println(i + " for tsykkel");
        }
    }
}
