import java.util.Scanner;
import java.util.ArrayList;

public class FinalProject_PP {
	
	public static class Menu {
		String name;
		double price;
		
		public Menu(String name, double price) {
			this.name = name;
			this.price = price;
		}
	}
	
    public static void main (String [] args) {
        Scanner key = new Scanner (System.in);
        int menuFood = 0, drink, squantity, fund;
        double temTotal = 0, Total = 0, change;
        char Fdrinks = '\0', adrinks = '\0', order, Rorder = '\0';
        char rorder, optionE = '\0', optionF = '\0', quantity = '\0';
        
        ArrayList<Menu> foods = new ArrayList<Menu>();
        foods.add(new Menu("HOTDOG", 50.00));
        foods.add(new Menu("BURGER", 100.00));
        foods.add(new Menu("SPAGHETTI", 120.00));
        foods.add(new Menu("TACO", 80.00));
        foods.add(new Menu("FRIES", 40.00));
        
        ArrayList<Menu> drinks = new ArrayList<Menu>();
        drinks.add(new Menu("COCA COLA", 40.00));
        drinks.add(new Menu("ROYAL", 35.00));
        drinks.add(new Menu("SPRITE", 35.00));
        drinks.add(new Menu("RC", 30.00));
        drinks.add(new Menu("WATER", 10.00));

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|                      WELCOME TO ______'S STORE                      |");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|   FOOD:                         | |   DRINKS:                       |");
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(String.format("|   [%d] %s - Php %06.2f    | |   [%d] %s - Php %.2f     |", i+1, foods.get(i).name, foods.get(i).price, i+1, drinks.get(i).name, drinks.get(i).price));
        }
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        
        // ArrayList to Save what the user have ordered
        ArrayList<Menu> orderedMenu = new ArrayList<Menu>();
        ArrayList<Integer> orderedQty = new ArrayList<Integer>();

        System.out.print("\nGOOD MORNING!\nWOULD YOU LIKE TO MAKE AN ORDER? Y/N: ");
        order = key.next().charAt(0);

        if (order == 'Y' || order == 'y') {
	        System.out.print("\nCHOOSE YOUR FOOD INPUT ONE [1] TO FIVE [5] OR INPUT SIX [6] FOR DRINKS ONLY AND ANY OTHER INPUTS TO EXIT: ");
	        menuFood = key.nextInt();
	        
	        do {
	        	Menu selectedMenu = foods.get(menuFood-1);
	            System.out.print(String.format("ENTER QUANTITY FOR %s: ", selectedMenu.name));
	            quantity = key.next().charAt(0);
	            try {
	                if (quantity == (int)quantity) {
	                    squantity = Integer.parseInt(String.valueOf(quantity));
	                    
	                    orderedMenu.add(selectedMenu);
	                    orderedQty.add(squantity);
	                    
	                    temTotal = selectedMenu.price * squantity;
	                    Total += temTotal;
	                    System.out.println("\nCURRENT TOTAL: Php " + Total);
	                    optionF = '\0';
	                } 
	            } 
	            catch (NumberFormatException e) {
	                optionF = 'y';
	                continue;
	            }
	            
	        	//Print temporary summary of ordered menus
	            for (int i=0; i < orderedMenu.size(); i++) {
	            	System.out.println(String.format("%0s %d %06.2f", orderedMenu.get(i).name, orderedQty.get(i), orderedQty.get(i)*orderedMenu.get(i).price));
	            }
	        } while (optionF == 'y');
	
	        if (menuFood >= 1 && menuFood <= 5) {
	            
	            System.out.print("\nDO YOU WISH TO ORDER FOOD AGAIN? Y/N: ");
	            Rorder = key.next().charAt(0);
	        }
	        else if (menuFood > 6) {
	            System.exit(0);
	        }
	    }
	    else {
	        System.exit(0);
	    }
        if (Rorder == 'Y' || Rorder == 'y') {
            do {
                System.out.println("");
                System.out.println("= = = = = = = = = = = = = = = = = =");
                System.out.println("|    PLEASE SELECT YOUR ORDER     |");
                System.out.println("= = = = = = = = = = = = = = = = = =");
                System.out.println("|   FOOD:                         |");
                System.out.println("|   [1] HOTDOG    - Php 50.00     |");
                System.out.println("|   [2] BURGER    - Php 100.00    |");
                System.out.println("|   [3] SPAGHETTI - Php 120.00    |");
                System.out.println("|   [4] TACO      - Php 80.00     |");
                System.out.println("|   [5] FRIES     - Php 40.00     |");
                System.out.println("= = = = = = = = = = = = = = = = = =");

                System.out.print("\nCHOOSE YOUR FOOD INPUT ONE [1] TO FIVE [5]: ");
                menuFood = key.nextInt();

                if (menuFood <= 5 || menuFood >= 1) {
                    optionE = '\0';                    
                    do {
        	        	Menu selectedMenu = foods.get(menuFood-1);
        	            System.out.print(String.format("ENTER QUANTITY FOR %s: ", selectedMenu.name));
        	            quantity = key.next().charAt(0);
        	            try {
        	                if (quantity == (int)quantity) {
        	                    squantity = Integer.parseInt(String.valueOf(quantity));
        	                    
        	                    orderedMenu.add(selectedMenu);
        	                    orderedQty.add(squantity);
        	                    
        	                    temTotal = selectedMenu.price * squantity;
        	                    Total += temTotal;
        	                    System.out.println("\nCURRENT TOTAL: Php " + Total);
        	                    optionF = '\0';
        	                } 
        	            } 
        	            catch (NumberFormatException e) {
        	                optionF = 'y';
        	                continue;
        	            }

        	            
        	        	//Print temporary summary of ordered menus
        	            for (int i=0; i < orderedMenu.size(); i++) {
        	            	System.out.println(String.format("%0$-9s %d %06.2f", orderedMenu.get(i).name, orderedQty.get(i), orderedQty.get(i)*orderedMenu.get(i).price));
        	            }
        	        } while (optionF == 'y');
                }
                else {
                    Rorder = 'Y';
                    optionE = 'T';
                }
                
                
                if (optionE != 'T') {
                    System.out.print("\nDO YOU WISH TO ORDER FOOD AGAIN? Y/N: ");
                    Rorder = key.next().charAt(0);
                }
            } while (Rorder == 'Y' || Rorder == 'y');
        }
        
