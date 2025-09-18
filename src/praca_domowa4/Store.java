package praca_domowa4;

import java.util.ArrayList;
import java.util.List;


public class Store {

    //lista w ktorej zapiszemy stworzone w konstruktorze gry
    private final List<Game> gameList = new ArrayList<>();

    // metoda klasy Game(stworzonej wczesniej) o zmiennej game
    // game stworzylismy w klasie MainStore jako instancje obiektu Game
    public void addGame(Game game) {
        this.gameList.add(game);
    }

    public void writeAllGames() {
        for (Game game : gameList) {
            game.writeInformation();
        }
    }

}