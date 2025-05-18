package praca_domowa3;

import java.util.Random;

public class JakisKod {

    Random random = new Random();
    public int randomOperationNumber(){
        int operationNumber = random.nextInt(2);
        return operationNumber;
    }

    public int randomComputerNumber(){
        int randomComputerNumber = random.nextInt(100);
        return randomComputerNumber;
    }







}











