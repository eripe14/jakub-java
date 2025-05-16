package obiektowe.konstruktory;

public class Konstruktory {

    public static void main(String[] args) {
        Person person1 = new Person("Karol");
        Person person2 = new Person("Jakub");

        System.out.println("Person one name: " + person1.getName());
        System.out.println("Person two name: " + person2.getName());
    }

}