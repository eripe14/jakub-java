package praca_domowa4.debil;

import java.time.Instant;

public class User {

    private final String login;
    private final String password;
    private final Instant instant;

    public User(String login, String password, Instant instant) {
        this.login = login;
        this.password = password;
        this.instant = Instant.now();
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public Instant getInstant() {
        return this.instant;
    }
}