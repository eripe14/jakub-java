package praca_domowa4;

public class Game {

    // prywatne zbiory do trzymania danych
    private final String title;
    private final String type;
    private final double price;

    //konstruktor w ktorego parametrze definiuje typy zmiennych wpisywanych do zbiorow
    public Game(String inputTitle, String inputType, double inputPrice){
        this.title = inputTitle;   //this.nazwa_zbioru = przypisanie zmiennej do zbioru
        this.type = inputType;
        this.price = inputPrice;
    }
    // gettery wyciagajace wpisane zmienne ze zbiorow
    // @Karol nie uzylem gettera ani razu, to źle/dobrze?

    public String getTitle() {
        return this.title;
    }
    public String getType(){
        return this.type;
    }
    public double getPrice(){
        return this.price;
    }
    // wypisanie zbiorow
    public void writeInformation(){
        System.out.println(title);
        System.out.println(type);
        System.out.println(price);
        System.out.println("############");
    }

}