        if (menuFood == 6) {
            rorder = '\0';
        }
        else {
            rorder = 'T';
        }
        
        if (Rorder != 'Y' || Rorder != 'y' || menuFood == 6) {
            if (rorder == 'T') {
            System.out.print("\nDO YOU WISH TO ADD DRINKS? Y/N: ");
            Fdrinks = key.next().charAt(0);
            }

            if (Fdrinks == 'Y' || Fdrinks == 'y' || menuFood == 6) {
                do {
                    System.out.println("");
                    System.out.println("= = = = = = = = = = = = = = = = = =");
                    System.out.println("|    PLEASE SELECT YOUR ORDER     |");
                    System.out.println("= = = = = = = = = = = = = = = = = =");
                    System.out.println("|   DRINKS:                       |");
                    System.out.println("|   [1] COCA COLA - Php 40.00     |");
                    System.out.println("|   [2] ROYAL     - Php 35.00     |");
                    System.out.println("|   [3] SPRITE    - Php 35.00     |");
                    System.out.println("|   [4] RC        - Php 30.00     |");
                    System.out.println("|   [5] WATER     - Php 10.00     |");
                    System.out.println("= = = = = = = = = = = = = = = = = =");

                    System.out.print("\nCHOOSE YOUR DRINK INPUT ONE [1] TO FIVE [5]: ");
                    drink = key.nextInt();

                    if (drink <= 5 || drink >= 1) {
                        optionE = '\0';
                    }
                    if (drink == 1) {
                        do {
                            System.out.print("ENTER QUANTITY FOR COCA COLA: ");
                            quantity = key.next().charAt(0);
                            try {
                                if (quantity == (int)quantity) {
                                    squantity = Integer.parseInt(String.valueOf(quantity));
                                    double price = 40.00;
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
                        } while (optionF == 'y');
                    }
                    else if (drink == 2) {
                        do {
                            System.out.print("ENTER QUANTITY FOR ROYAL: ");
                            quantity = key.next().charAt(0);
                            try {
                                if (quantity == (int)quantity) {
                                    squantity = Integer.parseInt(String.valueOf(quantity));
                                    double price = 35.00;
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
                        } while (optionF == 'y');
                    }
                    else if (drink == 3) {
                        do {
                            System.out.print("ENTER QUANTITY FOR SPRITE: ");
                            quantity = key.next().charAt(0);
                            try {
                                if (quantity == (int)quantity) {
                                    squantity = Integer.parseInt(String.valueOf(quantity));
                                    double price = 35.00;
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
                        } while (optionF == 'y');
                    }
                    else if (drink == 4) {
                        do {
                            System.out.print("ENTER QUANTITY FOR RC: ");
                            quantity = key.next().charAt(0);
                            try {
                                if (quantity == (int)quantity) {
                                    squantity = Integer.parseInt(String.valueOf(quantity));
                                    double price = 30.00;
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
                        } while (optionF == 'y');
                    }
                    else if (drink == 5) {
                        do {
                            System.out.print("ENTER QUANTITY FOR ROYAL: ");
                            quantity = key.next().charAt(0);
                            try {
                                if (quantity == (int)quantity) {
                                    squantity = Integer.parseInt(String.valueOf(quantity));
                                    double price = 35.00;
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
                        } while (optionF == 'y');
                    }
                    else {
                        adrinks = 'Y';
                        optionE = 'T';
                    }
                    if (optionE != 'T') {
                        System.out.print("\nDO YOU WISH TO ORDER DRINKS AGAIN? Y/N: ");
                        adrinks = key.next().charAt(0);
                    }
                } while (adrinks == 'Y' || adrinks == 'y');
            }
        }

        do {
            System.out.println("\nTOTAL PAYMENT: Php " + Total);
            System.out.print("FUNDS: Php ");
            fund = key.nextInt();
            
            if (fund >= Total) {
                change = fund - Total;
                System.out.println("\nCHANGE: Php " + change);
                System.out.println("\nTHANK YOU COME AGAIN!!!");
            }
            else {
                System.out.println("INSUFFICIENT FUNDS PLEASE TRY AGAIN!");
            }
        } while (fund < Total);          
    }
}