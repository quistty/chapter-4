import java.util.Scanner;

public class file5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // gets a symbol
        System.out.println("Input a symbol");
        String symbol = in.nextLine();

        // gets a integer that determines the number of times the symbol is printed
        System.out.println("Input a positive integer");
        int n = in.nextInt();

        // checks if the number inputted is a positive integer
        while (n < 1) {
            System.out.println("Your number is not a positive integer, please try again!");
            n = in.nextInt();
        }
        int printCount = 0; // counter to see how many times the symbol has been printed

        // loop to print the number and symbol the number of times inputted
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            do {
                System.out.print(symbol);
                printCount++;
            } while (printCount < i);
            System.out.println("\n");
            printCount = 0; // resets the total times the symbol as been printed
        }

        in.close();
    }

}
