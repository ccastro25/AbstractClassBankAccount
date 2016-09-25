import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by castro on 9/25/16.
 */





public class TransferTest {

    Transfers transfers = new Transfers();

    AccountActionss accountActionss = new AccountActionss();
    Saving saving = new Saving(300);
    Checking checking = new Checking(500);
    Business business = new Business(786);

    BankAccount bankAccount;


    ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>();

   @Test
    public void transferringTest(){

        allAccounts.add(business);
        allAccounts.add(checking);
        allAccounts.add(saving);

     bankAccount=   transfers.transferring(allAccounts,1);


       Assert.assertEquals("return the same object",bankAccount.getBalance(),business.getBalance(),0.1);

    }
}
