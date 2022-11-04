public class SortingNumbers {
   public static void main (String [] args) {

      int [] array = {56,23,45,67,43,22,5,77,8,4,33};
      int temp;
      
      for (int i = 1; i < array.length; i++) {
         for (int j = i; j > 0; j--) {
            if (array[j] < array[j - 1]) {
            temp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = temp;
            }
         }
      }
       for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
       }
   }
}