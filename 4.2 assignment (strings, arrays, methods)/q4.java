import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number");
        int num1 = in.nextInt();
        System.out.println("Input a larger number");
        int num2 = in.nextInt();

        printEven(num1, num2);
        in.close();
    }

    public static void printEven(int smaller, int larger) {
        smaller++; // so that it does not include the inputted number in the numbers printed
        if (smaller % 2 != 0) {
            smaller++;
        }
        for (int i = smaller; i < larger; i += 2) {
            System.out.print(i + " ");
        }
    }
}
