import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Enter a string. Enter \"Stop\" to end the program");
            userInput = in.nextLine();
            if (!userInput.equalsIgnoreCase("Stop")) {
                String userInput4String = userInput.substring(0, 4).toUpperCase();
                System.out.println("First 4 characters in uppercase: " + userInput4String);
            }

        } while (!userInput.equalsIgnoreCase("stop"));

        in.close();
    }

}
