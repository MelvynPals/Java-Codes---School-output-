import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.Math;
public class BasiCal_Circle extends CircleSolver {
   public static void main (String [] args) {
      Scanner in = new Scanner (System.in);
      int opCC = 0;
      String str, str2;
      char again = '\0';
      
      dateTime();
      System.out.println("\nAbout the Circle:");
      System.out.println("\n\tA circle is all points in a plane that are a fixed distance from a given point on the plane.");
      System.out.println("The given point is called the center, and the fixed distance is called the radius.");
      System.out.println("This is the general standard equation for the circle centered at (h, k) with radius r.");
      System.out.println("The Circle General Standard Equation is (x - h)^2 + (Y - k)^2 = r^2");
      System.out.println("For example, the equation of the circle centered at (1,2) with the radius 3 is (x - 1)^2 + (y - 2) = 9");

      do {
         System.out.print("\nPress one [1] to use the GSE of the Circle Calcultor: ");
         str = in.nextLine();
         str2 = new String(str);
         str2 = str2.replaceAll("\\s+","");
         try {
            opCC =Integer.parseInt(str2);
         } catch (NumberFormatException e) {
            continue;
         }
      } while (isNumeric(str) != true);

      do {
         if (myOption(opCC) == true){
            centerRadiusEq();
            finalSolution();
            System.out.print("\nDo you want to calculate again? [Y] for yes and other inputs for no: ");
            again = in.next().charAt(0);
         }
         else {
            System.exit(0);
         }
      } while (again == 'Y' || again == 'y');
   }

   private static void dateTime() {
      System.out.println("DATE AND TIME:");
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
      System.out.println(dtf.format(now)); 
   }

   static boolean myOption(int num) {
      return num == 1;
   }

   static boolean isNumeric(String str) {
      return str != null && str.matches("[0-9]+");
 }
}

class CircleSolver {
   static double h, k, r;
   static double solveh, solvek, solver;
   
   static double centerH(double num) {
      return h = num;
   }
   static double centerK(double num) {
      return k = num;
   }
   static double radiusR(double num) {
      return r = num;
   }

   static void centerRadiusEq() {
      Scanner in = new Scanner (System.in);
      System.out.print("\nEnter the value of h: ");
      double forh = in.nextDouble();
      solveh = centerH(forh);
      
      System.out.print("Enter the value of k: ");
      double fork = in.nextDouble();
      solvek = centerK(fork);
      
      System.out.print("Enter the value of the radius [r^2]: ");
      double forr = in.nextDouble();
      solver = radiusR(forr);
   }

   static void finalSolution() {
      if (solveh == 0 && solvek == 0) {
         // this is a rock if you pour water on the rock nothing happens~~
      }
      else if (solveh < 0 || solveh > 0 && solvek == 0) {
         solveh = solveh * -1.0;
      }
      else if (solveh == 0 && solvek < 0 || solvek > 0) {
         solvek = solvek * -1.0;
      } 
      else {
         solveh = solveh * -1.0;
         solvek = solvek * -1.0;
      }
      solver = Math.sqrt(solver);

      System.out.println("\nThe center of the circle is: (" + solveh + ", " + solvek + ")");
      System.out.println("The radius [r] of the circle is: " + solver);
      System.out.println("The General Standard Equation of the circle (x - h)^2 + (Y - k)^2 = r^2 is:");

      if (solveh < 0 && solvek < 0) {
         System.out.println("(x + " + solveh * -1 + ")^2" + " + " + "(y + " + solvek * -1.0 + ")^2" + " = " + solver * solver);
      }
      else if (solveh > 0 && solvek > 0) {
         System.out.println("(x - " + solveh + ")^2" + " + " + "(y - " + solvek + ")^2" + " = " + solver * solver);
      }
      else if (solveh < 0 && solvek > 0) {
         System.out.println("(x + " + solveh * -1 + ")^2" + " + " + "(y - " + solvek + ")^2" + " = " + solver * solver);
      }
      else if (solveh > 0 && solvek < 0) {
         System.out.println("(x - " + solveh + ")^2" + " + " + "(y + " + solvek * -1.0 + ")^2" + " = " + solver * solver);
      }
      else if (solveh == 0 && solvek < 0) {
         System.out.println("x^2" + " + " + "(y + " + solvek * -1.0 + ")^2" + " = " + solver * solver);
      }
      else if (solveh == 0 && solvek > 0) {
         System.out.println("x^2" + " + " + "(y - " + solvek + ")^2" + " = " + solver * solver);
      }
      else if (solveh > 0 && solvek == 0) {
         System.out.println("(x - " + solveh + ")^2" + " + " + "y^2" + " = " + solver * solver);
      }
      else if (solveh < 0 && solvek == 0) {
         System.out.println("(x + " + solveh * -1 + ")^2" + " + " + "y^2" + " = " + solver * solver);
      }
      else {
         System.out.println("x^2 + y^2" + " = " + solver * solver);
      } 
      
   }
}