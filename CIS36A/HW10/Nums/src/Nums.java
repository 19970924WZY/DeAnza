/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Nums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int indicator;
		double sum = 0.0;
		double product = 1.0;
		
		System.out.print("Enter the number of numbers: ");
		num1 = input.nextInt();
		double[] numbers = new double[num1];
		
		System.out.println("Enter " + num1 + " numbers:\n ");
		for(int i = 0; i < numbers.length; i++) {
			indicator = i+1;
			System.out.print("Number " + indicator + ": ");
			numbers[i] = input.nextDouble();
			sum += numbers[i];
			product *= numbers[i];
		}
		System.out.printf("\nThe sum of the numbers is: %.1f \n", sum);
		System.out.printf("And the product is: %.1f \n", product);
		input.close();
		
		
	}

}
