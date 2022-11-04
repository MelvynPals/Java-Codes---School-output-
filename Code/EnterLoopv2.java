import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class EnterLoopv2 {

   private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9]+");
   }
   
   public static void enterIn() {
        System.out.println("DATE AND TIME:");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now)); 
        System.out.println("");
        System.out.println("Welcome to my Enter and Loop Version 2 program!");
        
        System.out.print("Enter your sentence: ");
   }
   
   public static void equationMethods() {
      Scanner input = new Scanner (System.in);
      String enter, i;
      int j = 0;
      
      enter = input.nextLine();

      do {
         System.out.print("Enter the number of loop/s: ");
         i = input.nextLine();
         String try1 = new String(i);
         try1 = try1.replaceAll("\\s+","");

         try {
            j = Integer.parseInt(try1);
         } 
         catch (NumberFormatException e) {
            System.out.println("\nSystem Error:\nUnable to recognize input. Please try again.");
            continue;
         } 

      } while (isNumeric(i) != true);
   
   System.out.println("");
   int r=1;
   while (r <= j) {
      System.out.println(enter);
      r++;
      }
   }
    
   public static void main (String [] args) {
      EnterLoopv2 myObject = new EnterLoopv2();
      myObject.enterIn();
      myObject.equationMethods();      
   }
} 