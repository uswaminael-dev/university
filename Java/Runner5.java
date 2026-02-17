class Account{
    double balance;
    int acc_num;
    public Account(){
        balance = 1000000;
        acc_num = 2000;
    }
    
    public Account(double b , int a){
        balance = b;
        acc_num = a;
    }

    public void deposit(int amount){
        if ((amount>0) && (amount<9999)){
            balance = balance + amount;
            System.out.println("New Balance: " + balance);}
        else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(int amount){
        if ((amount>0) && (amount<=balance)){
            balance = balance - amount;
            System.out.println("New Balance: " + balance);}
        else{
            System.out.println("Invalid Amount");
        }
    }
}


public class Runner5 {
    public static void main (String []args){
        System.out.println("-----1-----");
        Account acc1 = new Account();
        acc1.deposit(700);
        acc1.withdraw(-1);
        System.out.println("-----2-----");
        Account acc2 = new Account(500 , 456);
        acc2.deposit(900);
        acc2.withdraw(560);
    }
}
