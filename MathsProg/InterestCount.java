/* Practical - 1 : Interest Counter */
package LearningJava.MathsProg;

import java.util.Scanner;

public class InterestCount {
    public static void main(String[] args) {

        int PrincipalAmount;
        int RateOfInterest;
        int TimeInYear;

        System.out.print("\nWelcome this is a Interest Rate Amount Counter\n");

        System.out.print("\nEnter the Principal Amount:");
        Scanner sc = new Scanner(System.in);
        PrincipalAmount = sc.nextInt();
        System.out.print( "\nEnter Interest rate in parecentage:"); 
        RateOfInterest = sc.nextInt();
        System.out.print( "\nTime period:"); 
        TimeInYear = sc.nextInt();
        sc.close();

        int SimpleInterest = (PrincipalAmount * RateOfInterest * TimeInYear) / 100;

        System.out.println("\nSimpleInterest = ("+PrincipalAmount+" * "+RateOfInterest+" * "+TimeInYear+") / 100");

        System.out.println("\nSo the Simple Interest is: " + SimpleInterest);
        System.out.println("\nAnd total Amount to pay/return is: ["+ PrincipalAmount + SimpleInterest +"]");
    }
}
