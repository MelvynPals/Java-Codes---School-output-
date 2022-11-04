import java.util.Scanner;
public class GradeCalculator {
   public static void main (String [] args) {
   
   Scanner test = new Scanner (System.in);
   double Qz, Ass, Exm, OralR;
   double Qz1, Qz2, Ass1, Ass2, Exm1, OralR1;
   double QzA, AssA;
   double QzP, AssP, ExmP, OralRP;
   double tg;
   
      System.out.println("Enter your desired grading system (in percentage) with \na total of 100%");
      
      System.out.print("\nQuiz - ");
         Qz = test.nextDouble();
      System.out.print("Assignment - ");
         Ass = test.nextDouble();
      System.out.print("Exam - ");
         Exm = test.nextDouble();
      System.out.print("Oral Recitation - ");
         OralR = test.nextDouble();

      System.out.print("\nEnter quiz 1 raw score: ");
         Qz1 = test.nextDouble();
      System.out.print("Enter quiz 2 score: ");
         Qz2 = test.nextDouble();
      System.out.print("Enter assignment 1 score: ");
         Ass1 = test.nextDouble();
      System.out.print("Enter assignment 2 score: ");
         Ass2 = test.nextDouble();
      System.out.print("Enter exam score: ");
         Exm1 = test.nextDouble();
      System.out.print("Enter oral recitation score: ");
         OralR1 = test.nextDouble();
         
                  QzA = Qz1 + Qz2;
                  QzA = QzA/2;
                  QzP = (Qz/100) * QzA;
            System.out.println("\nQuiz Average: " + QzA);
            System.out.println(Qz + " percent of " + QzA + " is " + QzP);
            
                  AssA = Ass1 + Ass2;
                  AssA = AssA/2;
                  AssP = (Ass/100) * AssA;
            System.out.println("\nAssignment Average: ");
            System.out.println(Ass + " percent of " + AssA + " is " + AssP);
            
                  ExmP = (Exm/100) * Exm1;
            System.out.println("\n" + Exm + " percent of " + Exm1 + " is " + ExmP);
            
                  OralRP = (OralR/100) * OralR1;
            System.out.println(OralR + " percent of " + OralR1 + " is " + OralRP);
            
               tg = QzP + AssP + ExmP + OralRP;
            System.out.println("\nTOTAL GRADE is " + tg);
            
      if (tg >= 97.5 && tg <= 100) { 
      System.out.print("Rating: 1.0 ");
    
    } else if (tg >= 94.5 && tg <= 97.49) {
      System.out.print("Rating: 1.25");
    
    } else if (tg >= 91.5 && tg <= 94.49) {
      System.out.print("Rating: 1.5");
    
    } else if (tg >= 88.5 && tg <= 91.49) {
      System.out.print("Rating: 1.75");
    
    } else if (tg >= 85.5 && tg <= 88.49) {
      System.out.print("Rating: 2.0");
    
    } else if (tg >= 82.5 && tg <= 85.49) {
      System.out.print("Rating: 2.25");
    
    } else if (tg >= 79.5 && tg <= 82.49) {
      System.out.print("Rating: 2.5");
    
    } else if (tg >= 76.5 && tg <= 79.49) {
      System.out.print("Rating: 2.75");
    
    } else if (tg >= 74.5 && tg <= 76.49) {
      System.out.print("Rating: 3.0");
    
    } else if (tg <= 74.49 && tg >= 00) {
      System.out.print("Rating: 5.0");
    
    }
               
   }

}