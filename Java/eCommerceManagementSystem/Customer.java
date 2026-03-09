package eCommerceManagementSystem;

public class Customer {
    //instance variables
    private String customerName;
    private int customerID;
    private String email;
    static int customerCount = 0;

    //constructors
    public Customer(){
        customerName = "Ali";
        customerID = 5678;
        email = "ali@gmail.com";
        customerCount ++;
    }

    public Customer(String customerName, int customerID ,String email){
        if(customerName.length() > 0){
            this.customerName = customerName;
        } else {
            System.out.println("Customer name cannot be empty.");
            return;
        }
        if(customerID > 0){
            this.customerID = customerID;
        } else {
            System.out.println("Customer ID must be a positive integer.");
            return;
        }
        if(email.contains("@") && email.contains(".com")){
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
            return;
        }
        customerCount ++;
    }
    //copy constructor
    public Customer(Customer c){
        this.customerName = c.customerName;
        this.customerID = c.customerID;
        this.email = c.email;
    }

    //getters
    public String getCustomerName(){
        return customerName;
    }
    public int getCustomerID(){
        return customerID;
    }
    public String getEmail(){
        return email;
    }

    //setters
    public void setCustomerID(int customerID){
        if(customerID > 0){
            this.customerID = customerID;
        } else {
            System.out.println("Customer ID must be a positive integer.");
        }
    }
    public void setEmail(String email){
        if(email.contains("@") && email.contains(".com")){
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    //methods
    public void displayCustomerInfo(){
        System.out.println("------------CUSTOMER DETAILS---------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Email: " + email);
        System.out.println("-------------------------------------------");
    }

    public static void displayCustomerCount(){
        System.out.println("Total Customers: " + customerCount);
    }
}
