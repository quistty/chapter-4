import java.util.Scanner;

public class userSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold the count of votes for ratings 1 through 5
        int[] ratingCount = new int[5];
        
        // Number of survey responses
        int numResponses = 10;  // Change this if needed

        // Collect survey responses
        for (int i = 0; i < numResponses; i++) {
            System.out.print("How do you rate the caf food? ");
            int rating = scanner.nextInt();

            // Increment the corresponding rating counter
            if (rating >= 1 && rating <= 5) {
                ratingCount[rating - 1]++;
            } else {
                System.out.println("Invalid rating, please enter a number between 1 and 5.");
                i--; // Retry this iteration
            }
        }

        // Output the results
        System.out.println();
        for (int i = 0; i < ratingCount.length; i++) {
            System.out.println("Rating of " + (i + 1) + " - " + ratingCount[i] + " votes");
        }

        scanner.close();
    }
}