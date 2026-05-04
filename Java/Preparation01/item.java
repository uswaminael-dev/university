package Preparation01;

public class item {
    private String id;
    private String name;
    private double price;

    item(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setID(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
}
