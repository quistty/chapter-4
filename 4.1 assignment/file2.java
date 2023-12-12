import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?"); // requests for the users name
        String userName = in.nextLine();
        int guesses = 1; // counter to keep track of the attempts it has taken the user

        // program that runs until tim (not case sentitive) is entered
        do {
            if (!userName.equalsIgnoreCase("tim")) {
                System.out.println("You're not Tim, try again!");
                guesses++;
                userName = in.nextLine();
            }
            break;
        } while (!userName.equalsIgnoreCase("tim"));

        // prints the times it took the user to say tim
        System.out.println("Hi Tim, it took you " + guesses + " tries to get in. Welcome back!");
        in.close();
    }

}