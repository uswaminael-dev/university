package Lab05Task2;

import Lab05Task1.Person;
import Lab05Task1.Address;


public class Runner {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setBookName("Capitalism for Dummies");
        b1.setAuthor(new Person("Robert", "John", new Address("123 Main St", "Anytown", "Anystate", "12545")));
        b1.setPublisher("Pantheon Books");
        b1.display();}

    }
