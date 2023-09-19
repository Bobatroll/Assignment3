import java.util.Scanner;
// Jayson Yates
//01268683
//9/18/23
//Assignment3_Jayson_Yates

//1.	Declare Variables: Name of Item, Inventory Amount, Price, number of different items.
//2.	Prompt user for amount of different items.
//3.	While Statement while(h <=  amount of different items)
//Add 1 to h every time until it = the amount of different items / prevent infinite loop
//4.	Prompt user for name/inventory amount and price
//5.	Output the total price of all items combined.

public class Assignment3_Jayson_Yates {

	public static void main(String[] args) {

		System.out.println("How many items are in the store?");

		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		double itemPriceAmount, totalAmount = 0;
		int h = 1;

		while (h <= i) {

			System.out
					.println("Enter the name of item " + h + ", the amount in inventory, " + "and the price of item.");
			String name = input.next();
			int inv = input.nextInt();
			double price = input.nextDouble();
			itemPriceAmount = (price * inv);
// adds the price  amount for each items to totalAmount, which will include all the items cost 	 
			totalAmount += itemPriceAmount;
			h++;

		}
//Will print out the total price of all the items * their inventory and total it up. 
		System.out.printf("The Total Amount of all the items in the store is $ %.2f", totalAmount);
		input.close();
	}
}