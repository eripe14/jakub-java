package funkcyjne;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<String> slowa = new ArrayList<>();
        List<String> slowa2 = List.of("slowo1", "slowo2", "slowo3"); // odrazu robi new ArrayList z wartościami

        // dodawanie do listy
        slowa.add("karol");
        slowa.add("kuba");
        slowa.add("korki");

        // usuwanie z listy
        slowa.remove(1);

        // iteracja listy
        for (String word : slowa) {
            System.out.println(word);
        }

        // rozmiar
        System.out.println(slowa.size());

        // sprawdzanie czy coś istnieje w liście
        boolean czyZawiera = slowa.contains("karol");

        // if (slowa.contains()) tak też można - krótsza forma

        if (czyZawiera) {
            System.out.println("Zawiera");
        } else {
            System.out.println("Nie zawiera");
        }

        // sprawdzanie czy lista jest pusta
        boolean czyPusta = slowa.isEmpty();


    }

}