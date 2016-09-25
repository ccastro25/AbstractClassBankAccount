import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/25/16.
 */
public class BankAccountTest {

    Checking checking = new Checking(151);
    Saving saving = new Saving(333);
    Business business = new Business(344);

    @Test
    public void creditTest() {
        double expect = 650;
        checking.credit(550);
        double actual = checking.getBalance();

        Assert.assertEquals("checing credit should print 650 ",expect,actual,0.1);
    }
@Test
    public void debitTest(){
        double expect = 329;
        saving.debit(4);
        double actual =  saving.getBalance();
        Assert.assertEquals("checking deibt , shuould return 329", expect,actual,0.1);

    }


    @Test
    public  void transferTest(){
        checking.transferringTo(saving,100);

        double expected = 51;
        double actual = checking.getBalance();

        Assert.assertEquals("",expected,actual,0.1);

    }

}
