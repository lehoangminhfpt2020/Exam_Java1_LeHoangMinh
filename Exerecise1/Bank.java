package Exerecise1;

public class Bank {
    double balance;
    double rate;
    public Bank(double balance, double rate){
        this.balance=balance;
        this.rate=rate;
    }
    public double calculateinterest(){
        double annualInterestRate = rate/10*100;
        return balance*(annualInterestRate/1200);
    }
}
