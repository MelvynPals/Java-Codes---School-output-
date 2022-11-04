import java.util.Scanner;
public class ForforLoop {
   public static void main (String [] args) {
   int num, i, j;
   Scanner input = new Scanner (System.in);
   
      System.out.print("Enter a number: ");
      num = input.nextInt();
      
      for (i=1; i <= num; i++) {
         for (j=1; j <= i; j++)
         System.out.print(j);
         System.out.println("");
      }
   
   }
}