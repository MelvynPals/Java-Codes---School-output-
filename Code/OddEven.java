import java.util.Scanner;
public class OddEven {
   public static void main (String [] args) {
   Scanner in = new Scanner (System.in);
   int num;
   
   System.out.println("Is the number even?");
   num = in.nextInt();
   
   System.out.println(isEven(num));
   }
   
   private static boolean isEven(int num) {
      int result = num % 2;
      return result == 0;
   }
}