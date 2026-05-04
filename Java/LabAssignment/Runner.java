package LabAssignment;

public class Runner {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        System.out.println();
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2.toString());
        System.out.println();
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());
        System.out.println();
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println();
        Square square1 = new Square();
        System.out.println(square1.toString());
    }
}
