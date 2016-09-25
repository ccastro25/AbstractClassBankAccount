/**
 * Created by castro on 9/25/16.
 */
public class Checking extends BankAccount {



    public Checking(double balance) {
        super(balance);
    }

    @Override
    public void transferringTo(BankAccount bankAccount, double transfferingAmount) {

        bankAccount.credit(transfferingAmount);
        setBalance(getBalance()-transfferingAmount);
        setInterest(1.2);
    }
}
