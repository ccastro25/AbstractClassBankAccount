import java.util.ArrayList;

/**
 * Created by castro on 9/25/16.
 */
public class Transfers {

private Display display = new Display();

private ReadINput readINput = new ReadINput();

private BankAccount bankAccount;


    public BankAccount transferring(ArrayList<BankAccount > allAccounts, double choice){


        switch ((int) choice) {

            case 0:
                System.exit(0);

            case 1:
            bankAccount=  allAccounts.get(0);
                break;
            case 2:
            bankAccount = allAccounts.get(1);
                break;
            case 3:
             bankAccount = allAccounts.get(2);

                default:
                    display.error();

        }




return bankAccount;
    }






}
