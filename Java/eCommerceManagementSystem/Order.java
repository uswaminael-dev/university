package eCommerceManagementSystem;

public class Order {
    private int orderID;
    private double totalBill;
    private Customer customer;
    private Product product;
    static int ordersCount = 0;
    

    //constructors
    public Order(){
        product = new Product();
        customer = new Customer();
        orderID = 3456; 
        totalBill = product.getQuantity() * product.getPrice();
        ordersCount ++;

    }
    public Order(Product product , Customer customer , int orderID){
        this.product = product;
        this.customer = customer;
        this.orderID = orderID;
        this.totalBill =  product.getQuantity() * product.getPrice();
        ordersCount ++;
    }

    //setter
    public void setOrderID(int orderID){
        if(orderID >=0){
            this.orderID = orderID;
        }
    }

    //getter
    public double getTotalBill(){
        return totalBill;
    }
    public int getOrderID(){
        return orderID;
    }
    public void getCustomerDetail(){
        System.out.println("----------------ORDER DETAILS--------------------");
        System.out.println("Name: " + customer.getCustomerName());
        System.out.println("ID: " + customer.getCustomerID());
        System.out.println("Email: " + customer.getEmail());

    }
    public void getProductDetail(){
        
        System.out.println("Product: " + product.getProductName());
        System.out.println("ID: " + product.getProductID());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Total Bill: $" + getTotalBill());
        System.out.println("--------------------------------------");
    }


    //methods
    public void displayOrderDetails(){
        getCustomerDetail();
        getProductDetail();
    }

    public void addProduct(Product p){
        this.product = p;
    }

    public static void displayOrderCount(){
        System.out.println("Total Orders: " + ordersCount);
    }
}

