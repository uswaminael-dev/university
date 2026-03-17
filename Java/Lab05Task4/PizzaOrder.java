package Lab05Task4;

public class PizzaOrder {
    private Pizza [] orders = new Pizza [3];
    //constructors
    public PizzaOrder() {
        orders[0] = new Pizza();
        orders[1] = new Pizza("medium", 2, 3, 1);
        orders[2] = new Pizza("small", 1, 2, 0);
    }   
    public PizzaOrder(Pizza order1, Pizza order2, Pizza order3) {
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;
    }
    public PizzaOrder(Pizza [] orders) {
        this.orders = orders;
    }

    //instance methods
    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < orders.length; i++) {
            total += orders[i].calcCost();
        }
        System.out.println("Total cost of the order: $" + total);
        return total;
    }

    public void display() {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("Pizza " + (i+1) + ":");
            System.out.println(orders[i].getDescription());
            System.out.println("--------------------");
        }
    }
}
