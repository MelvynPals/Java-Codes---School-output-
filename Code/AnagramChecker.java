import java.util.Scanner;
public class AnagramChecker {
   static String Fword, Sword;
   static String Fwordtrim, Swordtrim;
public static void main (String [] args) {
   Scanner in = new Scanner (System.in);
   System.out.println("Anagram Checker");
   
   System.out.print("\nEnter First word: ");
   Fword = in.nextLine();
   System.out.print("Enter Second word: ");
   Sword = in.nextLine();

   Fwordtrim = Fword.replaceAll("\\s+","");
   Swordtrim = Sword.replaceAll("\\s+","");
   Fwordtrim = Fwordtrim.toLowerCase();
   Swordtrim = Swordtrim.toLowerCase();

      for (int i = 0; i < Fwordtrim.length(); i++) {
         for (int j = 0; j < Fwordtrim.length(); j++) { 
            try {
               if (Fwordtrim.charAt(i) == Swordtrim.charAt(j)) {
                  int position = j;
                  Swordtrim = Swordtrim.substring(0, position) + Swordtrim.substring(position+1);
                  j = Fwordtrim.length();
               }
            } catch (StringIndexOutOfBoundsException e) {
               System.out.println(Fword + " and " + Sword + " are not anagrams!");
               return;
            }
         }
      }

      if (identifyAnagram(Swordtrim) == true) {
         System.out.println(Fword + " and " + Sword + " are anagrams!");
      }
      else {
         System.out.println(Fword + " and " + Sword + " are not anagrams!");
      }
   } 

   public static boolean identifyAnagram(String iA) {
      return iA == "";
   }
}