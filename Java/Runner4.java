class Circle{
    double radius;
    double PI;
    double circumference;

    public Circle(){
        radius = 2.44;
        PI = 3.14;
    }

    public Circle(double r , double pi){
        radius = r;
        PI = pi;

    }

    public double CalculateCircumference(){
        circumference = 2*PI*radius;
        return circumference;
        
    }
}


public class Runner4 {
    public static void main(String [] args){
        Circle circle1 = new Circle();
        System.out.println(circle1.CalculateCircumference());
        Circle circle2 = new Circle(89, 3.14);
        System.out.println(circle2.CalculateCircumference());
    }
}
