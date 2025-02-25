public class typeConversion {
    public static void main(String[] args) {

        /*
                                                    Type Conversion
                                                          |
                         --------------------------------------------------------------
                        |                                                              |
                Implicit Type Conversion                                        Explicit Type Conversion
                    (Widening)                                                      (Narrowing)

               byte -> short -> int -> long -> float -> double       (IMPLICIT TYPE CONVERSION)
               byte <- short <- int <- long <- float <- double       (EXPLICIT TYPE CONVERSION)
        */

        System.out.println("Examples of Implicit Type Conversion: ");
        long var1 = 5;

        float var2 = 500;
        float var3 = 56666L;

        double var4 = 50;
        double var5 = 54.5f;
        System.out.println(var1 + " " + var2 + " " + var3 + " " + var4 + " " + var5);




        System.out.println("\n\nExamples of Explicit Type Conversion: ");
        float var6 = (float) 3.865;
        long var7 = (long) 8333L;
        int var8 = (int) 3.58;   // 3
        float var9 = (int) 6.9;  // 6.0

        System.out.println(var6 + " " + var7 + " " + var8 + " " + var9);




        // HOW TO PRINT THE DATATYPE OF ANY VARIABLE IN JAVA?
        int number = 42;
        String text = "Hello, Java!";
        double decimal = 3.14;

        // For objects
        // Syntax is: variableName.getClass().getSimpleName()
        System.out.println("\n\nData type of text: " + text.getClass().getSimpleName());


        // For primitives, we print the type directly
        System.out.println("Data type of number: " + ((Object) number).getClass().getSimpleName());
        System.out.println("Data type of decimal: " + ((Object) decimal).getClass().getSimpleName());

    }
}
