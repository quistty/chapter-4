import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput; // defines variable

        do {
            System.out.println("Enter a string. Enter \"Stop\" to end the program");
            userInput = in.nextLine(); // gathers user input
            if (!userInput.equalsIgnoreCase("Stop")) { // checks if user inputs non case sensitive stop to stop the loop
                String userInput4String = userInput.substring(0, 4).toUpperCase(); // prints first 4 characters of
                                                                                   // string
                System.out.println("First 4 characters in uppercase: " + userInput4String); // prints result
            }

        } while (!userInput.equalsIgnoreCase("stop")); // checks if user inputs stop

        in.close();
    }

}
