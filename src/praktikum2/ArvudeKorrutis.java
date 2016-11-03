package praktikum2;

import java.util.Scanner;

/**
 * Created by svetlana on 22.10.16.
 */
public class ArvudeKorrutis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Siseta 1. arv");
        int arv1 = input.nextInt();

        System.out.println("Sisesta 2. arv");
        int arv2 = input.nextInt();

        int tulemus = arv1 * arv2;

        System.out.println("Nende arvude korrutis on " + tulemus);
    }
}
