package obiektowe;

// deklaracja klasy, musi byc public
public class Main_korki {

    // uruchamiator w cpp int main () {}
    public static void main(String[] args) {
        Car car = new Car();

        int randomNumber1 = car.getRandomNumber();
        int randomNumber2 = car.getRandomNumber();

        // ctrl + P pokazuje parametry metody
        int sum = car.sum(randomNumber1, randomNumber2);
        System.out.println(sum);

    }

}