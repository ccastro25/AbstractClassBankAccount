/**
 * Created by castro on 9/25/16.
 */
public class Display {


    public  void quit(){System.out.println("Enter 0 ast any time to quit");}
    public void chooseAccount(){System.out.println("Enter 1 for BusinessAccount, 2 for Checking , and 3 for Saving");}
    public  void enterTransaction(){System.out.println("to credit enter 1, to debit enter 2, 3 for balance,4 to transfer, and to go back enter 5 ");}
    public  void enterAmount(){System.out.println("enter the amount");}
    public void ShowingBalancing( BankAccount bankAccount){System.out.println("Your current balance is now $"+bankAccount.getBalance());}
    public void chooseAccountTransferringForm(){System.out.println("Choose account to transfer from, 1 for BusinessAccount, 2 for Checking ,3 for Saving,");}
    public void chooseAccountToTransferTo(){System.out.println("Choose account to transfer to, 1 for BusinessAccount, 2 for Checking ,3 for Saving,");}
    public void error(){System.out.println("Erro try again");}


    }
