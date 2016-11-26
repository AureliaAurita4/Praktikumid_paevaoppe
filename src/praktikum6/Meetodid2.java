package praktikum6;

import lib.TextIO;

/**
 * Created by svetlana on 25.11.16.
 */
public class Meetodid2 {
    public static void main(String[] args) { // static t2hendab, et meetodit kutsutatakse staatiliselt, aga kui me loome uue objekti, siis see on dynaamiline v2ljakutse

//        System.out.println("Sisesta arv");
//        int arv = TextIO.getlnInt();
//        int arvuAbsoluutv22rtus = Math.abs(arv);
//        int arvRuudus = ruut(arv); // siin ei pea klassi nime kirjutama, kuna see meetod asub samas klassis
//        // v6ib aga kirjutada nii: int arvRuudus = Meetodid2.ruut(arv);
//        System.out.println(arvRuudus);
//
//        int arvKuubis = kuup(arv);
//        System.out.println(arvKuubis);

        int kasutajaSisestatudArv = kasutajaSisestus(0, 10);
        System.out.println("Kasutaja sisestas: " + kasutajaSisestatudArv);
    }

    public static int ruut(int i) { //kuna private, siis ei saa teistes klassides kasutada
        //v6ib aga teha public'uks, siis teistes klassides peab importima praktikum6.Meetodid2 ja v6ib seal kutsuda: Meetodid2.ruut(4);

        return i * i;
    }

    public static int kuup(int i) {
        return (int)Math.pow(i, 3);
    }

    public static int kasutajaSisestus(int min, int max) {
        int sisestus;

        while (true){
            System.out.println("Sisesta arv vahemikus " + min + " kuni " + max);
            sisestus = TextIO.getlnInt();
            if (sisestus < min || sisestus > max) {
                System.out.println("See arv ei ole vahemikus!");
            } else {
                return sisestus;
            }
        }
    }

    public static int kasutajaSisestus (String kysimus, int min, int max) {
        System.out.println(kysimus);
        return kasutajaSisestus(min, max);
    }




}
