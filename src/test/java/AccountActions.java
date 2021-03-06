import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by castro on 9/25/16.
 */
public class AccountActions {

    AccountActionss accountActionss = new AccountActionss();
    Saving saving = new Saving(300);
    Checking checking = new Checking(500);
    Business business = new Business(786);

    ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>();

    @Test
    public void accountActionsTest(){

        allAccounts.add(business);
        allAccounts.add(checking);
        allAccounts.add(saving);


        accountActionss.debitCreditCheckBalanceOrTransfer(150,2,saving,allAccounts);
        double expected =150;
        double actual = saving.getBalance();
        // 1 is credit
        //2 is to debit

        Assert.assertEquals("not sure",expected,actual,0.1);
    }


}
