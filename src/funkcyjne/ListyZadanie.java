package funkcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListyZadanie {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj slowo: ");
            String inputWord = scan.next();
            input.add(inputWord);
        }

        for (String word : input) {
            System.out.println(word);
        }
    }

}