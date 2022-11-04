import java.util.Scanner;
   
     public class LawOfMotion {                                //second law of motion is Force is equal to Mass times acceleration
       public static void main (String [] args) {
       
         Scanner input = new Scanner (System.in);
         double m, a, force;
         
         System.out.print("Enter the mass of the object: ");
         m = input.nextDouble();
         System.out.print("Enter the acceleration of the  objct: ");
         a = input.nextDouble();
         
         force = m * a;
         System.out.print("The required Force of an object with given mass and acceleration is " + force);
       
       
       }
     
     }