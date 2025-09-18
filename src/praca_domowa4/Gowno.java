package praca_domowa4;

import praca_domowa4.debil.User;
import praca_domowa4.debil.UserService;

import java.util.List;

public class Gowno {

    public static void dodaj(int a, int b) {
        System.out.println(a + b);
    }

    public static void odejmij(int a, int b) {
        System.out.println(a - b);
    }

    public static void pomnoz(int a, int b) {
        System.out.println(a * b);
    }

    public static void podziel(int a, int b) {
        UserService userService = new UserService();

        userService.addUser();


        if (b == 0) {
            System.out.println("Nie można dzielić przez zero!");
        } else {
            System.out.println(a / b);
        }
    }

}