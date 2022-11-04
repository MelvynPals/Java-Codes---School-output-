import java.util.Scanner;
public class MinMax {
   public static void main (String [] args) {
      Scanner key = new Scanner (System.in);
      int num1, num2;
      
      System.out.println("Input two (2) numbers beloew for the Min and Max method:");
      num1 = key.nextInt();
      num2 = key.nextInt();
      
      if (num1 > num2)
      System.out.print("\nMax is " + num1);
      
      else if ( num2 > num1)
      System.out.print("\nMax is " + num2);
      
      else
      System.out.print("\nBoth " + num1 + " and " + num2 + " are equal.");
      
      if (num1 < num2)
      System.out.print("\nMin is " + num1);
      
      else if ( num2 < num1)
      System.out.print("\nMin is " + num2);
      
      
      //new method using Math Function
      
//       System.out.println("");
//       if (num1 != num2) {
//       System.out.println("Max is " + Math.max(num1,num2));
//       System.out.print("Min is " + Math.min(num1,num2));
//       } else 
//       System.out.print("Both numbers are equal!");
      
   }
}