import java.util.Scanner;

public class assignmentOperator {
    public static void main(String[] args) {
        /*
         Assigns the right-hand operand's value to the left-hand operand.
         Example: int a = 5;.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Challenge 7: Create a program to swap two numbers. \n");

        System.out.print("Please input the first number: ");
        int a = input.nextInt();

        System.out.print("Please input the second number: ");
        int b = input.nextInt();

        int c = b;
        b = a;
        a = c;

        System.out.println("\nSwapping Done...");
        System.out.println("Value of First Number is: " + a);
        System.out.println("Value of Second Number is: " + b);
    }
}