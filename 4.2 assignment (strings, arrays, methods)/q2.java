import java.util.Scanner;

public class q2 {

    public static boolean walleChecker(String input) {
        if (input.equals("WALLE")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String testCase = "WALLE"; //
        System.out.println("Input a string that says \"WALLE\"");
        String userInput = in.nextLine();
        System.out.println(walleChecker(testCase)); // hardcoded value will return true
        System.out.println(walleChecker(userInput)); // user input will return true if string inputted is "WALLE"

        in.close();
    }
}
