/* 
 * @Zhengyu Wu
 * CIS36A TTh 11:30am -01:20pm
 */
import java.util.Scanner;
public class Cookies {
	public static void main(String[] argc) {
		Scanner input = new Scanner(System.in);
		final double MOCHA_PRICE = 1.95;
		final double COCOA_PRICE = 2.15;
		final double COFFEE_CHAI_PRICE = 2.05;
		final double JAVA_COOKIES = 1.85;
		int mochaAmount;
		int cocoaAmount;
		int coffeeChaiAmount;
		int javaCookiesAmount;
		double mochaOrderedPrice;
		double cocoaOrderedPrice;
		double coffeeChaiOrderedPrice;
		double javaCookiesOrderedPrice;
		double totalPrice;
		System.out.println("Welcome to Java Cookies!");
		System.out.println("Allow me to assist you with your order.\n");
		System.out.println("We sell the following flavors:");
		System.out.printf("Mocha Cookies -- $%.2f each\n",MOCHA_PRICE);
		System.out.printf("Cocoa Cookies -- $%.2f each\n",COCOA_PRICE);
		System.out.printf("Coffee Chai Cookies -- $%.2f each\n", COFFEE_CHAI_PRICE);
		System.out.printf("Java Cookies (Chocolate Chocolate Chip with Macadamia) -- $%.2f each\n", JAVA_COOKIES);
		System.out.print("\nPlease enter the number of Mocha Cookies: ");
		mochaAmount = input.nextInt();
		System.out.print("Please enter the number of Cocoa Cookies: ");
		cocoaAmount = input.nextInt();
		System.out.print("Please enter the number of Coffee Chai Cookies: ");
		coffeeChaiAmount = input.nextInt();
		System.out.print("Please enter the number of Java Cookies: ");
		javaCookiesAmount = input.nextInt();
		
		mochaOrderedPrice = mochaAmount * MOCHA_PRICE;
		cocoaOrderedPrice = cocoaAmount * COCOA_PRICE;
		coffeeChaiOrderedPrice = coffeeChaiAmount * COFFEE_CHAI_PRICE;
		javaCookiesOrderedPrice = javaCookiesAmount * JAVA_COOKIES;
		totalPrice = mochaOrderedPrice+cocoaOrderedPrice+coffeeChaiOrderedPrice+javaCookiesOrderedPrice;
		System.out.println("You Ordered the Following:");
		System.out.printf("Mocha Cookies: %d @ $%.2f each...\t$%.2f\n", mochaAmount,MOCHA_PRICE,mochaOrderedPrice);
		System.out.printf("Cocoa Cookies: %d @ $%.2f each...\t$%.2f\n", cocoaAmount,COCOA_PRICE,cocoaOrderedPrice);
		System.out.printf("Coffee Chai Cookies: %d @ $%.2f each...\t$%.2f\n", coffeeChaiAmount,COFFEE_CHAI_PRICE,coffeeChaiOrderedPrice);
		System.out.printf("Java Cookies: %d @ $%.2f each...\t\t$%.2f\n", javaCookiesAmount,JAVA_COOKIES,javaCookiesOrderedPrice);
		System.out.printf("Total:\t\t\t\t\t$%.2f\n", totalPrice);
		System.out.println("\nThank you for your order! Please come again!");
		
		input.close();
	}

}

/*
 * Output:
 * Welcome to Java Cookies!
 * Allow me to assist you with your order.
 *
 * We sell the following flavors:
 * Mocha Cookies -- $1.95 each
 * Cocoa Cookies -- $2.15 each
 * Coffee Chai Cookies -- $2.05 each
 * Java Cookies (Chocolate Chocolate Chip with Macadamia) -- $1.85 each
 * 
 * Please enter the number of Mocha Cookies: 3
 * Please enter the number of Cocoa Cookies: 2
 * Please enter the number of Coffee Chai Cookies: 5
 * Please enter the number of Java Cookies: 1
 * You Ordered the Following:
 * Mocha Cookies: 3 @ $1.95 each...	$5.85
 * Cocoa Cookies: 2 @ $2.15 each...	$4.30
 * Coffee Chai Cookies: 5 @ $2.05 each...	$10.25
 * Java Cookies: 1 @ $1.85 each...		$1.85
 * Total:					$22.25
 * 
 *Thank you for your order! Please come again!
 */

