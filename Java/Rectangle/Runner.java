package Rectangle;

public class Runner {
    public static void main() {
    Rectangle rect = new Rectangle();
    rect.setLength(5);
    rect.setWidth(10);
    System.out.println("Area of Rectangle is: " + rect.area());
    System.out.println("Width of Rectangle is: " + rect.getWidth());
 }

}
