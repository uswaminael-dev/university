package Preparation01;

public class Shop {
    static private String owner;
    static private item [] i = new item[100];
    static private Customer [] c = new Customer [100];

    Shop(String owner){
        this.owner = owner;
    }

    public void addItem(){
        i[0] = new item("1", "Shirt", 500);
        i[1] = new item("2", "Pant", 700);
    }

    public void addCustomer(){
        c[0] = new Customer("Umer", 24, "12345", "abcde");
        c[1] = new Customer("Ali", 26, "12346", "fghij");
    }

    static boolean findCustomer(Customer customer){
        for(int i=0 ; i<c.length ; i++){
            if (c[i] != null){
            if (c[i]==customer){
                return true;}
        }}

        return false;

    }

    


}
