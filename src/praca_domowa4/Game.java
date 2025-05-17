package praca_domowa4;

public class Game {

    private final String title;
    private final String type;
    private final double price;

    public Game(String inputTitle, String inputType, double inputPrice){
        this.title = inputTitle;
        this.type = inputType;
        this.price = inputPrice;
    }

    public String getTitle() {
        return this.title;
    }
    public String getType(){
        return this.type;
    }
    public double getPrice(){
        return this.price;
    }

    public void writeInformation(){
        System.out.println(title);
        System.out.println(type);
        System.out.println(price);
    }

}
