package Lab05Task4;

public class TestCode {
    public static void main(String[] args) {
        Pizza order1 = new Pizza();
        System.out.println(order1.getDescription());
        System.out.println("--------------------");
        Pizza order2 = new Pizza("large", 4 , 6, 2);
        System.out.println(order2.getDescription());
    }   
}
