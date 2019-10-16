/*
 * @Zhengyu Wu
 * CIS 36A TTh 11:30 am - 01:20 pm
 */
import java.util.Scanner;   //Import Scanner package.
public class PriceRight {
	public static void main(String[] args) {
		/*
		 * Variables declaration part.
		 */
		Scanner input = new Scanner(System.in);
		String priceInput;
		String priceDollars;
		String priceCents;
		int priceLength;
		
		/*
		 * System I/O part.
		 */
		System.out.print("Enter the price: ");
		priceInput = input.next();
		
		/*
		 * Calculate the length of the Input.
		 * Assume the input price will never go above 999.99 or below 10.00
		 * Therefore, the length will be always 6 or 5.
		 */
		priceLength = priceInput.length();
		
		/*
		 * If-else statement to determine how to print out the dollars and cents.
		 */
		if(priceLength >5) {
			priceDollars = ""+priceInput.charAt(0) + priceInput.charAt(1) + priceInput.charAt(2); 
			priceCents = "" + priceInput.charAt(4) + priceInput.charAt(5);
		}else {
			priceDollars = "" + priceInput.charAt(0) + priceInput.charAt(1);
			priceCents = "" + priceInput.charAt(3) + priceInput.charAt(4);
		}
		
		/*
		 * System prints out the result.
		 */
		System.out.println(priceDollars + " dollars and " + priceCents + " cents.");
		input.close();
	}
}

/*
 * Example run 1:
 * Enter the price: 999.99
 * 999 dollars and 99 cents.
 */

/*
 * Example run 2:
 * Enter the price: 10.00
 * 10 dollars and 00 cents.
 */
 
/*
 * Example run 3:
 * Enter the price: 12.95
 * 12 dollars and 95 cents.
 */

/*
 * Example run 4:
 * Enter the price: 174.35
 * 174 dollars and 35 cents.
 */

