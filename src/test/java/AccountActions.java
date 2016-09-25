import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/25/16.
 */
public class AccountActions {

    AccountActionss accountActionss = new AccountActionss();
    Saving saving = new Saving(300);
    Checking checking = new Checking(500);
    Business business = new Business(786);

    @Test
    public void accountActionsTest(){
        accountActionss.debitCreditAndCheckBalance(150,2,saving);
        double expected =150;
        double actual = saving.getBalance();
        // 1 is credit
        //2 is to debit

        Assert.assertEquals("not sure",expected,actual,0.1);
    }


}
