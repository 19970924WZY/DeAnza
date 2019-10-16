/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */

import java.util.Scanner;
public class SumDiagonal {
	public static void main(String[] args) {
		/*
		 * Declaration of the variables.
		 */
		int firstLine;
		int secondLine;
		int thirdLine;
		int sum;
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * Outputs to the user and let the use Inputs the numbers
		 */
		System.out.print("Enter first number:  ");
		firstLine = input.nextInt();
		System.out.print("Enter second number: ");
		secondLine = input.nextInt();
		System.out.print("Enter third number:  ");
		thirdLine = input.nextInt();
		
		/*
		 * Calculations of the numbers that inputed from the user.
		 */
		
		firstLine = (firstLine / 100)%10;    
		secondLine = (secondLine / 10)%10;    
		thirdLine = (thirdLine % 10);		
		sum = firstLine + secondLine + thirdLine;
		
		/* Test the calculation of each lines
		 * System.out.println(firstLine);
		 * System.out.println(secondLine);
		 * System.out.println(thirdLine);
		 */
	
		System.out.println("Sum of diagonal digits is " + sum );
		input.close();
	}
}

/* Results:
 * Example one, number used(firstLine|secondLine|thirdLine)
 * 123|416|781
 * Enter first number:  123
 * Enter second number: 416
 * Enter third number:  781
 * Sum of diagonal digits is 3
 * 
 * Example two,number used(firstLine|secondLine|thirdLine)
 * 123|456|789
 * Enter first number:  123
 * Enter second number: 456
 * Enter third number:  789
 * Sum of diagonal digits is 15
 * 
 * Example three,number used(firstLine|secondLine|thirdLine)
 * 1234|56|789
 * Enter first number:  1234
 * Enter second number: 56
 * Enter third number:  789
 * Sum of diagonal digits is 16
 * 
 * Example four,number used(firstLine|secondLine|thirdLine)
 * 1|2|3
 * Enter first number:  1
 * Enter second number: 2
 * Enter third number:  3
 * Sum of diagonal digits is 3
*/

