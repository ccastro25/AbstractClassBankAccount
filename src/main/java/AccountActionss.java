/**
 * Created by castro on 9/25/16.
 */
public class AccountActionss {

    Display display = new Display();
    ReadINput readINput = new ReadINput();
    private  double choice;
    private double amount;



    public void debitCreditAndCheckBalance(double amount, double choice, BankAccount bankAccount){
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


}
