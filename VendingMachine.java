/*

● Welcomes the user and presents them with the various options.
● Asks the user to enter a monetary value .
● Allow user to make a selection .
● Check to see is the user has entered enough money .
	○ If the above is true, output the selected items and calculate change (if any) owed to the user.
	○ If the user has not entered enough money calculate how much they still owe.

 */

package vendingMachine;

import java.util.Scanner;

public class VendingMachine {
	
	public static void introduction () { // This is the introduction method called from the main method
		
		System.out.println("WELCOME");
		
		Integer amount = 0; // this is how much the user has to use (The final amount)
		Integer number = 0; // this is how much is temporarily stored as the amount of money
		
		while (number != 6) { // 6 is the option that ends the calculation of the amount money
			
			Scanner reader = new Scanner (System.in);
			System.out.println ("\nHow much (or how much more) are you inserting?"
					+ "\n1. R5"
					+ "\n2. R10"
					+ "\n3. R20"
					+ "\n4. R50"
					+ "\n5. R100"
					+ "\n6. Done"
					+ " \nContinuously pick the correct number until you are done:");
			number = reader.nextInt();
			
			if (number == 1) { // Option 1, for R5
				
				amount += 5;
				
			}
			
			if (number == 2) { // Option 2, for R10
				
				amount += 10;
				
			}
			
			if (number == 3) { // Option 3, for R20
				
				amount += 20;
				
			}
			
			if (number == 4) { // Option 4, for R50
				
				amount += 50;
				
			}
			
			if (number == 5) { // Option 5, for R100
				
				amount += 100;
				
			}
			
		}
		
		choices (amount); // calling the choices method with how much we have
		
	}
	
	public static void choices (int amount) { // This method holds all the vending machine items. It is called from the introduction method along with the amount of money the user has inserted
		
		System.out.println ("\nYou have insterted: R" + amount);
		
		System.out.println("\nHere are your options:"
				+ "\n1. Crisps (R10)"
				+ "\n2. Can of Soda (R15)"
				+ "\n3. Chocolate (R10)"
				+ "\n4. Bottled Water (R15)"
				+ "\n5. Energy drink (R20)"
				+ "\n6. Exit and return money");
		
		Scanner reader = new Scanner (System.in);
		System.out.println ("\nWhich item do you want? Enter the number:");
		int number = reader.nextInt();
		
		if (number == 1) { 
			
			if (amount >= 10) {
				
				System.out.println ("Enjoy your Crisps"
						+ "\nYour change is: R" + (amount - 10) + "\n");
				introduction(); // Takes us back to the introduction page; the transaction is over
				
			} else { // if the option chosen costs more money than what the user inserted
				
				System.out.println ("You are short: R" + (10 - amount) // Tells them how much more they need
						+ "\nYou do not have enough money. You have to select something else");
				choices (amount); // goes back to the beginning of the method to choose something cheaper or exit
				
			}
			
		}
		
		if (number == 2) {
			
			if (amount >= 15) {
				
				System.out.println ("Enjoy your Can of Soda"
						+ "\nYour change is: R" + (amount - 15) + "\n");
				introduction();
				
			} else {
				
				System.out.println ("You are short: R" + (15 - amount)
						+ "\nYou do not have enough money. You have to select something else");
				choices (amount);
				
			}
			
		}
		
		if (number == 3) {
			
			if (amount >= 10) {
				
				System.out.println ("Enjoy your Chocolate"
						+ "\nYour change is: R" + (amount - 10) + "\n");
				introduction();
				
			} else {
				
				System.out.println ("You are short: R" + (10 - amount)
						+ "\nYou do not have enough money. You have to select something else");
				choices (amount);
				
			}
			
		}
		
		if (number == 4) {
			
			if (amount >= 15) {
				
				System.out.println ("Enjoy your Bottled Water"
						+ "\nYour change is: R" + (amount - 15) + "\n");
				introduction();
				
			} else {
				
				System.out.println ("You are short: R" + (15 - amount)
						+ "\nYou do not have enough money. You have to select something else");
				choices (amount);
				
			}
			
		}
		
		if (number == 5) {
			
			if (amount >= 20) {
				
				System.out.println ("Enjoy your Energy Drink"
						+ "\nYour change is: R" + (amount - 20) + "\n");
				introduction();
				
			} else {
				
				System.out.println ("You are short: R" + (20 - amount)
						+ "\nYou do not have enough money. You have to select something else");
				choices (amount);
				
			}
			
		}
		
		if (number == 6) {
			
			System.out.println("Thank you\n");
			introduction();
			
		}
		
		reader.close();
		
	}
	
	public static void main(String[] args) {
		
		introduction (); // This calls the introduction method

	}

}
