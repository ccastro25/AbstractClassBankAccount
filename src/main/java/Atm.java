/**
 * Created by castro on 9/25/16.
 */
public class Atm {

Display display = new Display();
    ReadINput readInput = new ReadINput();
    Checking checking = new Checking(100);
    CheckingOption checkingOption = new CheckingOption();
    Saving saving = new Saving(200);
    Business business = new Business(200);

    public void startAtm(){
while(true) {
    display.chooseAccount();
    readInput.setUsersINput();
    readInput.getUsersINput();
}
    }

    public void pickingAccount(double choice){

        switch((int) choice){

            case 0:
                System.exit(0);
            case 1:


            case 2:


            case 3:



        }







    }



}
