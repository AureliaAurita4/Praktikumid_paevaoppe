package praktikum6;

/**
 * Created by svetlana on 26.11.16.
 */
public class KullKiri {

    public static void main(String[] args) {

        int myndiVise = (Math.random() > 0.5) ? 0 : 1;
        System.out.println("myndiVise: " + myndiVise);

        // 0 - kull, 1 - kiri
        int kasutajaArvab = Meetodid2.kasutajaSisestus("Sisesta kull (0) v6i kiri (1)", 0, 1);

        System.out.println("kasutajaArvab: " + kasutajaArvab);


        if (myndiVise == kasutajaArvab) {
            System.out.println("Arvasid 2ra");
        } else {
            System.out.println("Mooda panid");
        }
    }


}
