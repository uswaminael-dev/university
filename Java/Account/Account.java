package Account;

public class Account {
    private double balance;

    //Constructors
    public Account(){
        balance = 10000;
    }
    public Account(double balance){
        this.balance = balance;
    }

    //Methods
    public double deposit(double amount){
        if(amount>=0){
            this.balance = this.balance + amount;
            return balance;
        }
        return balance;
    }
    public double withdraw(double amount){
        if(amount>=0 && amount<=this.balance){
            this.balance = this.balance - amount;
            return this.balance;
        }
        return balance;
    }
}
