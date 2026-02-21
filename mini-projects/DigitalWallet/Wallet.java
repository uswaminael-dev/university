package DigitalWallet;

public class Wallet {
    double balance;
    double currency;

    public Wallet(){
        balance = 100000;
        currency = 1;
    }

    public Wallet(double new_balance, double new_currency){
        balance = new_balance;
        currency = new_currency;
    }

    public void addMoney(double amount){
        balance += amount;
        System.out.println("New Balance: " + balance);
    }

    public void spendMoney(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Spent: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void showBalance(){
        System.out.println("Current Balance: " + balance);
    }
}
