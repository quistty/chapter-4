import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum;
        System.out.println("How many pages are you printing?");
        int numPages = in.nextInt();
        if ((numPages > 0) && (numPages < 100)) {
            sum = (numPages * 0.3) * 1.13;
            System.out.println("It will cost $" + sum + " to print that much paper");
        } else if ((numPages >= 100) && (numPages < 500)) {
            sum = (numPages * 0.28) * 1.13;
            System.out.println("It will cost $" + sum + " to print that much paper");
        } else if ((numPages >= 500) && (numPages < 1000)) {
            sum = (numPages * 0.26) * 1.13;
            System.out.println("It will cost $" + sum + " to print that much paper");
        } else if (numPages > 1000) {
            sum = (numPages * 0.25) * 1.13;
            System.out.println("It will cost $" + sum + " to print that much paper");
        } else {
            System.out.println("Blud you need to input a proper amount of paper please");
        }

        in.close();
    }

}
