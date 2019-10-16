/*
 * @Zhengyu Wu
 * @Lyxa Tang
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Even {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testNum;
		int remainder;
		System.out.println("Welcome!\nEnter a number and "
			    + "I'll report back \"even\" or \"odd.\"\n");
		System.out.print("Please enter a whole number: ");
		testNum = in.nextInt();
		remainder = testNum % 2;
		
		if (remainder == 0 ) {
			System.out.println(testNum + " is even.");
		}else{
			System.out.println(testNum + " is odd.");
		}
		
		in.close();
			
	}
}
