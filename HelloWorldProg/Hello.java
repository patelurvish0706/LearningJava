package LearningJava.HelloWorldProg;

public class Hello {
    public static void main(String[] args) {
        
        // Printing String
        String word1 = "Hello";
        String word2 = "World!!!";
        System.out.println( word1 + " " + word2 ); 
        /* Output(String): Hello World!!! */

        // Printing Integer
        int value1 = 10;
        int value2 = 20;
        int sum = value1 + value2 ;
        System.out.println( value1 + " + " + value2 + " = " + sum );
        /* Output(Integer): 10 + 20 = 30 */

        // Printing Sting + Integer 
        System.out.println(word1 + word2 + value1 + value2); // check left to right, first is String so all next varible consider as a String by adding to it.
        System.out.println(value1 + value2 + word1 + word2); // check left to right, first is Integer but at ahead String is In the sum. before the string, it go throught int Operations.
        /* Output(String): HelloWorld!!!1020
           Output(String): 30HelloWorld!!!    */

        // Operation with the same variable
        int var1 = 5;
        var1 = var1 + 5; // check left to right,till var1 = var1 its ok but when + 5 is compiled it adds 5 in to var1.
        System.out.println(var1);
        /* Output(Integer): 10 */

        // Increment, Dicrement operators.
        int x = 1 ;
        x++; // increment +1 means 2
        System.out.println(x); // x = 2
        x--; // decrement -1 means 1 
        System.out.println(x); 
        // x** and x// is not allowed.
        /* Output(Integer) for x++: 2 */
        /* Output(Integer) for x--: 1 */
        
    }
}
