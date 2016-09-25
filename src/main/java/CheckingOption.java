/**
 * Created by castro on 9/25/16.
 */
public class CheckingOption {
    Display display = new Display();
    ReadINput readINput = new ReadINput();
    private  double choice;


    public void  checkingOptions(BankAccount bankAccount){
        display.enterTransaction();
        readINput.setUsersINput();
        choice=readINput.getUsersINput();
        accountActions(choice,bankAccount);
    }

    public void accountActions(double choice, BankAccount bankAccount){

        switch ((int)choice){


            case 1:
                bankAccount.


        }

    }



}
