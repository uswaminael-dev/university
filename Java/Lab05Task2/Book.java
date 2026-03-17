package Lab05Task2;
import Lab05Task1.Person;
class Book {
    private String bookName;
    private Person author;
    private String publisher;

    //constructor
    public Book() {}
    public Book(String bn, Person a, String p) {
        bookName = bn;
        author = a;
        publisher = p;
    }
    //getters
    public String getBookName() {
        return bookName;}
    public Person getAuthor() {
        return author;}
    public String getPublisher() {
        return publisher;}
    //setters
    public void setBookName(String bn) {
        bookName = bn;}
    public void setAuthor(Person a) {
        author = a;}
    public void setPublisher(String p) {
        publisher = p;}
    //instance methods
    public void display() {
        System.out.println("Book Name: " + bookName + "\nPublisher: " + publisher);
        if (author != null) {
            author.display();
        } else {
            System.out.println("Author: <not provided>");
        }
    }
}