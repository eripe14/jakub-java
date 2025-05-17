package petle_warunki_zmienne;

public class Petle {

    public static void main(String[] args) {
        // -- Pętle --
        // for
        // while

        // for (int i = 0; i < 10; i++) { }
        // continue - przechodzi do nastepnego okrazenia
        // break - przerywa pętle

        // for (int i = 0; i < 10; i++) {
        //     if (i == 7) {
        //         break;
        //     }

        //     System.out.println("#" + i);
        // }

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }

            System.out.println(i);
        }

        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int dupa = 0;
        while (dupa < 10) {
            dupa++;
        }
    }

}