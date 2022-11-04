import java.util.Scanner;
public class TrashMe {
   public static void main (String[] args) {
      Scanner in = new Scanner (System.in);
      String name, helpWith;

      System.out.print("Please enter your name: ");
      name = in.nextLine();

      System.out.println("Beth: Welcome " + name + ", I am Beth, your personal Ai assistant.");
      System.out.println("Beth: How may I help you, " + name + "?");
      helpWith = in.nextLine();

      
   }
}  