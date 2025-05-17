package praca_domowa2;

import java.util.Random;

public class RandomNumberGenerator{

        public int GetRandomNumber(){
            Random random = new Random();
            return random.nextInt(50);
        }


}
