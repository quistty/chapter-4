import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int childTickets, redTickets, blueTickets;
        System.out.println("How many blue tickets are you buying?");
        blueTickets = in.nextInt();
        System.out.println("How many red tickets are you buying?");
        redTickets = in.nextInt();
        System.out.println("How many child tickets are you buying?");
        childTickets = in.nextInt();
        double sum = redTickets * 12 + blueTickets * 10 + childTickets * 6;
        System.out.println("Your ticket will cost $" + sum);

        in.close();
    }
}
