/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 * PopGrowth.java
 */
import java.util.Scanner;
import java.lang.Math;
public class PopGrowth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		System.out.print("Enter the year: ");
		year = input.nextInt();
		System.out.print("Estimate worldwide population in " +
		year + " : " + 7.35 * Math.exp(0.0071*(year-2016)) + " billion"); 
		
		input.close();
	}
}

/*
 * Run:
 * Enter the year: 2020
 * xEstimate worldwide population in 2020 : 7.561732368586969 billion
*/
