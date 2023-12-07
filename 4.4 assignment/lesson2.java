import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int correctNum = (int) (100 * Math.random() + 1);
        int numGuesses = 0;
        boolean winner = false;
        int guess;
        while (numGuesses < 10) {
            System.out.println("Input a number between 1 and 100: ");
            guess = in.nextInt();
            numGuesses++;
            if (guess == correctNum) {
                System.out.println("Congrats, you win!");
                winner = true;
                break;
            } else if (guess > correctNum) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Too low, try again!");
            }
        }
        if (!winner) {
            System.out.println("Uops, you lost. Sorry!");
            System.out.println("The correct Number was: " + correctNum);
        }
        in.close();
    }
}
