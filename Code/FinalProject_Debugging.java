import java.util.Scanner;
public class FinalProject_Debugging {
    public static void main (String [] args) {
        Scanner key = new Scanner (System.in);
        int menuFood = 0, drinks, squantity, fund;
        double temTotal = 0, Total = 0, change;
        char Fdrinks = '\0', adrinks = '\0', order, Rorder = '\0';
        char rorder, optionE = '\0', optionF = '\0';
        String quantity = "";
        char quantity1 = '\0';

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

            System.out.print("\nGOOD MORNING!\nWOULD YOU LIKE TO MAKE AN ORDER? Y/N: ");
            order = key.next().charAt(0);

            if (order == 'Y' || order == 'y') {
            System.out.print("\nCHOOSE YOUR FOOD INPUT ONE [1] TO FIVE [5] OR INPUT SIX [6] FOR DRINKS ONLY AND ANY OTHER INPUTS TO EXIT: ");
            menuFood = key.nextInt();
            
                if (menuFood == 1) {
                    do {
                        System.out.print("ENTER QUANTITY FOR HOTDOG (ONE [1] TO NINE [9] ONLY): ");
                        quantity = key.next();
                        quantity1 = quantity.charAt(0);
                        if (quantity.length() == 1) {
                            try {
                                if (quantity1 == (int)quantity1) {
                                    squantity = Integer.parseInt(String.valueOf(quantity1));
                                    double price = 50.00;
                                    temTotal = price * squantity;
                                    Total += temTotal;
                                    System.out.println("\nCURRENT TOTAL: Php " + Total);
                                    optionF = '\0';
                                } 
                            } 
                            catch (NumberFormatException e) {
                                optionF = 'y';
                                continue;
                            }
                        }
                        else {
                            optionF = 'y';
                        }
                    } while (optionF == 'y');
                } 
//                 else if (menuFood == 2) {
//                     do {
//                         System.out.print("ENTER QUANTITY FOR BURGER: ");
//                         quantity = key.next().charAt(0);
//                         try {
//                             if (quantity == (int)quantity) {
//                                 squantity = Integer.parseInt(String.valueOf(quantity));
//                                 double price = 100.00;
//                                 temTotal = price * squantity;
//                                 Total += temTotal;
//                                 System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                 optionF = '\0';
//                             } 
//                         }
//                         catch (NumberFormatException e) {
//                             optionF = 'y';
//                             continue;
//                         }
//                     } while (optionF == 'y');
//                 }
//                 else if (menuFood == 3) {
//                     do {
//                         System.out.print("ENTER QUANTITY FOR SPAGHETTI: ");
//                         quantity = key.next().charAt(0);
//                         try {
//                             if (quantity == (int)quantity) {
//                                 squantity = Integer.parseInt(String.valueOf(quantity));
//                                 double price = 120.00;
//                                 temTotal = price * squantity;
//                                 Total += temTotal;
//                                 System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                 optionF = '\0';
//                             } 
//                         }
//                         catch (NumberFormatException e) {
//                             optionF = 'y';
//                             continue;
//                         }
//                     } while (optionF == 'y');
//                 }
//                 else if (menuFood == 4) {
//                     do {
//                         System.out.print("ENTER QUANTITY FOR TACO: ");
//                         quantity = key.next().charAt(0);
//                         try {
//                             if (quantity == (int)quantity) {
//                                 squantity = Integer.parseInt(String.valueOf(quantity));
//                                 double price = 80.00;
//                                 temTotal = price * squantity;
//                                 Total += temTotal;
//                                 System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                 optionF = '\0';
//                             } 
//                         }
//                         catch (NumberFormatException e) {
//                             optionF = 'y';
//                             continue;
//                         }
//                     } while (optionF == 'y');
//                 }
//                 else if (menuFood == 5) {
//                     do {
//                         System.out.print("ENTER QUANTITY FOR FRIES: ");
//                         quantity = key.next().charAt(0);
//                         try {
//                             if (quantity == (int)quantity) {
//                                 squantity = Integer.parseInt(String.valueOf(quantity));
//                                 double price = 40.00;
//                                 temTotal = price * squantity;
//                                 Total += temTotal;
//                                 System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                 optionF = '\0';
//                             } 
//                         }
//                         catch (NumberFormatException e) {
//                             optionF = 'y';
//                             continue;
//                         }
//                     } while (optionF == 'y');
//                 }

//                 if (menuFood >= 1 && menuFood <= 5) {
//                     System.out.print("\nDO YOU WISH TO ORDER FOOD AGAIN? Y/N: ");
//                     Rorder = key.next().charAt(0);
//                 }
//                 else if (menuFood > 6) {
//                     System.exit(0);
//                 }
//             }
//             else {
//                 System.exit(0);
//             }
            
//             if (Rorder == 'Y' || Rorder == 'y') {
//                 do {
//                     System.out.println("");
//                     System.out.println("= = = = = = = = = = = = = = = = = =");
//                     System.out.println("|    PLEASE SELECT YOUR ORDER     |");
//                     System.out.println("= = = = = = = = = = = = = = = = = =");
//                     System.out.println("|   FOOD:                         |");
//                     System.out.println("|   [1] HOTDOG    - Php 50.00     |");
//                     System.out.println("|   [2] BURGER    - Php 100.00    |");
//                     System.out.println("|   [3] SPAGHETTI - Php 120.00    |");
//                     System.out.println("|   [4] TACO      - Php 80.00     |");
//                     System.out.println("|   [5] FRIES     - Php 40.00     |");
//                     System.out.println("= = = = = = = = = = = = = = = = = =");

//                     System.out.print("\nCHOOSE YOUR FOOD INPUT ONE [1] TO FIVE [5]: ");
//                     menuFood = key.nextInt();

//                     if (menuFood <= 5 || menuFood >= 1) {
//                         optionE = '\0';
//                     }
//                     if (menuFood == 1) {
//                         do {
//                             System.out.print("ENTER QUANTITY FOR HOTDOG: ");
//                             quantity = key.next().charAt(0);
//                             try {
//                                 if (quantity == (int)quantity) {
//                                     squantity = Integer.parseInt(String.valueOf(quantity));
//                                     double price = 50.00;
//                                     temTotal = price * squantity;
//                                     Total += temTotal;
//                                     System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                     optionF = '\0';
//                                 } 
//                             } 
//                             catch (NumberFormatException e) {
//                                 optionF = 'y';
//                                 continue;
//                             }
//                         } while (optionF == 'y');
//                     } 
//                     else if (menuFood == 2) {
//                         do {
//                             System.out.print("ENTER QUANTITY FOR BURGER: ");
//                             quantity = key.next().charAt(0);
//                             try {
//                                 if (quantity == (int)quantity) {
//                                     squantity = Integer.parseInt(String.valueOf(quantity));
//                                     double price = 100.00;
//                                     temTotal = price * squantity;
//                                     Total += temTotal;
//                                     System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                     optionF = '\0';
//                                 } 
//                             }
//                             catch (NumberFormatException e) {
//                                 optionF = 'y';
//                                 continue;
//                             }
//                         } while (optionF == 'y');
//                     }
//                     else if (menuFood == 3) {
//                         do {
//                             System.out.print("ENTER QUANTITY FOR SPAGHETTI: ");
//                             quantity = key.next().charAt(0);
//                             try {
//                                 if (quantity == (int)quantity) {
//                                     squantity = Integer.parseInt(String.valueOf(quantity));
//                                     double price = 120.00;
//                                     temTotal = price * squantity;
//                                     Total += temTotal;
//                                     System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                     optionF = '\0';
//                                 } 
//                             }
//                             catch (NumberFormatException e) {
//                                 optionF = 'y';
//                                 continue;
//                             }
//                         } while (optionF == 'y');
//                     }
//                     else if (menuFood == 4) {
//                         do {
//                             System.out.print("ENTER QUANTITY FOR TACO: ");
//                             quantity = key.next().charAt(0);
//                             try {
//                                 if (quantity == (int)quantity) {
//                                     squantity = Integer.parseInt(String.valueOf(quantity));
//                                     double price = 80.00;
//                                     temTotal = price * squantity;
//                                     Total += temTotal;
//                                     System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                     optionF = '\0';
//                                 } 
//                             }
//                             catch (NumberFormatException e) {
//                                 optionF = 'y';
//                                 continue;
//                             }
//                         } while (optionF == 'y');
//                     }
//                     else if (menuFood == 5) {
//                         do {
//                             System.out.print("ENTER QUANTITY FOR FRIES: ");
//                             quantity = key.next().charAt(0);
//                             try {
//                                 if (quantity == (int)quantity) {
//                                     squantity = Integer.parseInt(String.valueOf(quantity));
//                                     double price = 40.00;
//                                     temTotal = price * squantity;
//                                     Total += temTotal;
//                                     System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                     optionF = '\0';
//                                 } 
//                             }
//                             catch (NumberFormatException e) {
//                                 optionF = 'y';
//                                 continue;
//                             }
//                         } while (optionF == 'y');
//                     }
//                     else {
//                         Rorder = 'Y';
//                         optionE = 'T';
//                     }
//                     if (optionE != 'T') {
//                         System.out.print("\nDO YOU WISH TO ORDER FOOD AGAIN? Y/N: ");
//                         Rorder = key.next().charAt(0);
//                     }
//                 } while (Rorder == 'Y' || Rorder == 'y');
//             }
            
//             if (menuFood == 6) {
//                 rorder = '\0';
//             }
//             else {
//                 rorder = 'T';
//             }
            
//             if (Rorder != 'Y' || Rorder != 'y' || menuFood == 6) {
//                 if (rorder == 'T') {
//                 System.out.print("\nDO YOU WISH TO ADD DRINKS? Y/N: ");
//                 Fdrinks = key.next().charAt(0);
//                 }

//                 if (Fdrinks == 'Y' || Fdrinks == 'y' || menuFood == 6) {
//                     do {
//                         System.out.println("");
//                         System.out.println("= = = = = = = = = = = = = = = = = =");
//                         System.out.println("|    PLEASE SELECT YOUR ORDER     |");
//                         System.out.println("= = = = = = = = = = = = = = = = = =");
//                         System.out.println("|   DRINKS:                       |");
//                         System.out.println("|   [1] COCA COLA - Php 40.00     |");
//                         System.out.println("|   [2] ROYAL     - Php 35.00     |");
//                         System.out.println("|   [3] SPRITE    - Php 35.00     |");
//                         System.out.println("|   [4] RC        - Php 30.00     |");
//                         System.out.println("|   [5] WATER     - Php 10.00     |");
//                         System.out.println("= = = = = = = = = = = = = = = = = =");

//                         System.out.print("\nCHOOSE YOUR DRINK INPUT ONE [1] TO FIVE [5]: ");
//                         drinks = key.nextInt();

//                         if (drinks <= 5 || drinks >= 1) {
//                             optionE = '\0';
//                         }
//                         if (drinks == 1) {
//                             do {
//                                 System.out.print("ENTER QUANTITY FOR COCA COLA: ");
//                                 quantity = key.next().charAt(0);
//                                 try {
//                                     if (quantity == (int)quantity) {
//                                         squantity = Integer.parseInt(String.valueOf(quantity));
//                                         double price = 40.00;
//                                         temTotal = price * squantity;
//                                         Total += temTotal;
//                                         System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                         optionF = '\0';
//                                     } 
//                                 }
//                                 catch (NumberFormatException e) {
//                                     optionF = 'y';
//                                     continue;
//                                 }
//                             } while (optionF == 'y');
//                         }
//                         else if (drinks == 2) {
//                             do {
//                                 System.out.print("ENTER QUANTITY FOR ROYAL: ");
//                                 quantity = key.next().charAt(0);
//                                 try {
//                                     if (quantity == (int)quantity) {
//                                         squantity = Integer.parseInt(String.valueOf(quantity));
//                                         double price = 35.00;
//                                         temTotal = price * squantity;
//                                         Total += temTotal;
//                                         System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                         optionF = '\0';
//                                     } 
//                                 }
//                                 catch (NumberFormatException e) {
//                                     optionF = 'y';
//                                     continue;
//                                 }
//                             } while (optionF == 'y');
//                         }
//                         else if (drinks == 3) {
//                             do {
//                                 System.out.print("ENTER QUANTITY FOR SPRITE: ");
//                                 quantity = key.next().charAt(0);
//                                 try {
//                                     if (quantity == (int)quantity) {
//                                         squantity = Integer.parseInt(String.valueOf(quantity));
//                                         double price = 35.00;
//                                         temTotal = price * squantity;
//                                         Total += temTotal;
//                                         System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                         optionF = '\0';
//                                     } 
//                                 }
//                                 catch (NumberFormatException e) {
//                                     optionF = 'y';
//                                     continue;
//                                 }
//                             } while (optionF == 'y');
//                         }
//                         else if (drinks == 4) {
//                             do {
//                                 System.out.print("ENTER QUANTITY FOR RC: ");
//                                 quantity = key.next().charAt(0);
//                                 try {
//                                     if (quantity == (int)quantity) {
//                                         squantity = Integer.parseInt(String.valueOf(quantity));
//                                         double price = 30.00;
//                                         temTotal = price * squantity;
//                                         Total += temTotal;
//                                         System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                         optionF = '\0';
//                                     } 
//                                 }
//                                 catch (NumberFormatException e) {
//                                     optionF = 'y';
//                                     continue;
//                                 }
//                             } while (optionF == 'y');
//                         }
//                         else if (drinks == 5) {
//                             do {
//                                 System.out.print("ENTER QUANTITY FOR ROYAL: ");
//                                 quantity = key.next().charAt(0);
//                                 try {
//                                     if (quantity == (int)quantity) {
//                                         squantity = Integer.parseInt(String.valueOf(quantity));
//                                         double price = 35.00;
//                                         temTotal = price * squantity;
//                                         Total += temTotal;
//                                         System.out.println("\nCURRENT TOTAL: Php " + Total);
//                                         optionF = '\0';
//                                     } 
//                                 }
//                                 catch (NumberFormatException e) {
//                                     optionF = 'y';
//                                     continue;
//                                 }
//                             } while (optionF == 'y');
//                         }
//                         else {
//                             adrinks = 'Y';
//                             optionE = 'T';
//                         }
//                         if (optionE != 'T') {
//                             System.out.print("\nDO YOU WISH TO ORDER DRINKS AGAIN? Y/N: ");
//                             adrinks = key.next().charAt(0);
//                         }
//                     } while (adrinks == 'Y' || adrinks == 'y');
//                 }
//             }

//             do {
//                 System.out.println("\nTOTAL PAYMENT: Php " + Total);
//                 System.out.print("FUNDS: Php ");
//                 fund = key.nextInt();
                
//                 if (fund >= Total) {
//                     change = fund - Total;
//                     System.out.println("\nCHANGE: Php " + change);
//                     System.out.println("\nTHANK YOU COME AGAIN!!!");
//                 }
//                 else {
//                     System.out.println("INSUFFICIENT FUNDS PLEASE TRY AGAIN!");
//                 }
//             } while (fund < Total);          
    }
}
}