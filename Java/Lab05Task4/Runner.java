package Lab05Task4;

public class Runner {
    public static void main(String[] args) {
        Pizza order1 = new Pizza();
        Pizza order2 = new Pizza("large", 4 , 6, 2);
        Pizza order3 = new Pizza("medium", 2, 3, 1);
        
        order1.calcCost();
        order2.calcCost();

        PizzaOrder order4 = new PizzaOrder(order1, order2, order3);
        order4.calcTotal();
        order4.display();
    }
}
