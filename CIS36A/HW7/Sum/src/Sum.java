/*
 * @Zhengyu Wu
 * @Lyxa Tang
 * CIS 36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		int quantity = 0;
		double number = 0.0;
		double sum = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a list of numbers and I will compute their sum and average!");
		System.out.print("Enter the quantity of numbers: ");
		quantity = input.nextInt();
		for(int i = 1; i <= quantity; i++) {
			System.out.print("Enter value #" + i + ": ");
			number = input.nextDouble();
			sum = sum + number;//add number to our running total for the sum
		}
		System.out.printf("The sum of the numbers is: %.2f\n", sum);
		System.out.printf("The average of the numbers is: %.2f\n", (sum / quantity));
		
		input.close();
	}
}
