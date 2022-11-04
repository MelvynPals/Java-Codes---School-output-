import java.util.Scanner;                                                  // library
   
   public class Payroll {              
      public static void main (String [] args) {
      
         Scanner input = new Scanner (System.in);                          // create my variables
            String name;
            double gp;
            double ph, sss, lpm;
            double total;
            double ftotal;
         
      System.out.print("Enter employee's name: ");                         // employee's name
         name = input.nextLine();
      System.out.print("Enter employee's gross pay: ");                    // employee's salary
         gp = input.nextDouble();
         
      System.out.print("\nPHILHEALTH: ");                                  // employee's deductions
         ph = input.nextDouble();
      System.out.print("SSS: ");
         sss = input.nextDouble();
      System.out.print("Loan per month: ");
         lpm = input.nextDouble();
         
         total = ph + sss + lpm;                                           // employee's total deductions
         ftotal = gp - total;                                              // employye's net pay
      
      System.out.println("\nTOTAL DEDUCTIONS: " + total);                  // print the final results
      
      System.out.print(name + " will receive a NET PAY of " + ftotal);
      
      }
   
   }