package PrinterMachine;

public class Runner {
    public static void main(String [] args){
        Printer printer1 = new Printer();
        printer1.showStatus();
        printer1.printPages(20);
        printer1.refillInk();
        printer1.addPages(50);
        printer1.showStatus();
    }
}
