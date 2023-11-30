import java.util.Scanner;

public class exerciseEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mealCost, taxAmount, tipAmount, totalAmount;

        System.out.println("How much did your meal cost?");
        mealCost = in.nextDouble();

        taxAmount = mealCost * 0.13;
        tipAmount = mealCost * 0.18;
        totalAmount = mealCost + taxAmount + tipAmount;

        System.out.printf("Your grand total is $%.2f%n", totalAmount);
        System.out.printf("You tipped $%.2f%n", totalAmount);
        System.out.printf("You were taxed $%.2f%n", totalAmount);

        in.close();
    }
}
