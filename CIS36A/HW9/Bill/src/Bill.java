/**
 * 
 * @author Zhengyu Wu
 * @version CIS36A TTh 11:30am-01:20pm 03/07/2019
 */
import java.util.Scanner;
public class Bill {
	/**
	 * This method will call method addTax, calculateTip and formatPrice
	 * It will tell the user the total price after the tax and tip.
	 * @author Zhengyu Wu
	 * @version CIS36A 03/07/2019
	 * @param price
	 * @return nothing
	 */
	public static void calculateBill(double price) {
		double totalPrice = addTax(price);
		double afterTippedPrice = calculateTip(totalPrice);
		formatPrice(afterTippedPrice);
		return;
	}
	
	/**
	 * This method will calculate the tax for the price entered by user based
	 * on the tax rate 8.5%
	 * @author Zhengyu Wu
	 * @version CIS36A 03/07/2019
	 * @param price
	 * @return the total price included original price and tax
	 */
	public static double addTax(double price) {
		double totalPrice;
		double taxRate = 0.085;
		totalPrice = price + (price*taxRate);
		return totalPrice;
	}
	
	/**
	 * This method will calculate the tip based on the price included original price and tax
	 * based on the tip rate (15%)
	 * @author Zhengyu Wu
	 * @version CIS36A 03/07/2019
	 * @param price
	 * @return the total price after tax and tip
	 */
	public static double calculateTip(double price) {
		double tipRate = 0.15;
		double total = price + (price*tipRate);
		return total;
	}
	
	/**
	 * This method will prints out the price with 2 decimal places to the user.
	 * The price comes from method addTax and calculateTip
	 * @author Zhengyu Wu
	 * @version CIS36A 03/07/2019
	 * @param price
	 * @return nothing
	 */
	public static void formatPrice(double price) {
		System.out.printf("With tax and tip, your total comes to $%.2f", price);
		return;
	}
	
	/**
	 * Main method of this class
	 * @author Zhengyu Wu
	 * @version CIS36A 03/07/2019
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price;
		System.out.println("Welcome to Mama Domino's Pizzaria!");
		System.out.print("Enter the price of the pizza: ");
		price = input.nextDouble();
		calculateBill(price);
		input.close();
	}

}
