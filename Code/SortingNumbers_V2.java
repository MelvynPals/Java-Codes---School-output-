import java.util.Scanner;
public class SortingNumbers_V2 {
   public static void main (String [] args) {
      Scanner key = new Scanner (System.in);
      int temp, size;
      
      System.out.print("Please input the size of the terms (Eg. 5): ");
      size = key.nextInt();
      int array[] = new int[size];
      
      System.out.println("\nPlease enter the terms to be sorted: ");
      for (int i = 0; i < array.length; i++) 
      array[i] = key.nextInt();
      
      for(int i = 1; i < array.length; i++) {
         for(int j = i; j > 0; j--) {
            if (array[j] < array[j - 1]) {
            temp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = temp;
            }
         }
      }
     
     System.out.println("\nThe sorted terms are: ");
     for (int i = 0; i < array.length; i++)
     System.out.println(array[i]);
      
   }
}

