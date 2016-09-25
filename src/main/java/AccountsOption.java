import java.util.ArrayList;

/**
 * Created by castro on 9/25/16.
 */
public class AccountsOption {
    Display display = new Display();
    ReadINput readINput = new ReadINput();
    private  double choice;
    private double amount;


    AccountActionss accountActionss = new AccountActionss();

    public void TheOptions(BankAccount bankAccount , ArrayList<BankAccount> allAccounts) {
        while (true){
            choice =accountActionss.whatWouldYOuLikeToDo();
            if (choice<3){
        amount = accountActionss.howMuchShouldBeTransferred();}

       accountActionss.debitCreditCheckBalanceOrTransfer(amount, choice, bankAccount, allAccounts);


    }


    }


}


