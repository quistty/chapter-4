import java.util.Scanner;
public class exerciseNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a, b, sum, difference, product;
        double quotient;
        System.out.println("Input a number");
        a = in.nextInt();

        System.out.println("Input another number");
        b = in.nextInt();

        sum = a + b;
        difference = a - b;
        product = a *  b;
        quotient = (double)a / (double)b;

        System.out.println("The sum of a and b is: " + sum);
        System.out.println("The difference when b is subtracted from a is: " + difference);
        System.out.println("The product of a and b is: " + product);
        System.out.println("The quotient of a and b is: " + quotient);


        in.close();
    }
}
