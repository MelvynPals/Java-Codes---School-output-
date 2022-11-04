import java.util.Scanner;
   
   public class Multiply {
      public static void main (String [] args) {
      
         Scanner input = new Scanner (System.in);
         int n1, n2, product;
            
            System.out.print("Enter a number: ");
            n1 = input.nextInt();
            System.out.print("Enter an another number: ");
            n2 = input.nextInt();
            
            product = n1 * n2;
            System.out.print("The product is " + product);
      
      
      }
   
   }