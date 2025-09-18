package praca_domowa4.debil;
import java.time.Instant;
import java.util.*;

public class UserService {

    private final Scanner scan = new Scanner(System.in);
    private final Map<String, User> userMap = new HashMap<>();

    public void addUser() {
        System.out.println("Podaj login uzytkownika");
        String login = this.scan.nextLine();

        if (this.checkIfUserExists(login)) {
            System.out.println("########################");
            System.out.println("Uzytkownik o takim loginie juz istnieje");
            return;
        }

        System.out.println("Podaj haslo uzytkownika");
        String password = this.scan.nextLine();
        Instant createdAt = Instant.now();

        if (accOrDen()) {
            System.out.println("########################");
            System.out.println("Uzytkownik stworzony");

            User user = new User(login, password, createdAt);
            this.userMap.put(login, user);
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
            case 1  -> true;
            default -> false;
        };
    }

    public boolean checkIfUserExists(String parametr) {
        return this.userMap.containsKey(parametr);
    }

    public void deleteUser(String login) {
        User remove = this.userMap.remove(login);
        System.out.println("Usunieto uzytkownika o loginie: " + remove.getLogin());
    }

}