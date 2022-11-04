import java.util.Scanner;
public class DayCounter {
   public static void main (String [] args) {
   Scanner in = new Scanner (System.in);
   int num1;
   int sum;
   int day = 31;
   
   System.out.print("Date today(day only): ");
   num1 = in.nextInt();
   
   sum = day - num1;
   
   System.out.println("\nHi! Today is December " + num1 + ", 2021. Just " + sum +" day/s left and it'll be another year.");
   System.out.println("You've been through so much and it is indeed, a rough year.");
   System.out.println("Still, let's be thankful for the blessings we've received.");
   System.out.println("From waking up each day to meeting Him, Her, Them, and that SOMEONE.");
   System.out.println("I love you and Advanced Happy New Year!");
   }
}