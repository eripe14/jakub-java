package praca_domowa2;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLiczb {

    public void wczytywanieLiczb() {

        RandomNumberGenerator losLiczba = new RandomNumberGenerator();
        int random1 = losLiczba.GetRandomNumber();

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.GERMAN);
        System.out.println("Zgadnij cyfre od 1 do 50");

        for (int i = 0; i <= 5; i++) {
            int cyfra = scan.nextInt();
            scan.nextLine();
            if (cyfra < random1) {
                System.out.println("Za mało!");
            } else {
                if (cyfra > random1) {
                    System.out.println("Za dużo!");
                }
                if (cyfra == random1) {
                    System.out.println("Brawo wygrałes za" + " " + i + " " + "razem!");
                }


            }
            if(i==5){
                System.out.println("Niestety przegrałeś. Szukana liczba to:"+" "+random1);
                break;

            }

        }
    }
}