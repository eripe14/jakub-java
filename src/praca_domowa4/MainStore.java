package praca_domowa4;


import java.util.Scanner;

public class MainStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz 1 aby dodac gre lub wybierz 2 aby zobaczyc wszystkie gry");

        boolean finished = false;
        Store store = new Store();

        while(!finished){
            int chosenNumber = scan.nextInt();
            scan.nextLine();
            switch (chosenNumber) {
                case 1:
                    System.out.println("Dodaj tytuł:");
                    String scanTitle = scan.nextLine();
                    System.out.println("Dodaj gatunek");
                    String scanType = scan.nextLine();
                    System.out.println("Dodaj cene");
                    double scanPrice = scan.nextDouble();
                    // tworzymy zmienna game klasy Game do ktorej przypisujemy inputy
                    Game game = new Game(scanTitle, scanType, scanPrice);
                    store.addGame(game); // dodajemy game do listy z klasy Store
                    System.out.println("Gra dodana");
                    break;
                case 2:
                    System.out.println("Oto wszystkie gry:");

                    store.writeAllGames();
                    break;
                case 3:
                    finished = true;
                    break;
            }
        }


    }
}