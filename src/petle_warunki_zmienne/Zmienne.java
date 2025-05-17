package petle_warunki_zmienne;

public class Zmienne {

    public static void main(String[] args) {

        System.out.println("Hello world!");        System.out.println(); // -- wyświetla tekst/liczbe/cokolwiek

        // typy zmiennych
        int a = 5; // zmienna całkowita
        double b = 5.5; // zmienna zmiennoprzecinkowa
        String c = "Hello"; // zmienna tekstowa (ciąg znaków)
        boolean d = true; // zmienna logiczna (true/false)
        char e = 'A'; // zmienna znakowa (znak)

        final int f = 10; // stała (zmienna, której nie można zmienić)

        // a++; // inkrementacja zmiennej a
        // a--; // dekrementacja zmiennej a
        // a = a * 5; // mnożenie zmiennej a przez 5
        // a *= 5; // to samo co wyżej;
        // a += 5;
        // a /= 2;
        // a %= 2; // reszta z dzielenia zmiennej a przez 2

        System.out.println(a);

    }

}