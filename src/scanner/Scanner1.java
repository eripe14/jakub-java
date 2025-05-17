package scanner;

import java.util.Locale;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){

                        //strumien wejscia-System.in
            Scanner scan = new Scanner(System.in);
            scan.useLocale(Locale.GERMAN);
            System.out.println("Podaj wiek");
            int age = scan.nextInt();
            scan.nextLine();                                 // metoda next.int() zczytuje tylko LICZBY i zostawia enter
            System.out.println("Podaj wyplate");
            double payment = scan.nextDouble();
            scan.nextLine();
            System.out.println("Podaj imie");
            String name= scan.nextLine();      //metoda next.line() zczyta wszystko z linie + zostawione entery ktorych nie zczytal nextInt()

            System.out.println(age);
            System.out.println(payment);
            System.out.println(name);

            }


        }





