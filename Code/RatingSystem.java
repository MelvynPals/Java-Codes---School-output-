import java.util.Scanner;
public class RatingSystem {
   public static void main (String [] args) {
   
      Scanner input = new Scanner (System.in);
      double grade1, grade2, grade3, grade4;
      double agrade, fgrade;
      String r10 = "denotes \nmarked excellence.", r125 = "denotes \noutstanding.", r15 = "denotes \nvery good work.";
      String r175 = "denotes \nvery satisfactory work.", r20 = "denotes \nquite good work.", r225 = "denotes \ngood work.";
      String r25 = "denotes \nsatisfactory work.", r275 = "denotes \nmoderately satisfactory work.", r30 = "denotes \npassing.";
      String r50 = "signifies failure.\nIt requires a re-enrolment and repetition of the course.";
      
         System.out.print("Enter IC111 grade: ");
         grade1 = input.nextDouble();
         System.out.print("Enter GE111 grade: ");
         grade2 = input.nextDouble();
         System.out.print("Enter GE112 grade: ");  
         grade3 = input.nextDouble();
         System.out.print("Enter IC112 grade: ");
         grade4 = input.nextDouble();
         
      agrade = grade1 + grade2 + grade3 + grade4;
      fgrade = agrade/4;
      
               System.out.println("\nYour General Weighted Average for this semester is");
                  if (fgrade >= 97.5 && fgrade <= 100) { 
                  System.out.print(fgrade + " with a rating equivalent to 1.0. This " + r10);
                
                } else if (fgrade >= 94.5 && fgrade <= 97.49) {
                  System.out.print(fgrade + " with a rating equivalent to 1.25. This " + r125);
                
                } else if (fgrade >= 91.5 && fgrade <= 94.49) {
                  System.out.print(fgrade + " with a rating equivalent to 1.5. This " + r15);
                
                } else if (fgrade >= 88.5 && fgrade <= 91.49) {
                  System.out.print(fgrade + " with a rating equivalent to 1.75. This " + r175);
                
                } else if (fgrade >= 85.5 && fgrade <= 88.49) {
                  System.out.print(fgrade + " with a rating equivalent to 2.0. This " + r20);
                
                } else if (fgrade >= 82.5 && fgrade <= 85.49) {
                  System.out.print(fgrade + " with a rating equivalent to 2.25. This " + r225);
                
                } else if (fgrade >= 79.5 && fgrade <= 82.49) {
                  System.out.print(fgrade + " with a rating equivalent to 2.50. This " + r25);
                
                } else if (fgrade >= 76.5 && fgrade <= 79.49) {
                  System.out.print(fgrade + " with a rating equivalent to 2.75. This " + r275);
                
                } else if (fgrade >= 74.5 && fgrade <= 76.49) {
                  System.out.print(fgrade + " with a rating equivalent to 3.0. This " + r30);
                
                } else if (fgrade <= 74.49 && fgrade >= 00) {
                  System.out.print(fgrade + " with a rating equivalent to 5.0. This " + r50);
                
                } else {
                  System.out.print("out of range of the parameters. ");
                  System.out.print("Please enter a valid input.");

                } 

   }
   
}