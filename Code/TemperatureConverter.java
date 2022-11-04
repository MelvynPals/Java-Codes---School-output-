import java.util.Scanner;
public class TemperatureConverter {
   public static void main (String [] args) {
      Scanner input = new Scanner (System.in);
      char entercf, option;   
      double num; 
      double C, F;
         
         do {System.out.print("Enter c or f: ");
            entercf = input.next().charAt(0);
            System.out.print("\n");
            
            if (entercf == 'c'|| entercf == 'C') {
               System.out.print("Enter number to be converted: " );
               num = input.nextDouble();
               F = (1.8*num) + 32;
               System.out.println(num + " degrees Celsius is equal to " + F + " degrees Fahrenheit.");    
               System.out.print("\n");
               } 
               
            else if (entercf == 'f'|| entercf == 'F') {
               System.out.print("Enter number to be converted: " );
               num = input.nextDouble();
               C = (num - 32)/1.8;
               System.out.println(num + " degrees Fahrenheit is equal to " + C + " degrees Celsius.");
               System.out.print("\n");
               }
               
            else {
               System.out.println("You have inputted an invalid character!");
               System.out.print("\n");
               }
   
         System.out.print("You want to convert again? [Y/N]: ");
         option = input.next().charAt(0);
         System.out.print("\n");
      } while (option == 'y' || option == 'Y');
   }
}