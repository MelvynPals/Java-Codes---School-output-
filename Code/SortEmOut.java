import java.util.Scanner;
public class SortEmOut {
   public static void main (String [] args) {
      Scanner input = new Scanner (System.in);
      int[] array = new int [20];
      int number = 0;
      int count = 0;
      int temp = 0;
      final int QUIT = 999;
      final int MAX = 20;
      
         number = input.nextInt();
         
         while (number != QUIT) {
         array[count] = number;
         count++; 
            
            if (count == MAX)
            number = QUIT;
            
            else {
            number = input.nextInt();
            }
         }

         int size = count;
         int[] array2 = new int[size];
                  
         System.out.print("\nEnter 1 for asc, 2 for desc: ");
         int option = input.nextInt();
         
         if (option == 1) {
            for(int i = 1; i < array2.length; i++) {
               for (int j = i; j > 0; j--) {
                  if (array[j] < array[j - 1]) {
                     temp = array[j];
                     array[j] = array[j - 1];
                     array[j - 1] = temp;
                  }
               }
            }
         }
         
         if (option == 2) {
            for(int i = 1; i < array2.length; i++) {
               for(int j = i; j > 0; j--) {
                  if (array[j] > array[j - 1]) {
                     temp = array[j - 1];
                     array[j - 1] = array[j];
                     array[j] = temp;
                  }
               }
            }
         }
         
      System.out.println("");
      System.arraycopy(array, 0, array2, 0, size);
      
      for (int i = 0; i < count; i++) {
      System.out.println(array2[i]);
      }
   }
}