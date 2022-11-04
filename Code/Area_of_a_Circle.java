import java.util.Scanner;
   
   public class Area_of_a_Circle {           //remember that A of a circle is pi(r^2)
      public static void main (String [] args) {
      
         Scanner input = new Scanner (System.in);
         double r, area;
         double pi = 3.1415;
         
            System.out.print("Enter the radius: ");
            r =  input.nextDouble();
            area = pi * (r * r);
            
            System.out.print("If the radius is " + r + "," + "the area of the circle is " + area);
       
      }
   
   }