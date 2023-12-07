import java.util.Scanner;

public class exerciseSix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numSmallDrink, numLargeDrink;
        double totalRefund, totalRefundRounded;

        System.out.println("How many drinks do you have that can hold a liter or less?");
        numSmallDrink = in.nextInt();

        System.out.println("How many drinks do you have that are over a litre?");
        numLargeDrink = in.nextInt();

        totalRefund = numSmallDrink * 0.1 + numLargeDrink * 0.25;

        totalRefundRounded = (int) totalRefund;
        // the printf basically makes it so it will always have 2 decimal places. To
        // change the # of places, u would change 2 to 3.
        // print format has many other uses, such as %d for decimal integers, %s for
        // strings (which basically acts as a placeholder for variables)
        System.out.printf("The total refund is: $%.2f%n", totalRefund);
        System.out.println("The total refund is: $" + totalRefundRounded);

        in.close();
    }
}
