package praca_domowa4.debil.komis;

import java.util.ArrayList;
import java.util.List;

public class Pojazd {

    private final String id;
    private final double price;
    private final List<Uszkodzenie> uszkodzenia;

    public Pojazd(double price, String id) {
        this.price = price;
        this.id = id;
        this.uszkodzenia = new ArrayList<>();
    }

    

}