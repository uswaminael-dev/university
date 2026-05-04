package Preparation01;

public class Order {
    private item[] items = new item[30];
    private Customer c;
    private double totalBill;

    Order(Customer c){
        this.c = c;
    }

    public void takeOrder(item item){
        for(int i=0 ; i<items.length ; i++){
            if(items[i] == null){
                items[i] = item;
                totalBill += item.getPrice();
                break;
            }
        }
    }

    public double getTotalBill(){
        return totalBill;
    }
}
