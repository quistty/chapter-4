import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = in.nextLine();
        int guesses = 1;
        do {
            if (!userName.equalsIgnoreCase("tim")) {
                System.out.println("You're not Tim, try again!");
                guesses++;
                userName = in.nextLine();
            }
            break;
        } while (!userName.equalsIgnoreCase("tim"));

        System.out.println("Hi Tim, it took you " + guesses + " tries to get in. Welcome back!");
        in.close();
    }

}