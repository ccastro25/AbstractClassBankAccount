/**
 * Created by castro on 9/25/16.
 */
public class User {


    public static void main(String[] args) {
        Checking checking = new Checking(100);
        AccountsOption checkingOption = new AccountsOption();
        Saving saving = new Saving(200);
        Business business = new Business(200);
        Atm atm = new Atm();

        atm.startAtm();
    }
}
