import java.util.Scanner;
class Shape{
    public int length;
    public int width;
    public int area;
    public int parameter;
    
    public void parameter(){
        parameter = 2* (length + width);
        System.out.println("Parameter of the given rectangle is " + parameter);
    }

    public void area(){
        area = (length * width);
        System.out.println("Area of the given rectangle is " + area);
    }
}
public class Rectangle {
    static Scanner sc = new Scanner (System.in);
    public static void main (String [] args){
        System.out.println("----RECTANGLE 1----");
        Shape rectangle1 = new Shape();
        System.out.print("Enter a length: ");
        rectangle1.length = sc.nextInt();
        System.out.print("Enter a width: ");
        rectangle1.width = sc.nextInt();
        rectangle1.area();
        rectangle1.parameter();
        System.out.println("----RECTANGLE 2----");
        Shape rectangle2 = new Shape();
        System.out.print("Enter a length: ");
        rectangle2.length = sc.nextInt();
        System.out.print("Enter a width: ");
        rectangle1.width = sc.nextInt();
        rectangle2.area();
        rectangle2.parameter();
        System.out.println("----RECTANGLE 3----");
        Shape rectangle3 = new Shape();
        System.out.print("Enter a length: ");
        rectangle3.length = sc.nextInt();
        System.out.print("Enter a width: ");
        rectangle3.width = sc.nextInt();
        rectangle3.area();
        rectangle3.parameter();
    }
}
