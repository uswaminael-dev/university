package eCommerceManagementSystem;

public class Product {
    //instance variables
    private String productName;
    private int productID;
    private double price;
    private int quantity;
    static int productCount = 0;

    //constructors
    public Product(){
        productName = "Strorage Box";
        productID = 14789;
        price = 546.9;
        quantity = 2;
        productCount ++;
    }

    public Product(String productName, int productID ,double price, int quantity){
        
        if(productName.length() > 0){
            this.productName = productName;
        } else {
            System.out.println("Product name cannot be empty.");
            return;
        }
        if(productID > 0){
            this.productID = productID;
        } else {
            System.out.println("Product ID must be a positive integer.");
            return;
        }
        if(price > 0){
            this.price = price;
        } else {
            System.out.println("Product price must be a positive number.");
            return;
        }
        if(quantity>0 ){
            this.quantity = quantity;
        }else {
            System.out.println("Product price must be a positive number.");
            return;}
        productCount ++;
    }

    public Product(String productName , double price){
        this.productName = productName;
        this.price = price;
        productCount++;
    }

    //getters
    public String getProductName(){
        return productName;
    }
    public int getProductID(){
        return productID;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }


    //setters
    public void setProductName(String productName){
        if(productName.length() > 0){
            this.productName = productName;
        } else {
            System.out.println("Product name cannot be empty.");
        }
    }
    public void setProductID(int productID){
        if(productID > 0){
            this.productID = productID;
        } else {
            System.out.println("Product ID must be a positive integer.");
        }
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        } else {
            System.out.println("Product price must be a positive number.");
        }
    }
    public void setQuantity(int quantity){
        if(price > 0){
            this.quantity = quantity;
        } else {
            System.out.println("Product price must be a positive number.");
        }
    }

    //methods
    public void displayProductInfo(){
        System.out.println("------------PRODUCT DETAILS---------------");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------------------------------");
    }

    public static void displayProductCount(){
        System.out.println("Total Products: " + productCount);
    }
}
