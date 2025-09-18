package praca_domowa4.debil;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JakiesTamMetody {

    private final Scanner scan = new Scanner(System.in);
    private final List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return this.userList;
    }


    public void addUser() {
        System.out.println("Podaj login uzytkownika");
        String login = this.scan.nextLine();

        System.out.println("Podaj haslo uzytkownika");
        String password = this.scan.nextLine();

        Instant createdAt = Instant.now();

        boolean confirm = accOrDen();

        if (confirm) {
            System.out.println("########################");
            System.out.println("Uzytkownik stworzony");

            User user = new User(login, password, createdAt);
            this.userList.add(user);
            return;
        }

        System.out.println("########################");
        System.out.println("Uzytkownik nie stworzony");
    }

    public boolean accOrDen() {
        System.out.println("Napisz 1 aby zaakceptowac");
        System.out.println("############################");
        System.out.println("Napisz 2 aby odrzucic");

        int switchNumber = scan.nextInt();
        scan.nextLine();

        return switch (switchNumber) {
            case 1 -> true;
            default -> false;
        };
    }


}