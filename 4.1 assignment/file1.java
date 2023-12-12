import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // obtaining the username and password of the user
        System.out.println("Create your username");
        String username = in.nextLine();
        System.out.println("Create your password");
        String password = in.nextLine();
        boolean entered = false; // used to check if someone has passed the security system

        // gives the user 3 attempts to see if they are the right person
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your username");
            String tempUser = in.nextLine();
            System.out.println("Enter your password");
            String tempPass = in.nextLine();
            if ((tempUser.equals(username)) && (tempPass.equals(password))) {
                System.out.println("Welcome!");
                entered = true; // this is created to verify if the user has passed the security system
                break;
            } else {
                System.out.println("Incorrect, please try again!");
            }
        }

        // if the user does not have the right information
        if (!entered) {
            System.out.println("INTRUDER!");
        }

        in.close();
    }
}
