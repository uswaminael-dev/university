package Immutable;

class Rectangle {
    //fields
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    //constructor
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    //getters
    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }
    public int getLength() {
        return x2 - x1;
    }
    public int getWidth() {
        return y2 - y1;
    }
    //methods
    public int calculateArea() {
        return getLength() * getWidth();
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 5, 20, 15);
        System.out.println("---- Rectangle Test ----");
        System.out.println("Coordinates: (" + rectangle1.getX1() + ", " + rectangle1.getY1() + ") to (" + rectangle1.getX2() + ", " + rectangle1.getY2() + ")");
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Area: " + rectangle1.calculateArea());
    }
}
