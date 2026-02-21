package DigitalWallet;

public class Runner {
    public static void main(String [] args){
        Wallet wallet1 = new Wallet();
        wallet1.showBalance();
        wallet1.addMoney(5000);
        wallet1.spendMoney(2000);
        Wallet wallet2 = new Wallet(50000, 1);
        wallet2.showBalance();
        wallet2.spendMoney(60000);
    }
}
