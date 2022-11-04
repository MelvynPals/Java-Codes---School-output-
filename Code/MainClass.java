import java.util.Scanner;

public class MainClass {
   public static void main (String [] args) {
       SecondaryClass secondObject = new SecondaryClass();
      //System.out.println(secondObject.add(3, 5)); // Cannot call because private.
      System.out.println(secondObject.multiply(3, 5));
   }
}

class SecondaryClass {
    String color = "red";
    String color2 = "blue";

    private int add(int x, int y) {
        return x+y;
    }

    public int multiply(int x, int y) {
        int result = 0;
        for (int i=0; i<x; i++)
        {
            result = add(result, y);   //using the private method from the class itself.
        }
        return result;
    }
}
