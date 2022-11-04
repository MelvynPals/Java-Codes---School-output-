import java.util.InputMismatchException;
import java.util.Scanner;
public class ArithmeticMethod {
   public static void main (String [] args) {
      Scanner input = new Scanner (System.in);

      double a, b;
      String op = "";
      char resume;
      int chosenArith = 0;
      
      do {
         System.out.println("Choose your operation:\n");
         System.out.print(operator(op));
         System.out.println("\n");
         
            do {  
               System.out.print("Input number: ");
               try {
                  chosenArith = input.nextInt();
               }
               catch (InputMismatchException e) {
                  System.out.print("Invalid character input!\nPlease try again, thank you!");
                  System.exit(0);
               }
            } while (isEqual(chosenArith) != true);
         
         if (chosenArith == 1) {
            System.out.println("Input a value for a and b below:");
            
            System.out.print("a = ");
            a = input.nextDouble();
            System.out.print("b = ");
            b = input.nextDouble();
            
            double result = add(a, b);
            System.out.println();
            System.out.println("The sum of a and b is = " + result);
         }
         else if (chosenArith == 2) {
            System.out.println("Input a value for a and b below:");
            
            System.out.print("a = ");
            a = input.nextDouble();
            System.out.print("b = ");
            b = input.nextDouble();
            
            double result = subtract(a, b);
            System.out.println();
            System.out.println("The difference of a and b is = " + result);
         }
         else if (chosenArith == 3) {
            System.out.println("Input a value for a and b below:");
            
            System.out.print("a = ");
            a = input.nextDouble();
            System.out.print("b = ");
            b = input.nextDouble();
            
            double result = multiply(a, b);
            System.out.println();
            System.out.println("The product of a and b is = " + result);
         }
         else if (chosenArith == 4) {
            System.out.println("Input a value for a and b below:");
            
            System.out.print("a = ");
            a = input.nextDouble();
            System.out.print("b = ");
            b = input.nextDouble();
            
            double result = divide(a, b);
            System.out.println();
            System.out.println("The quotient of a and b is = " + result);
         }

         System.out.println("");
         System.out.print("Run the program again? [Y] for Yes and any input for No: ");
         resume = input.next().charAt(0);
         System.out.println("");
      } while (resume == 'y' || resume == 'Y');
   }

   public static String operator (String op) {
      return op = (" [1] Addition\n [2] Subraction\n [3] Multiplication\n [4] Division");
   }

   public static boolean isEqual(int range) {
      return range > 0 && range < 5;
   }

   public static double add(double in1, double in2) {
      double sum = in1 + in2;
      return sum;
   }

   public static double subtract(double in1, double in2) {
      double difference = in1 - in2;
      return difference;
   }

   public static double multiply(double in1, double in2) {
      double product = in1 * in2;
      return product;
   }

   public static double divide(double in1, double in2) {
      double quotient = in1 / in2;
      return quotient;
   }
}  