package Lab05Task1;

public class Person {
    private String name;
    private String fname;
    private Address address;
    //constructor
    public Person() {
    }   
    public Person(String n, String f, Address a) {
        name = n;
        fname = f;
        address = a;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getFname() {
        return fname;
    }
    public Address getAddress() {
        return address;
    }
    //setters
    public void setName(String n) {
        name = n;
    }
    public void setFname(String f) {   
        fname = f;
    }
    public void setAddress(Address a) {
        address = a;
    }
    //instance methods
    public void display() {
        System.out.println("Name: " + name + "\nFather Name: " + fname);
        if (address != null) {
            address.display();
        } else {
            System.out.println("Address: <not provided>");
        }
    }
}
