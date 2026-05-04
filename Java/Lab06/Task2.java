package Lab06;

class Publication{
    private String title;
    private double price;

    Publication(){
        title = "Games Of Thrones";
        price = 480;
    }
    Publication(String title , double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        if(title.length()>0) this.title = title;
    }
    public void setPrice(double price){
        if(price>0) this.price = price;
    }
    public void display(){
        System.out.println("Title: " + title + "\nPrice: Rs." + price);
    }


}

class Book extends Publication{
    private int page_count;

    Book(){
        super();
        page_count = 60;
    }
    Book(String title , double price, int page_count){
        super(title , price);
        this.page_count = page_count;
    }

    public int getPageCount(){
        return page_count;
    }

    public void setPageCount(int page_count){
        this.page_count = page_count;
    }

    public void display(){
        super.display();
        System.out.println("Pages: " + page_count);
    }
}

class Tape extends Publication{
    private int time;

    Tape(){
        time = 45;
    }

    Tape(String title , double price,int time){
        super(title , price);
        this.time = time;
    }

    public int getTime(){
        return time;
    }

    public void setTime(int time){
        if(time>=0 && time<=60)this.time = time;
    }

    public void display(){
        super.display();
        System.out.println("Play Time: " + time + " minutes");
    }
}
public class Task2 {
    public static void main(String[] args) {
        
        Tape tape1 = new Tape("Harry Potter" , 3500 , 56);
        tape1.display();
        System.out.println("-----Book Class Running-----");
        Book book1 = new Book("The Alchemist" , 500 , 150);
        book1.display();
    }
}
