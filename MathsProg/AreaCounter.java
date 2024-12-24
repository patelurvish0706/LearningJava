// Practical 2 - Area counter of different shapes.
package LearningJava.MathsProg;

import java.util.Scanner;

public class AreaCounter {
    public static void main(String[] args) {
        // 2D Square => Area = side * side
        // 2D Rectangle => Area = length * width
        // 2D Triangle => Area = 1/2 * base * height
        // 2D Circle => Area = pi * Radius * Radius

        System.out.print(
                "\nSelect the shape that you want to find area of: \nEnter \n1 for Square\n2 for Rectangle\n3 for Triangle\n4 for Circle \n\nChoose shape(1,2,3 or 4):");
        Scanner sc = new Scanner(System.in);
        int shapeNumber = sc.nextInt();

        switch (shapeNumber) {
            case 1:
                System.out.println("\nYou selected Square.");
                System.out.println("\nFormula:\nArea of Square = Side²");
                System.out.println("\nEnter value of a Side:");
                int side = sc.nextInt();
                int areaSquare = side * side;
                System.out.print("\nArea of Square is ["+areaSquare+"].\n");
                break;

            case 2:
                System.out.println("\nYou selected Ractangle.");
                System.out.println("\nFormula:\nArea of Ractangle = Length * Width");
                System.out.println("\nEnter value of a Length:");
                int Length = sc.nextInt();
                System.out.println("Enter value of a Width:");
                int Width = sc.nextInt();
                int areaRactangle = Length * Width;
                System.out.print("\nArea of Ractangle is ["+areaRactangle+"].\n");
                break;

            case 3:
                System.out.println("\nYou selected Triangle.");
                System.out.println("\nFormula:\nArea of Triangle = (1/2) * Base * Height");
                System.out.println("\nEnter value of a Base:");
                double Base = sc.nextDouble();
                System.out.println("Enter value of a Width:");
                double Height = sc.nextDouble();
                double areaTriangle = 0.5 * Base * Height;
                System.out.print("\nArea of Triangle is ["+areaTriangle+"].\n");
                break;

            case 4:
                System.out.println("\nYou selected Circle.");
                System.out.println("\nFormula:\nArea of Circle = Pi * Radius² ");
                System.out.println("\nEnter value of a Radius:");
                double Radius = sc.nextDouble();
                double areaCircle = 3.141592 * Radius * Radius;
                System.out.print("\nArea of Circle is ["+areaCircle+"].\n");
                break;
                
            default:
                System.out.println("\nThere is no other Shape to find area.");
                break;
        }
        sc.close();

    }
}
