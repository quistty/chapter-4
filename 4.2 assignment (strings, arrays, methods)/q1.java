import java.util.Scanner;

public class q1 {

    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": ******");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a positive integer");
        int test1 = in.nextInt();
        System.out.println("Input another positive integer");
        int test2 = in.nextInt();
        System.out.println("Input one more positive integer");
        int test3 = in.nextInt();
        System.out.println("test 1:");
        printN(test1);
        System.out.println("test 2:");
        printN(test2);
        System.out.println("test 3:");
        printN(test3);
        in.close();
    }

}
