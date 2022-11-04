import java.util.Scanner;
public class TestRun2 {
   public static void main (String [] args) {
      Scanner key = new Scanner (System.in);
//       String vcipher;
//       String rvc = "";
//       String frvc = "";
//       String LC = "";
//       String temp = "";
//       int num1;
//       
//       vcipher = key.nextLine(); 
//       vcipher = vcipher.replaceAll("[0-9]","");
//       //rvc = new StringBuilder(vcipher).reverse().toString();
//       
//          for (int i = 1; i < vcipher.length(); i++) {
//             for(int j = i; j > 0; j++) {
//                if (i < vcipher.length()) {
//                   temp = String.valueOf(vcipher.charAt(vcipher.length() - 1));
//                   vcipher = String.valueOf(vcipher.charAt(vcipher.length() - j));
//                   vcipher += temp;
//                }
//             }
//          }
//       
//       System.out.print(vcipher);
      
      String string;
      string = key.nextLine();
      
      System.out.println(string);
      
      string = string.replaceAll(" ", "");
      System.out.println(string);

   }
}
