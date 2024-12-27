package LearningJava.conditionProg.ifElse;

import java.util.*;

public class compareVals {
  public static void main(String[] args) {
    System.out.println("Check two Characters or Sentenses,same or not.");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String var1 = sc.nextLine();
    System.out.print("Enter second string: ");
    String var2 = sc.nextLine();
  
    System.out.println(var1 +"\n"+var2);
  
    if(var1.equals(var2)){
      System.out.println("Yes, Strings Match Perfectly.");
    }else {
      System.out.println("Strings don't match.");
    }
    sc.close();
  }
}