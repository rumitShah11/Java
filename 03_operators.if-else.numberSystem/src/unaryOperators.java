public class unaryOperators {
    public static void main(String[] args) {
        /*
            Operator                    Description                                            Example

              -                     Converts a positive value to a negative                     x = -y

         Pre Increment              Increment the value by 1 and then use it                    x = ++y
                                    in our statement

         Pre Decrement              Decrement the value by 1 and then use it                    x = --y
                                    in our statement

         Post Increment             Use current value in the statement and                      x = y++
                                    then increment it by 1

         Post Decrement             Use current value in the statement and                      x = y--
                                    then decrement it by 1
         */


        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(z);


        int a = 5;
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        System.out.println("\nWatching increment");
        int p = 5;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);

        System.out.println("\nPractice Eg:");
        int q = 10;
        System.out.println(--q);
        System.out.println(q);

        System.out.println(q--);
        System.out.println(q);
    }
}