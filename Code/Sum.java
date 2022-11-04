import java.util.Scanner;

public class Sum {
   public static void main (String [] args) {
      
      Scanner input = new Scanner (System.in);
      int n1, n2, sum;
      
         System.out.print("Enter a number: ");
         n1 = input.nextInt();
         System.out.print("Enter another number: ");
         n2 = input.nextInt();
         
      sum = n1 + n2;
         System.out.print("The sum is " + sum);
      
   }

}