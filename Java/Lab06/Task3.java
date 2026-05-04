package Lab06;
class Computer {
    protected int wordsize;      
    protected int memorysize;    
    protected int storagesize;   
    protected int speed;         

    public Computer() {
        this.wordsize = 0;
        this.memorysize = 0;
        this.storagesize = 0;
        this.speed = 0;
    }

    public Computer(int wordsize, int memorysize, int storagesize, int speed) {
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Computer specifications:");
        System.out.println("  Word size: " + wordsize + " bits");
        System.out.println("  Memory size: " + memorysize + " MB");
        System.out.println("  Storage size: " + storagesize + " MB");
        System.out.println("  Speed: " + speed + " MHz");
    }
}

class Laptop extends Computer {
    private double length;   
    private double width;    
    private double height;  
    private double weight;   

    public Laptop() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Laptop(int wordsize, int memorysize, int storagesize, int speed,
                  double length, double width, double height, double weight) {
        super(wordsize, memorysize, storagesize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void display() {
        super.display();
        System.out.println("Laptop dimensions:");
        System.out.println("  Length: " + length + " cm");
        System.out.println("  Width: " + width + " cm");
        System.out.println("  Height: " + height + " cm");
        System.out.println("  Weight: " + weight + " kg");
    }
}


public class Task3 {
    public static void main(String[] args) {
        Computer baseComputer = new Computer(64, 16384, 1000, 3200);
        System.out.println("Base Computer:");
        baseComputer.display();
        Laptop laptop = new Laptop(64, 8192, 512, 2800, 35.0, 24.5, 2.0, 1.8);
        System.out.println("Laptop:");
        laptop.display();
    }
}
