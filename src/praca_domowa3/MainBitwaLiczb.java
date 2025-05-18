package praca_domowa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBitwaLiczb {

    public static void main(String[] args){

        List<Double> comparedNumbers = new ArrayList<>();



        JakisKod jakisKod = new JakisKod();
        Scanner numberScan = new Scanner(System.in);
        for(int i=0; i<5 ;i++){
            System.out.println("Podaj liczbe od 1 do 100");
            int playerNumber = numberScan.nextInt();
            numberScan.nextLine();
            int switchNumber2 = jakisKod.randomOperationNumber();
            int switchNumber = jakisKod.randomOperationNumber();
            double number1 = jakisKod.randomComputerNumber();
            switch(switchNumber){
                case 0:
                    double resultNumber1 = Math.sqrt((double)number1);
                    comparedNumbers.add(resultNumber1);
                    break;
                case 1:
                    double resultNumber2 = Math.log10((double)number1);
                    comparedNumbers.add( resultNumber2);
                    break;
                case 2:
                    double resultNumber3 = Math.exp((double)number1);
                    comparedNumbers.add( resultNumber3);
                    break;
            }

            switch(switchNumber2){
                case 0:
                    double resultPlayerNumber1 = Math.sqrt((double)playerNumber);
                    comparedNumbers.add(resultPlayerNumber1);
                    break;
                case 1:
                    double resultPlayerNumber2 = Math.log10((double)playerNumber);
                    comparedNumbers.add(resultPlayerNumber2);
                    break;
                case 2:
                    double resultPlayerNumber3 = Math.exp((double)playerNumber);
                    comparedNumbers.add(resultPlayerNumber3);
                    break;
            }

            System.out.println(comparedNumbers.get(0));
            System.out.println(comparedNumbers.get(1));
            if(comparedNumbers.get(1)>comparedNumbers.get(2)){
                System.out.println("Wygrał gracz");
            }else{
                System.out.println("Wygrał komputer");
            }
            comparedNumbers.removeAll(comparedNumbers);


        }





        }




    }







