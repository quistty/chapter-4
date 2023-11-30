import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String name;
    int birthYear, currentYear, age;
    double favNum1, favNum2, sum;

    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your name:");
    name = in.nextLine();
    System.out.println("Please enter your birth year:");
    birthYear = in.nextInt();
    System.out.println("Please enter the current year");
    currentYear = in.nextInt();
    System.out.println("Please enter your first favourite decimal:");
    favNum1 = in.nextDouble();
    System.out.println("Please enter your second favourite decimal");
    favNum2 = in.nextDouble();
    age = currentYear - birthYear;
    sum = favNum2 + favNum1;
    System.out.println("Hi " + name + "! You are " + age + " years old. The sum of your two favourite numbers is " + sum);




    in.close();
  }
}
