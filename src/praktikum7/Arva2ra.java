package praktikum7;

import praktikum6.Meetodid2;
import praktikum6.Meetodid3;

/**
 * Created by svetlana on 26.11.16.
 */
public class Arva2ra {

    public static void main(String[] args) {
        int arvutiArv = Meetodid3.valik(1, 100);

        while (true) {
            //System.out.println(arvutiArv);
            int kasutajaArv = Meetodid2.kasutajaSisestus(1, 100);

            if (kasutajaArv == arvutiArv) {
                System.out.println("Arvasid 2ra!");
                break; //return meetodist v2ljamiseks
            } else if (kasutajaArv > arvutiArv) {
                System.out.println("Arvuti m6eldud arv on v2iksem");
            } else {
                System.out.println("Arvurit m6eldud arv on suurem");
            }
        }

    }
}
