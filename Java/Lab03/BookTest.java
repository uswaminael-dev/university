package Lab03;
import java.util.Scanner;

class Book {

    String author;
    String[] chapterNames;

    
    public Book() {
        author = "";
        chapterNames = new String[100];
    }

    
    public Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }

    
    public void setChapterNames(String[] chapters) {
        this.chapterNames = chapters;
    }

   
    public boolean compareBooks(Book book2) {
        return this.author.equals(book2.author);
    }

   
    public Book compareChapterNames(Book book2) {
        if (this.chapterNames.length > book2.chapterNames.length) {
            return this;
        } else {
            return book2;
        }
    }
}

public class BookTest {

    public static void main(String[] args) {

        
        Book book1 = new Book();
        book1.setAuthor("Khaled Hosseini");

        String[] chapters1 = {"Ch1", "Ch2", "Ch3"};
        book1.setChapterNames(chapters1);

        
        String[] chapters2 = {"Intro", "Ch1", "Ch2", "Ch3", "Ch4"};
        Book book2 = new Book("Khaled Hosseini", chapters2);

        
        boolean sameAuthor = book1.compareBooks(book2);
        System.out.println("Same Author: " + sameAuthor);

        
        Book biggerBook = book1.compareChapterNames(book2);
        System.out.println("Book with more chapters is written by: " + biggerBook.author);
    }
}