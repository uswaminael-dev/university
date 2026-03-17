package Lab05Task1;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("F12", "Islamabad", "state1", "12345");
        Person p1 = new Person("Ali", "Khan", a1);
        p1.display();
    }
}
