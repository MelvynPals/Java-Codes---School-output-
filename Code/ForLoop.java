import java.util.Scanner;
public class ForLoop {
   public static void main (String [] args) {
   
   int i, num, num1, product;
   
   Scanner key = new Scanner (System.in);
   
   System.out.print("Enter a number: ");
   num = key.nextInt();
   System.out.print("Enter a limiter: ");
   num1 = key.nextInt();
   
   for (i = 1; i <= num1; i++) {
   product = num * i;
   System.out.print("\n");
   System.out.print(num + " x " + i + " = " + product);
   }
   
   }      
} 