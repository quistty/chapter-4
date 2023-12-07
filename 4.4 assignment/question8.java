import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What year is it?");
        int year = in.nextInt();

        if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
            System.out.println("It is a lear year!");
        } else {
            System.out.println("It isn't a leap year");
        }
        in.close();
    }
}
