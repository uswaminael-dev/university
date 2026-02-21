package PrinterMachine;

public class Printer {
    int inkLevel; 
    int paperCount;
    boolean isOn;


    public Printer(){
        inkLevel = 50;
        paperCount = 100;
        isOn = true;
    }

    public Printer (int a , int b){
        inkLevel = a;
        paperCount = b;
        isOn = true;}

    public void refillInk(){
        inkLevel = 100;
        System.out.println("Ink refilled.");
    }

    public void addPages(int pages){
        paperCount += pages;
        System.out.println("Added " + pages + " pages.");
    }

    public void printPages(int n){
        if (n > paperCount) {
            System.out.println("Not enough paper.");
        } else if (inkLevel < n * 2) {
            System.out.println("Not enough ink.");
        } else {
            paperCount -= n;
            inkLevel -= n * 2;
            System.out.println("Printed " + n + " pages.");
        }
    }

    public void showStatus(){
        System.out.println("Ink Level: " + inkLevel);
        System.out.println("Paper Count: " + paperCount);
    }
}
