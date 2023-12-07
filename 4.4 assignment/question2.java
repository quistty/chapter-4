import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double humanYears, dogYears;
        System.out.println("How old are you?");
        humanYears = in.nextDouble();
        if ((humanYears <= 2) && (humanYears > 0)) {
            dogYears = humanYears * 10.5;
            System.out.println("In dog years, you are " + dogYears + " old");
        } else if (humanYears > 2) {
            dogYears = (humanYears - 2) * 4;
            dogYears += 10.5;
            System.out.println("In dog years, you are " + dogYears + " old");
        } else {
            System.out.println("You can't be that old, try again!");
        }
        in.close();
    }
}
