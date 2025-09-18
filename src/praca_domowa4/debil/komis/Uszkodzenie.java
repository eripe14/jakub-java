package praca_domowa4.debil.komis;

public class Uszkodzenie {

    private final String opis;
    private final double priceManipulator;


    public Uszkodzenie(String opis, double priceManipulator) {
        this.opis = opis;
        this.priceManipulator = priceManipulator;
    }

    public String getOpis() {
        return opis;
    }

    public double getPriceManipulator() {
        return priceManipulator;
    }
}