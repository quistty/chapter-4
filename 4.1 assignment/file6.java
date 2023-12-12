import java.util.Scanner;

public class file6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // set numbers for the limits of the math.random
        int min = 1;
        int max = 6;

        // initializes the dice variables
        int dice1 = 0, dice2 = 0;
        int sum = 0, grandSum = 0;

        System.out.println("Dice 1     Dice 2     Total");

        // loop to print the dice while the total is less than 50
        while (grandSum < 50) {

            // randomizes the dice number
            dice1 = (int) (min + (max - min + 1) * Math.random());
            dice2 = (int) (min + (max - min + 1) * Math.random());
            sum = dice1 + dice2;
            System.out.println(dice1 + "          " + dice2 + "          " + sum);
            grandSum += sum;
        }
        System.out.println("Grand total: " + grandSum);
        in.close();
    }

}
