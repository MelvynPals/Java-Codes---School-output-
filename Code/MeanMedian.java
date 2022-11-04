import java.util.Scanner;
public class MeanMedian{
   public static void main (String [] args) {
      tripleMSolution tMS = new tripleMSolution();  
      tMS.meanMedianMode();
   }
}

class tripleMSolution {
   Scanner in = new Scanner (System.in);
   int array[];
   public void meanMedianMode () {
      int temp, size, median;
      boolean identify;

      System.out.print("Please input the maximum number of terms: ");
      size = in.nextInt();
      int array[] = new int[size];

      System.out.println("\nPlease enter the terms for the mean & median operation: ");
      for (int i = 0; i < array.length; i++) 
      array[i] = in.nextInt();

      for(int i = 1; i < array.length; i++) {
         for(int j = i; j > 0; j--) {
            if (array[j] < array[j - 1]) {
            temp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = temp;
            }
         }
      }

      System.out.println("\nThe sorted terms or mode are: ");
      for (int i = 0; i < array.length; i++)
      System.out.println(array[i]);

      double smean;
      int fmean = array[0];
      for (int i = 1; i < array.length; i++) {
         fmean = fmean + array[i];
      }
      smean = (double) fmean / array.length;
      System.out.println("\nMean: " + smean);

      identify = isEven(array.length);

      if (identify == false) {
         median = array.length + 1;
         median = median / 2;
         System.out.print("\nMedian: " + array[median - 1]);
      } else {
         median = array.length / 2;
         int median1 = median + 1;
         double fmedian = array[median - 1] + array[median1 - 1];
         fmedian = (double) fmedian / 2;
         System.out.print("\nMedian: " + fmedian);
      }
   }

   private static boolean isEven(int num) {
      int result = num % 2;
      return result == 0;
   }
}