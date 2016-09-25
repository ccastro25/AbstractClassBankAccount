/**
 * Created by castro on 9/25/16.
 */
public class Business extends BankAccount {


    public Business(double balance) {
        super(balance);
        setInterest(1.5);
    }

    @Override
    public void transferringTo(BankAccount bankAccount, double transfer) {

        bankAccount.credit(transfer);
        setBalance(getBalance()-transfer);

    }
}
