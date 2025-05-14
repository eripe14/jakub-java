package obiektowe;

import java.util.Random;

public class Car {

    // 2 typy metod
    // 1. zwracajac
    // 2. nie zwracajaca

    // 1. zwracajac
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }



}