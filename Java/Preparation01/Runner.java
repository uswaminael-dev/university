package Preparation01;

public class Runner {
    public static void main(String[] args) {
        Customer c1 = new Customer("Umer", 24, "12345", "abcde");
        Shop s1 = new Shop("Umer's Shop");
        Order o1 = new Order(c1);
        item i1 = new item("1", "Shirt", 500);
        o1.takeOrder(i1);
        System.out.println(o1.getTotalBill());
    }
}
