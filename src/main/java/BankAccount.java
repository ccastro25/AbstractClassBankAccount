/**
 * Created by castro on 9/25/16.
 */
public abstract class BankAccount {


    private  double balance;
    private double interest;

    public BankAccount(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }



    public void debit(double amount){

        balance -= amount;
    }

    public  void credit(double amount){

        balance += amount;
    }

    public abstract void transferringTo(BankAccount bankAccount, double amount);



}
