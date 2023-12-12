import java.util.Scanner;

public class file3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int greaterThanZero = 0, lessThanZero = 0, sum = 0; // numbers to track our counted numbers
        int smallestNum = 999999999; // used to input the smallest number, current value is a placeholder
        int largestNum = -999999999; // used to input the largest number, current value is a placeholder
        int count = 0;

        System.out.println("Enter a number");
        int num = in.nextInt(); // gathers the first number

        // checks to see if the number is 0, and saves the data accordingly
        while (num != 0) {
            sum += num;
            count++;
            if (num < 0) {
                lessThanZero++;
            } else {
                greaterThanZero++;
            }

            if (num > largestNum) {
                largestNum = num;
            }
            if (num < smallestNum) {
                smallestNum = num;
            }

            System.out.println("Enter a number");
            num = in.nextInt();
        }

        // prints the values saved
        System.out.println("You entered " + count + " numbers!");
        System.out.println(greaterThanZero + " were greater than 0");
        System.out.println(lessThanZero + " were less than 0");
        System.out.println(largestNum + " is the largest number entered");
        System.out.println(smallestNum + " is the smallest number entered");
        System.out.println(sum + " is the sum of the numbers entered smallest number entered");

        in.close();
    }
}
