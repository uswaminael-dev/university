package QuizPrep;
class SavingAccount{
    double balance;
    static double annualInterestRate = 2.5;
    private double savingsBalance;

    SavingAccount(double balance){
        this.balance = balance;
    }

    public void calculateMonthlyInterests(){
        savingsBalance = (balance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double rate){
        annualInterestRate = rate;
    }

    public void display(){
        System.out.println("Balance: " + balance + "\nInterest Rate: " + annualInterestRate + "\nSavings: " + savingsBalance);
    }

    public static double getter(){
        return annualInterestRate;
    }
}

public class Runner1{
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount(200000);
        SavingAccount acc2 = new SavingAccount(980000);
        SavingAccount acc3 = new SavingAccount(3678000);
        acc1.calculateMonthlyInterests();
        acc1.modifyInterestRate(34.6);
        SavingAccount.modifyInterestRate(2.3);
        acc1.display();
        SavingAccount.getter();
        acc1.getter();
        //annualInterestRate = 3.5;

    }
}