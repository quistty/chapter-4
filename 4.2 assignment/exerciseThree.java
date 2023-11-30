import java.util.Scanner;

public class exerciseThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mark1, mark2, mark3, mark4, sum;
        System.out.println("What is your first mark");
        mark1 = in.nextDouble();
        System.out.println("What is your second mark");
        mark2 = in.nextDouble();
        System.out.println("What is your third mark");
        mark3 = in.nextDouble();
        System.out.println("What is your fourth mark");
        mark4 = in.nextDouble();
        sum = (mark1 + mark2 + mark3 + mark4) / 4;
        System.out.println("Your average is: " + sum);
        



        in.close();
    }
}
