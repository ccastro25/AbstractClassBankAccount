import java.util.Scanner;

/**
 * Created by castro on 9/25/16.
 */
public class ReadINput {

   private Scanner scanner = new Scanner(System.in);

    private  double usersINput;


    public double getUsersINput() {
        return usersINput;
    }

    public void setUsersINput() {
        this.usersINput = scanner.nextDouble();
    }
}
