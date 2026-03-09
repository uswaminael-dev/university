package eCommerceManagementSystem;

class Payment {
    //instance variables
    private String paymentMethod;
    double amount;
    int ID;

    //constructors
    public Payment(Order order ,String paymentMethod) {
        setPaymentMethod(paymentMethod);
        if(order != null){
        this.amount = order.getTotalBill();
        this.ID = order.getOrderID();}
    }

    //setter
    public void setPaymentMethod(String paymentMethod) {

        if(paymentMethod.equalsIgnoreCase("Credit Card") ||
           paymentMethod.equalsIgnoreCase("PayPal")) {

            this.paymentMethod = paymentMethod;
        }
        else {
            System.out.println("Invalid payment method");
        }
    }

    //getter
    public String getPaymentMethod() {
        return paymentMethod;
    }

    //instance methods
    public void processPayment() {
        System.out.println("-------Payment Details---------");
        System.out.println("Order: "+ ID + "\nAmount $"+ this.amount + "\nProcessed using " + paymentMethod);
        System.out.println("-------------------------------");
    }
}

