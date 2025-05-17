package praca_domowa4;

import java.util.ArrayList;
import java.util.List;


public class Store {

    private final List<Game> gameList = new ArrayList<>();

    public void addGame(Game game) {
        this.gameList.add(game);

    }

    public void writeAllGames() {
        for (Game game : gameList) {
            game.writeInformation();
        }
    }

}
