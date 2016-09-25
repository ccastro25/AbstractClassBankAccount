/**
 * Created by castro on 9/25/16.
 */
public class Saving extends BankAccount {





    public Saving(double balance) {
        super(balance);
        setInterest(1.4);
    }

    @Override
    public void transferringTo(BankAccount bankAccount, double transfer) {

        bankAccount.credit(transfer);
        setBalance(getBalance()-transfer);

    }
}
