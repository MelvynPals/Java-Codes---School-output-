import java.util.Scanner;                                                          // library 
   
   public class WeightConverter {
      public static void main (String [] args) {
      
         Scanner input = new Scanner (System.in);
         double kg, kglb;                                                           // my variables
         double lb = 2.2;
         
         System.out.print("Enter weight in kilograms: ");                           // input user's weight in kilograms
         kg = input.nextDouble();
         
         kglb = kg * lb;
         System.out.print("Your weight in pounds (lbs) is " + kglb + " lb");         // output of user's weight in pounds
      
      } 
   
   }
   
   
// There are approximately 2.2 pounds in 1 kilogram. Write a program that automatically converts the kilogram inputted to pounds (lb). Refer to the test case below:
// 1kg = 2.2lb
   