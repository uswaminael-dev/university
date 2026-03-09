package eCommerceManagementSystem;

public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[10000];
        Customer[] customers = new Customer[10000];
        Order[] orders = new Order[10000];

        // Adding products
        products[0] = new Product("",101,80000,1);
        products[1] = new Product("Phone",102,50000,1);
        products[2] = new Product("Headphones",103,5000,3);
        products[3] = new Product("Keyboard",104,3000 ,9);
        products[4] = new Product("Mouse",105,1500,1);
        products[5] = new Product();

        // Display products
        System.out.println("Products List:");
        for(int i=0;i<products.length;i++){
            if(products[i] != null){
            products[i].displayProductInfo();}
        }

        // Display total number of products
        SystemInformation.totalProducts();


        // Adding customers
        customers[0] = new Customer("Ali",1,"ali@email.com");
        customers[1] = new Customer("Sara",2,"sara@email.com");
        customers[2] = new Customer();
        customers[3] = new Customer("Ayesha",4,"ayesha@email.com");
        customers[4] = new Customer("Usman",5,"usman@email.com");
        customers[5] = new Customer("Fatima",6,"fatima@email.com");


        // Display customers
        System.out.println("\nCustomers List:");
        for(int i=0;i<customers.length;i++){
            if(customers[i] != null){
            customers[i].displayCustomerInfo();}
        }

        // Display total number of customers
        SystemInformation.totalCustomers();


        // Creating orders
        orders[0] = new Order(products[0],customers[0],1);
        orders[1] = new Order(products[1],customers[1],2);
        orders[2] = new Order(products[2],customers[2],3);
        orders[3] = new Order(products[3],customers[3],4);
        orders[4] = new Order(products[4],customers[4],5);
        orders[5] = new Order(products[5],customers[5],6);


        // Display orders
        System.out.println("\nOrders:");
        for(int i=0;i<orders.length;i++){
            if(orders[i] != null){
            orders[i].displayOrderDetails();}
        }

        // Display total number of orders
        SystemInformation.totalOrders();


        // Payment
        Payment payment1 = new Payment(orders[1] ,"Credit Card");
        payment1.processPayment();
        Payment payment2 = new Payment(orders[0] ,"Pay Pal");
        payment2.processPayment();

    }
}

