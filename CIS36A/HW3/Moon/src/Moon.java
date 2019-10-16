/*
 * @Zhengyu Wu
 * @Tung Boon Yeau
 * CIS 36A TTh 11:30am - 01:20pm
 */

import java.util.Scanner;
public class Moon {
	public static void main(String[] args) {
		System.out.println("Welcome! Let's calculate your weight on the moon!");
		System.out.print("Please enter your weight in pounds: ");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		weight = weight / 6;
		System.out.println( "Your weight on the moon is: " + weight);
		input.close();
		
		
	}
}
