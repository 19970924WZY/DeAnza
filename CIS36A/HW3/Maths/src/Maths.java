/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat; //To set the decimal format. Learned this from google.

public class Maths {
	public static void main(String[] args) {
		/*
		 * Variables declaration.
		 */
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000000"); // Set the data to 6-decimal places
		double inputNumber;
		double squareNumber;
		double cubeNumber;
		double quarticNumber;
		double ceilingNumber;
		double floorNumber;
		double squareRootNumber;
		double naturalLogNumber;
		/*
		 * Information output
		 */
		
		System.out.print("Enter a number: ");
		
		/*
		 * Number Entered by User.
		 */
		inputNumber = input.nextDouble();
		
		/*
		 * Calculations
		 */
		squareNumber = Math.pow(inputNumber,2.0);
		cubeNumber = Math.pow(inputNumber, 3.0);
		quarticNumber = Math.pow(inputNumber, 4.0);
		ceilingNumber = Math.ceil(inputNumber);
		floorNumber = Math.floor(inputNumber);
		squareRootNumber = Math.sqrt(inputNumber);
		naturalLogNumber = Math.log(inputNumber);
		
		
		
		
		/*
		 * Results output.
		 */
		System.out.println("The square of " + inputNumber + " is: " + squareNumber);
		System.out.println("The cube of " + inputNumber + " is: " + cubeNumber);
		System.out.println("The quartic (fourth power) of " + inputNumber + " is: " + quarticNumber);
		System.out.println("The ceiling of " + inputNumber + " is : " + ceilingNumber);
		System.out.println("The floor of " + inputNumber + " is: " + floorNumber);
		System.out.println("The square root of " + inputNumber + " is: " + df.format(squareRootNumber));
		System.out.println("The nature log of " + inputNumber + " is: " + df.format(naturalLogNumber));
		/*
		 * df.format() in the above two output lines limit the decimal places
		 * Without this, the output will not be exactly the same with the pictures on the web page.
		 */
		
		input.close();
		
	}
}



/*
 * Result:
 * Enter a number: 2.5
 * The square of 2.5 is: 6.25
 * The cube of 2.5 is: 15.625
 * The quartic (fourth power) of 2.5 is: 39.0625
 * The ceiling of 2.5 is : 3.0
 * The floor of 2.5 is: 2.0
 * The square root of 2.5 is: 1.581139
 * The nature log of 2.5 is: 0.916291
 * 
 */
