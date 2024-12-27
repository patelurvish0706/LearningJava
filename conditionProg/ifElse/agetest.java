package LearningJava.conditionProg.ifElse;
import java.util.*;

class agetest {
    public static void main(String[] args) {
        // This is If...Else... Program

        System.out.println("Test you are aligible for vote or not.");
        System.out.print("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if(age >= 18){
            System.out.println("You are eligible for vote.");
        }else{
            System.out.println("Sorry, you are not eligible for vote.");
            System.out.println("you have to wait ["+ (18 - age) +"] years more.");
        }
    }
}