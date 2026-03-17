package Lab05Task3;

public class Runner {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.display();
        System.out.println("--------------------");
        Point p2 = new Point(3, 4);
        p2.display();
         System.out.println("--------------------");
        Length l1 = new Length(new Point(0, 0), new Point(3, 4));
        l1.display();
         System.out.println("--------------------");
        Length l2 = new Length(new Point(1, 2), new Point(4, 6));
        l2.display();
         System.out.println("--------------------");

    }
}
