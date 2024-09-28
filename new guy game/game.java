import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random =  new Random();
        int points = 500;
        int wager = 0;
        while (true) {
            System.out.println("Enter how much you want to wager");
            wager = in.nextInt();
            if (wager == -1){
                System.out.println("ok bye bye");
                break;
            } else if (wager < 0) {
                System.out.println("blud u cant short yourself, guess properly");
            } else if (wager > points){
                System.out.println("Blud you do not have enough money, don't leeave ur momns in the hood or this yute will be smoked");
            } else {
                System.out.println("ok good wager");
                int userRandom = random.nextInt(6) + 1;
                int systemRandom = random.nextInt(6) + 1;
                if (systemRandom > userRandom){
                    points -= (wager * 2);
                    System.out.println("yikes, you lost your wager. You now have " + points + " points.");
                } else if (systemRandom < userRandom) {
                    points += wager;
                    System.out.println("you doubled your wager! You now have " + points + " points.");
                } else {
                    System.out.println("You got the 1 and 36 chance. no wager lost. You have " + points + " points.");
                }
            }
        } 
        in.close();
    }

}
