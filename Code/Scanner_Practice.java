import java.util.Scanner; //Scanner library
public class Scanner_Practice {
   public static void main(String [] args) {
   
   Scanner input = new Scanner (System.in);
   int num1, num2, sum; //declare that num1 and num2 are integers
 
   System.out.print("Enter a number: ");
   num1 = input.nextInt();
   System.out.print("Enter an another number: ");
   num2 = input.nextInt();
   
   sum = num1 + num2;
   System.out.print("The sum is: " + sum);
   
    
   
   }
}