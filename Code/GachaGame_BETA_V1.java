import java.util.Scanner;
import java.util.Random;
public class GachaGame_BETA_V1 {
   public static void main (String [] args) {
      Scanner in = new Scanner (System.in);
      ItemList il = new ItemList(); 

      char SE;

      System.out.println("Welcome to my Gacha Game Version 1");
      System.out.println("\"Please note that this is the BETA Version\"");
      do {
         System.out.print("Enter [1] to START or [0] to EXIT: ");
         SE = in.next().charAt(0);
      } while (SE != '0' && SE != '1');
      System.out.println("");

      if (SE == '1') {
         il.plot();
         il.getWeapons();
         il.plot2();
      } else {
         System.exit(0);
      }
   }
}

class ItemList extends Rng {
   String[] weapons = {"Mistsplitter Reforged", "The Black Sword", "Dull Blade", "Festering Desire", "Silver Sword", "Fillet Blade", "Iron Sting", "Dark Iron Sword", "Summit Shaper", "Cinnabar Sprindle"};
   
   void plot() {
      Scanner in = new Scanner (System.in);
      char strt;

      System.out.println("\nWelcome traveler! your journey to the Gacha World begins here and help us fight the dark forces of evil.");
      System.out.println("Oh no traveler, looks like u need a new weapon! It is time for you to test your luck in our \"Weapon Stash System\".");
      do {
         System.out.print("Press one [1] traveler to test your luck: ");
         strt = in.next().charAt(0);
      } while (strt != '1');
      System.out.println("");
   }

   void plot2() {
      if (fixnum == 2 || fixnum == 5 || fixnum == 7) {
         System.out.println("\nWell traveler, luck was not on your side today. But it doesn't matter as long you are in our side no one can stop us!");
         System.out.print("Our next journey is to the Dark Woods of Valmir.");
         System.out.println(" Come fort traveler!");
         System.out.println("\n\"You with your handy sword go to the Dark Woods of Valmir\"");
         System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~ To be continue ~~~~~~~~~~~~~~~~~~~~~~~~");
      } else {
         System.out.println("\nWow traveler! you got one of our best weapons! With you on our side we are unstoppable!!");
         System.out.println("Those monsters won't have a change against your legendary sword, hehe.");
         System.out.print("Our next journey is to the Dark Woods of Valmir.");
         System.out.println(" Come fort traveler!");
         System.out.println("\n\"You with your legendary sword go to the Dark Woods of Valmir\"");
         System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~ To be continue ~~~~~~~~~~~~~~~~~~~~~~~~");    
      }
   }
}

class Rng {
   Random rand = new Random();
   int max = 9;
   int random = rand.nextInt(max);
   final int fixnum = random;

   public void getWeapons() {
      ItemList il = new ItemList();
      switch (fixnum) {
         case 0: 
         System.out.println("\"You got a 5 star weapon \"" + il.weapons[0] + "!\" A sword that blazes with a fierce violet light. The name \"Reforged\" comes from it \nhaving been broken once before.\"");
         break;
         case 1:
         System.out.println("\"You got a 4 star weapon \"" + il.weapons[1] + "!\" A pitch-black longsword that thirsts for violence and conflict. It is said that this \nweapon can cause its user to become drunk on the red wine of slaughter.\"");
         break;
         case 2:
         System.out.println("\"You got a 1 star weapon \"" + il.weapons[2] + "!\" Youthful dreams and the thrill of adventure. If this isn't enough, then make it up \nwith valiance.\"");
         break;
         case 3:
         System.out.println("\"You got a 4 star weapon \"" + il.weapons[3] + "!\" A creepy straight sword that almost seems to yearn for life. It drips with a shriveling \nvenom that could even corrupt a mighty dragon.\"");
         break; 
         case 4:
         System.out.println("\"You got a 2 star weapon \"" + il.weapons[4] + "!\" A sword for chasing away demons. Everyone knows it's made of a silver alloy, not pure silver.\"");
         break;
         case 5:
         System.out.println("\"You got a 3 star weapon \"" + il.weapons[5] + "!\" A sharp filleting knife. The blade is long, thin, and incredibly sharp.\"");
         break;
         case 6:
         System.out.println("\"You got a 4 star weapon \"" + il.weapons[6] + "!\" An exotic long-bladed rapier that is light, agile, and sharp.\"");
         break;
         case 7:
         System.out.println("\"You got a 3 star weapon \"" + il.weapons[7] + "!\" A perfectly ordinary iron sword, just slightly darker than most.\"");
         break;
         case 8:
         System.out.println("\"You got a 5 star weapon \"" + il.weapons[8] + "!\" A symbol of a legendary pact, this sharp blade once cut off the peak of a mountain.\"");
         break;
         case 9:
         System.out.println("\"You got a 4 star weapon \"" + il.weapons[9] + "!\" A sword made from materials that do not belong in this world. The power within might even \nbe able to withstand the corruption of a venom that could corrode a mighty dragon.\"");
         break;
      }
   }
}