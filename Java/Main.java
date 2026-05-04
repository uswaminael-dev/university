interface Shape{
    void draw();
    int area();
}


abstract class GraphicObject implements Shape{
    String color;

    GraphicObject(String c){
        color = c;
    }

    void showColor(){
        System.out.println("Color is: " + color);
    }

    public abstract void draw();
    public abstract int area();
}


class Circle extends GraphicObject{
    double radius;

    Circle(String c , double r){
        super(c);
        radius = r;
    }

    public void draw(){
        System.out.println("Drawing Circle");
    }

    public int area(){
        return (int)(3.14*radius*radius);
    }

    public void circleOnlyMethod(){
        System.out.println("Only circle can do this.");
    }

    public boolean equals(Object o){
        if(o == null){return false;}
        
        if(!(o instanceof Circle)){return false;}

        Circle otherCircle = (Circle) o;
        return this.radius == otherCircle.radius;
    }
}


class Rectangle extends GraphicObject{
    double length;
    double width;

    Rectangle(String color , double w , double l){
        super(color);
        width = w;
        length = l;
    }

    public void draw(){
        System.out.println("Drawing Circle");
    }

    public int area(){
        return (int)(width * length);
    }

}


public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red" , 5);
        Shape s2 = new Rectangle ("Blue", 4, 6);

        s1.draw();
        s2.draw();

        Shape s3 = new Circle("Green" , 7);

        Circle c1 = (Circle)s3;
        c1.circleOnlyMethod();

        if(s3 instanceof Circle){
            Circle c2 = (Circle)s3;
            c2.circleOnlyMethod();
        }

        Circle c3 = new Circle ("Yellow" , 10);
        Circle c4 = new Circle ("Black" , 10);

        if(c3.equals(c4)){
            System.out.println("Both circles are equal");
        }
        else{
            System.out.println("Both circles are different");
        }
    }
}
