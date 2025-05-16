package obiektowe.konstruktory;

public class Person {

    private final String name;

    // to jest konstruktor, musi być PUBLIC, w nawiasie podajesz tak jak w parametrze metody, typ zmiennej i jej nazwie
    public Person(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return this.name;
    }

}