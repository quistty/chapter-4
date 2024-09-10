import java.util.Scanner;
import java.util.random.*;
public class game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int points = 500;
        int wager = 0;
        while (wager != -1) {
            System.out.println("Enter how much you want to wager");
            wager = in.nextInt();
            if (wager == -1){
                System.out.println("ok bye bye");
            } else if (wager > points){
                System.out.println("Blud you do not have enough money, don't leeave ur momns in the hood or this yute will be smoked");
            } else {
                System.out.println("ok good wager");
            }
        } 
        in.close();
    }

}
