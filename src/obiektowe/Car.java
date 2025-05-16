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

    // metody moga miec parametr! lub wiecej niz 1 :(
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}