import java.util.Scanner;
public class Decisions {
   public static void main (String [] args) {
   
      Scanner test = new Scanner (System.in);
      int menu;
      
         System.out.println("Choose your ordr!");
         System.out.println("[1] Burger"); 
         System.out.println("[2] Spaghetti"); 
         System.out.println("[3] Coca-cola");
      
         System.out.print("\nPlease choose your order: ");
         menu = test.nextInt();
            
            if (menu == 1) {
               System.out.print("\nYour order is burger!");
               }
            else if (menu == 2) {
               System.out.print("\nYour order is spaghetti!");
               }
            else if (menu == 3) {
               System.out.print("\nYour order is Coca-cola! "); 
               }
            else {
               System.out.print("\nPlease input a valid option."); 
               }
               
   }

}