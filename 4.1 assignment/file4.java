import java.util.Scanner;

public class file4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        // question a
        while (num <= 100) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println("\n");

        // question b
        num = 100;
        while (num >= 1) {
            System.out.print(num + " ");
            num--;
        }
        System.out.println("\n");

        // question c
        for (int i = 1, count = 0; count < 50; i += 2, count++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // question d
        for (int i = 2, count = 0; count < 50; i += 2, count++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // question e
        for (int i = 1, count = 0; count < 20; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n");
        in.close();
    }

}
