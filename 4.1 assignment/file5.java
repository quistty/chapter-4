import java.util.Scanner;

public class file5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a symbol");
        String symbol = in.nextLine();
        System.out.println("Input a positive integer");
        int n = in.nextInt();
        while (n < 1) {
            System.out.println("Your number is not a positive integer, please try again!");
            n = in.nextInt();
        }
        int printCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            do {
                System.out.print(symbol);
                printCount++;
            } while (printCount < i);
            System.out.println("\n");
            printCount = 0;
        }

        in.close();
    }

}
