// dont forget to do cd "4.2 assignment" to get into this file
import java.util.Scanner;

class exerciseTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, sum;
        System.out.println("enter a number");
        num1 = in.nextDouble();
        System.out.println("enter another number");
        num2 = in.nextDouble();
        sum = num1 + num2;
        System.out.println("the sum of these numbers is " + sum);
        in.close();
    }


}