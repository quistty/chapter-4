import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string");
        String userInput = in.nextLine();// gathers user input
        String userInputLower = userInput.toLowerCase(); // converts variable to lowercase

        // prints chars from the length of the array
        for (int i = userInputLower.length() - 1; i >= 0; i--) {
            System.out.print(userInputLower.charAt(i));
        }
        System.out.println();
        in.close();
    }
}
