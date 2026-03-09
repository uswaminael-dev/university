package eCommerceManagementSystem;

public class SystemInformation {
    public static void totalProducts(){
        Product.displayProductCount();
    } 
    public static void totalCustomers(){
        Customer.displayCustomerCount();;
    } 
    public static void totalOrders(){
        Order.displayOrderCount();
    } 

}
