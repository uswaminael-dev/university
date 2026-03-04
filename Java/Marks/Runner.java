package Marks;

public class Runner{
public static void main(String [] args) {
    Marks list1 = new Marks();
    list1.getBiology();
    list1.getChemistry();
    list1.getPhysics();
    list1.display();
    Marks list2 = new Marks(24,50,40);
    list2.getBiology();
    list2.getChemistry();
    list2.getPhysics();
    list2.display();
}
}
