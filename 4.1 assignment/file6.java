import java.util.Scanner;

public class file6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 1;
        int max = 6;
        int dice1 = 0, dice2 = 0;
        int sum = 0, grandSum = 0;
        System.out.println("Dice 1     Dice 2     Total");
        while (grandSum < 50) {
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
