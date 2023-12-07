import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number");
        int num = in.nextInt();

        if ((num % 2) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        in.close();
    }
}
