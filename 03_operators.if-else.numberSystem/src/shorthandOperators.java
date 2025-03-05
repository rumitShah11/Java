import java.util.Scanner;

public class shorthandOperators {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        a += x1;

        int x2 = input.nextInt();
        a = a + x2;
        System.out.println(a);

        int x3 = input.nextInt();
        a = a + x3;
        System.out.println(a);

        int x4 = input.nextInt();
        a = a + x4;
        System.out.println(a);


        /*
            Operator Symbol         Name of the Operator              Example         Equivalent construct
                +=                  Addition assignment               x += 4             x = x + 4
                -=                  Subtraction assignment            x -= 4             x = x - 4
                *=                  Multiplication assignment         x *= 4             x = x * 4
                /=                  Division assignment               x /= 4             x = x / 4
                %=                  Remainder assignment              x %= 4             x = x % 4
         */
    }
}