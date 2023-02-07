package _06_Console_Store;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		Cart items = new Cart();
		ArrayList<String> receipt = new ArrayList<String>();
		int total = 100;
		boolean checkout = false;
		boolean working = true;
		System.out.println("Your total amount to spend is $" + total);

		Scanner first = new Scanner(System.in);

		do {
			while (working == true) {
				System.out.println("Which operation would you like to complete?");
				String firstI = first.nextLine();
				if (firstI.equals("Add Items")) {
					System.out.println("Which item would you like to add?");
					String itemI = first.nextLine();
					if (itemI.equals("Clothing")) {
						System.out.println("Price is $20");
						items.add(new Clothing());
						total = total - 20;
						receipt.add("Added Cloth - $20");
					}
					if (itemI.equals("Toy")) {
						System.out.println("Price is $10");
						items.add(new Toy());
						total = total - 10;
						receipt.add("Added Toy - $10");
					}
					if (itemI.equals("Candy")) {
						System.out.println("Price is $5");
						items.add(new Candy());
						total = total - 5;
						receipt.add("Added Candy - $5");
					}
					if (itemI.equals("Cereal")) {
						System.out.println("Price is $5");
						items.add(new Cereal());
						total = total - 5;
						receipt.add("Added Cereal - $5");

					}

				}
				if (firstI.equals("Remove Items")) {
					if (items.length() == 0) {
						System.out.println("You have no items in the cart.");
					}
					if (items.length() > 0) {
						System.out.println("Which item number would you want to remove?");
						String removeItem = first.nextLine();
						int posItem = Integer.parseInt(removeItem);
						Product removed = items.remove(posItem);
						if (removed instanceof Candy) {
							total = total - 5;
						}

					}

				}
				if (firstI.equals("Show Cart")) {
					items.showCart();
				}
				if (firstI.equals("Checkout")) {
					if (total > 0) {
						System.out.println("You have successfully checked out.");

						System.out.println("Your remaining total is $" + total);
						System.out.println("Your Receipt:");
						for (int i = 0; i < receipt.size(); i++) {
							System.out.println(receipt.get(i));
						}
						items.showCart();
						checkout = true;
						working = false;
					}
					if (total < 0) {
						System.out.println("You have too many items in your cart. Remove items and try again");
					}
				}
			}
		} while (checkout != false);

	}

}
