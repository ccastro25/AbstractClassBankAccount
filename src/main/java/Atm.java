import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 9/25/16.
 */
public class Atm {

    Display display = new Display();
    ReadINput readInput = new ReadINput();
    Checking checking = new Checking(100);
    AccountsOption checkingSavingOrBusinessOption = new AccountsOption();
    Saving saving = new Saving(200);
    Business business = new Business(200);
    ArrayList<BankAccount> allTheAccount = new ArrayList<BankAccount>();


    public void startAtm(){

        allTheAccount.add(business);
        allTheAccount.add(checking);
        allTheAccount.add(saving);


while(true) {
    display.chooseAccount();
    readInput.setUsersINput();

    pickingAccount(readInput.getUsersINput());
}
    }

    public void pickingAccount(double choice){

        switch((int) choice){

            case 0:
                System.exit(0);
            case 1:
               checkingSavingOrBusinessOption.TheOptions(business,allTheAccount);
                break;
            case 2:
                checkingSavingOrBusinessOption.TheOptions(checking,allTheAccount);
                break;
            case 3:
                checkingSavingOrBusinessOption.TheOptions(saving,allTheAccount);
                break;

               default:
                   display.error();


        }







    }


}
