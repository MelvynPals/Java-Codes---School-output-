import java.util.Scanner;
public class FinalPROJECT_TEST {
    public static void main (String [] args) {
        Scanner key = new Scanner (System.in);
        String[] food = {"HOTDOG","BURGER","SPAGHETTI","TACO", "FRIES"};   
        String[] drink = {"COCA COLA", "ROYAL", "SPRITE", "RC", "WATER"};
        int menuFood; 

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|                      WELCOME TO ______'S STORE                      |");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|   FOOD:                         | |   DRINKS:                       |");
        System.out.println("|   [1] HOTDOG    - Php 50.00     | |   [1] COCA COLA - Php 40.00     |");
        System.out.println("|   [2] BURGER    - Php 100.00    | |   [2] ROYAL     - Php 35.00     |");
        System.out.println("|   [3] SPAGHETTI - Php 120.00    | |   [3] SPRITE    - Php 35.00     |");
        System.out.println("|   [4] TACO      - Php 80.00     | |   [4] RC        - Php 30.00     |");
        System.out.println("|   [5] FRIES     - Php 40.00     | |   [5] WATER     - Php 10.00     |");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        
        menuFood = key.nextInt();

        System.out.print(food[menuFood - 1]);
        
    }
}