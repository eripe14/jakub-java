package praca_domowa1;


import java.util.Random;

public class Pitagoras {

        private int getRandomNumber1() {
            Random random = new Random();
            // next.int metoda z klasy Random ktora losuje.
            return random.nextInt(100);
        }
            //void nic nie robi po prostu czyta kod uzywam jezeli nie chce wywolac funkcji tylko napisac sam kod
        public void pitagoras(){

            int random1 = getRandomNumber1();
            int random2 = getRandomNumber1();
            double hyp = Math.sqrt(random1^2 + random2^2);
            System.out.println(hyp);
        }


}
