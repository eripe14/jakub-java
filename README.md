# Zadanie 1
Napisz program, z dwoma klasami:
1. Main (metoda z public static void main - "uruchamiator")
2. Dowolna nazwa

Założenie:
 - publiczna metode, która losuje 2 liczby (przyprostokątne trójkąta prostokątnego) i liczy 3 bok za pomocą twierdzenia pitagorasa. 

Działanie:
 - wyświetl użytkownikowi na ekran 3 bok trójkąta w klasie Main po utworzeniu instancji 2 klasy.

Miłej zabawy :)

<br>

# Zadanie 2 - Prosta gra
## Zanim to, przeczytaj to: https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/podstawowe-wejscie-wyjscie

## Opis
### Napisz prostą grę konsolową w języku Java:

 - Komputer losuje liczbę całkowitą z zakresu 1–50.
 - Gracz ma 5 prób, aby odgadnąć wylosowaną liczbę.
 - Po każdej próbie program wypisuje jedną z wiadomości:
   - Za mało!
   - Za dużo!
   - Brawo, zgadłeś za X razem! – jeśli zgadnie
 - Jeśli gracz nie zgadnie po 5 próbach, program wypisuje:
   - Niestety, przegrałeś. Szukana liczba to: X

## Wymagania
### Program powinien używać:
 - klasy Random do losowania liczby
 - klasy Scanner do wczytywania odpowiedzi gracza
 - zmiennych (int, boolean, itp.)
 - instrukcji warunkowych (if, else)
 - pętli (for lub while)
 - metod (np. do sprawdzania odpowiedzi)

# Zadanie 3 - Gra: Bitwa Liczb!

## Cel
Stwórz prostą konsolową grę w języku Java, w której gracz walczy z komputerem przy użyciu… liczb! Gra pozwala przećwiczyć podstawy programowania, takie jak: pętle, metody, typy danych, `Random`, `Scanner`, `Math`, `public/private`.

---

## 📋 Zasady gry

- Gra składa się z **5 rund**.
- W każdej rundzie:
  - Gracz wpisuje **liczbę od 1 do 100**.
  - Komputer losuje liczbę z tego samego zakresu.
  - Twoja liczba i liczba komputera są **modyfikowane** (np. potęga, pierwiastek, modulo, itp.).
  - Liczby są porównywane – kto ma większą, zdobywa punkt.
- Na koniec gry wyświetlany jest **zwycięzca** i wynik.

---

## Wymagane elementy

- `Scanner` – do pobierania danych od użytkownika
- `Random` – do losowania liczb i operacji
- `Math` – do obliczeń matematycznych:
  - `Math.pow(...)`
  - `Math.sqrt(...)`
  - `Math.abs(...)`
- `while` / `for` – do rund
- `if` – do warunków
- `public` / `private` – do tworzenia metod
- Podział logiki na metody:
  - `getPlayerNumber()`
  - `getComputerNumber()`
  - `calculateModifiedValue(int number)` – zwraca zmodyfikowaną liczbę
  - `compare(int a, int b)` – porównuje liczby
  - `playRound()`
  - `printResults()`

---

## Przykład działania
```
Runda 1!
Podaj liczbę od 1 do 100: 25
Komputer wylosował: 42

Twoja liczba po przekształceniu: 625.0 (potęgowanie)
Liczba komputera po przekształceniu: 6.48 (pierwiastek)

Gracz wygrywa rundę!
```

## Podpowiedzi
 - jeśli będziesz miał problemy to zobacz plik podpowiedzi.md 😉
