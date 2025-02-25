import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Good Morning " + name);
        System.out.print(", also please tell me your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);




        Scanner newInput = new Scanner(System.in);
        System.out.println("\n\nChallenge 5");
        System.out.print("Please enter your name: ");
        String name1 = newInput.nextLine();
        System.out.println("Welcome " + name1 + " to KG Coding");




        Scanner againNewInput = new Scanner(System.in);
        System.out.println("\n\nChallenge 6");

        System.out.print("Please enter number 1: ");
        int number1 = againNewInput.nextInt();

        System.out.print("Please enter number 2: ");
        int number2 = againNewInput.nextInt();

        System.out.print("The Sum of both the numbers is: " +  (number1 + number2));
    }
}

