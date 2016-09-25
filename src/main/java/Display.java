/**
 * Created by castro on 9/25/16.
 */
public class Display {


    public  void quit(){System.out.println("Enter 0 to quit");}
    public void chooseAccount(){System.out.println("Enter 1 for BusinessAccount, 2 for Checking and 3 for Saving");}
    public  void enterTransaction(){System.out.println("to credit enter 1, to debit enter 2, and to tranfer enter 3");}
    public void ShowingBalancing( BankAccount bankAccount){System.out.println("Your current balance is now $"+bankAccount.getBalance());}

}
