# Zadanie 4 – Sklep z grami komputerowymi

Twoim zadaniem jest stworzenie prostego systemu do zarządzania sklepem z grami komputerowymi.
Zmienne i nazwy metod nazywaj zgodnie z konwencją po angielsku :)

## Wymagania funkcjonalne

1. **Stwórz klasę `Gra`**, która będzie zawierać:
    - prywatne pola:
        - `tytul` (String)
        - `gatunek` (String)
        - `cena` (double)
    - konstruktor ustawiający wszystkie pola
    - gettery do każdego pola
    - metodę `wypiszInformacje()`, która wypisze dane o grze

2. **Stwórz klasę `Sklep`**, która będzie zawierać:
    - pole `List<Gra>` – lista dostępnych gier w sklepie
    - metodę `dodajGre(Gra gra)` – dodaje grę do sklepu
    - metodę `wypiszWszystkieGry()` – wypisuje wszystkie gry
    - metodę `wyszukajPoGatunku(String gatunek)` – wypisuje gry danego gatunku
    - metodę `znajdzNajtanszaGre()` – wypisuje tytuł i cenę najtańszej gry

3. **Stwórz klasę `Main`**, w której:
    - za pomocą `Scanner` użytkownik może:
        - dodać nową grę (podając tytuł, gatunek i cenę; odpowiednie metody klasy ```Scanner``` takie jak ```nextDouble``` i ```nextLine```.
          - możesz to zrobić np. switchem (zobacz o tym artykuł), jeśli wpisze 1 to zacznie tworzyć produkt, jeśli 2 to wyświetli wszystkie gry itd. Wtedy każda funkcja to osobna metoda :)
        - zobaczyć wszystkie gry (pętla for z dwukropkiem :)
        - zakończyć program

---

## Podpowiedzi

- Użyj `while (true)` i `switch`, żeby stworzyć menu użytkownika.
- Gdy użytkownik chce zakończyć program, użyj `break`.
- Jak coś to pisz :)

---

Powodzenia!