# Podpowiedzi zadanie 2
Poproś gracza o podanie liczby – użyj do tego Scanner:
```java
Scanner scanner = new Scanner(System.in);
int guess = scanner.nextInt();
```

Całość zrób w pętli while, np. dopóki gracz nie zgadnie:
```java
while (guess != secretNumber) { ... }
```

# Podpowiedzi zadanie 3
- Losuj operację za pomocą liczby `Random` od 0 do 2 (np. 0 = potęga, 1 = pierwiastek, 2 = modulo).
- Użyj `Math.round()` lub `String.format()` do ładnego wyświetlania wyników.
- Zadbaj o poprawne porównanie wartości `double` (np. `a > b`).
