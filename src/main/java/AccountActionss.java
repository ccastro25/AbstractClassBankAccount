import java.util.ArrayList;

/**
 * Created by castro on 9/25/16.
 */
public class AccountActionss {

    private Display display = new Display();
    private ReadINput readINput = new ReadINput();
    private  double choice;
    private double amount;
    private Transfers transfers = new Transfers();
    BankAccount localBankAccount;



    public void debitCreditCheckBalanceOrTransfer(double amount, double choice, BankAccount bankAccount, ArrayList<BankAccount> allAccounts){
       Atm atm =new Atm();
        switch ((int)choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                bankAccount.credit(amount);
                break;
            case 2:
                bankAccount.debit(amount);
                break;
            case 3:
                checkBalance(bankAccount);
                break;
            case 4:
                transferringToAccounts(allAccounts,bankAccount);
                break;
            case 5:
                atm.startAtm();
                break;
        }

    }

    public double howMuchShouldBeTransferred(){
        display.enterAmount();
        readINput.setUsersINput();
        return readINput.getUsersINput();
    }

    public double whatWouldYOuLikeToDo(){
        display.enterTransaction();
        readINput.setUsersINput();
        return readINput.getUsersINput();
    }

    public void checkBalance(BankAccount bankAccount){

        display.ShowingBalancing(bankAccount);

    }


    public void transferringToAccounts(ArrayList<BankAccount> allAccounts, BankAccount bankAccount){

        display.chooseAccountToTransferTo();
        readINput.setUsersINput();
        localBankAccount =  transfers.transferring(allAccounts,readINput.getUsersINput());
        display.enterAmount();
        readINput.setUsersINput();
       amount= readINput.getUsersINput();
        bankAccount.transferringTo(localBankAccount,amount);;
        display.ShowingBalancing(localBankAccount);
        display.ShowingBalancing(bankAccount);
    }
}


