import java.util.Scanner;

public class q11 {

    public static String removeChar(String str, char change) {
        // Declare result outside the loop to keep track of the modified string

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == change) {
                // Use result to store the modified string
                str = str.replace(String.valueOf(change), "");
            }
        }

        // Return the modified string
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Case 1: User input
        System.out.println("Input a string");
        String userInputString = in.nextLine();
        char userCharChange = 'a';
        String result1 = removeChar(userInputString, userCharChange);
        System.out.println("Result 1: " + result1);

        // Case 2: Hardcoded string
        String userInputString2 = "bobbie";
        char userCharChange2 = 'b';
        String result2 = removeChar(userInputString2, userCharChange2);
        System.out.println("Result 2: " + result2);
    }
}
