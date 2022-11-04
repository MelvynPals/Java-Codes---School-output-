import java.util.Scanner;
public class ILoveYouLoop {
  public static void main (String [] args) {

  String enter;
  int i, j = 0;
  int r = 1;

   Scanner input = new Scanner (System.in);

   System.out.print("Enter your chosen maximum number: ");
   i = input.nextInt();
   System.out.print("Enter one [1] for without \"too\" and two [2] for with \"too\": ");
   j = input.nextInt();
   System.out.println("");
   
   if (j==1) {
      while (r <= i) {
         System.out.println("I LOVE YOU " + r + "%");
         r++;
      }
   }
   else {
         while (r <= i) {
            System.out.println("I LOVE YOU TOO " + r + "%");
            r++;
         }
      }                
   }
}


               