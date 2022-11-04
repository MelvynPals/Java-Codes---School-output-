import java.util.Scanner;
public class VCipherF {
   public static void main (String [] args) {
      Scanner key = new Scanner (System.in);
      String vcipher;
      String rvc, frvc1 = "", frvc2 = "";
      String LC = "";
      int count = 0;
      int num1; 
      
      vcipher = key.nextLine(); 
      vcipher = vcipher.replaceAll("[0-9]","");
      rvc = new StringBuilder(vcipher).reverse().toString();
      
         num1 = rvc.length() % 2;
   
         if (num1 == 1) {
            LC = rvc.toLowerCase();
            frvc1 = LC.replaceAll("[a,e,i]", "v");
            frvc2 = frvc1.replaceAll("[o,u]", "r");        
            }
 
         else {
            LC = rvc.toLowerCase();
            frvc1 = LC.replaceAll("[a,e,i]", "r");
            frvc2 = frvc1.replaceAll("[o,u]", "v");
            }
         
      System.out.print(frvc2);
   }
}