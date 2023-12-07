import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letter;

        System.out.println("Enter a letter of the alphabet");
        letter = in.nextLine();
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o")
                || letter.equals("u")) {
            System.out.println("Your letter is a vowel");
        } else if (letter.equals("y")) {
            System.out.println("Your letter is sometimes a vowel and sometimes a consonant");
        } else {
            System.out.println("Your letter is a consonant");
        }

        in.close();
    }
}
