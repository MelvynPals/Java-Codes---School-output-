import java.util.Scanner;
public class VCipher {
   public static void main (String [] args) {
      Scanner key = new Scanner (System.in);
      String vcipher;
      String rvc, frvc = "";
      String LC = "";
      int num1;
      
      vcipher = key.nextLine(); 
      vcipher = vcipher.replaceAll("[0-9]","");
      rvc = new StringBuilder(vcipher).reverse().toString();
      
         num1 = rvc.length() % 2;
   
         if (num1 == 1) {
            for (int i=0; i < rvc.length(); i++) {
                String traversed = String.valueOf(rvc.charAt(i)).toLowerCase();

                if (traversed.equals("a") || traversed.equals("e") || traversed.equals("i")) {
                    traversed = "v";
                }
                else if (traversed.equals("o") || traversed.equals("u")) {
                    traversed = "r";
                }

                frvc += traversed;
            }
         }            
        
         else if (num1 == 0) {
           for (int i=0; i < rvc.length(); i++) {
                String traversed = String.valueOf(rvc.charAt(i)).toLowerCase();

                if (traversed.equals("a") || traversed.equals("e") || traversed.equals("i")) {
                    traversed = "r";
                }
                else if (traversed.equals("o") || traversed.equals("u")) {
                    traversed = "v";
                }

                frvc += traversed;
            }
         }
         
      System.out.print(frvc);
   }
}