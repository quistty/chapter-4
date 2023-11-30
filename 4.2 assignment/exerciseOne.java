// dont forget to do cd "4.2 assignment" to get into this file
import java.util.Scanner;

class exerciseOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("Hi " + name + "!");


        in.close();
    }


}