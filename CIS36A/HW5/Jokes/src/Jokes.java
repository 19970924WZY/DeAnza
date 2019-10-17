/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Jokes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		System.out.print("Want to hear a bad joke (yes/no)?" );
		choice = input.next();
		if(choice.equalsIgnoreCase("no"))
		{
			System.out.println("Okay. I will tell you a good one:\n");
			System.out.println("\"Between two evils, I always pick the one I never tried before.\"");
			System.out.println("- Mae West");
		}
		else if(choice.equalsIgnoreCase("yes"))
		{
			System.out.println("\n\"Q: Why did the computer get cold?");
			System.out.println("A: Because it forgot to close Windows.\"");
		}
		else
		{
			System.out.println("Enter yes or no please.");
		}
		input.close();
	}
}
