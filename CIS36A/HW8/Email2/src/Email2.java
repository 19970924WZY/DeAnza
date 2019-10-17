/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Email2 {
	public static boolean validEmail(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='@') {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String emailAddress;
		boolean isEmailAddress;
		
		System.out.println("Welcome! Enter an email and I will tell you if it is valid.\n");
		do {
			System.out.print("Please enter an email or q to quit: ");
			emailAddress = input.next();
			isEmailAddress = validEmail(emailAddress);
			if(isEmailAddress == true) {
				System.out.println("That email address is valid.\n");
			}
			else {
				System.out.println("That email address is invalid.\n");
			}
			
		}while(!emailAddress.equalsIgnoreCase("Q"));
		
		System.out.println("Goodbye!");
		input.close();
	}
}

/* Example Output.
Welcome! Enter an email and I will tell you if it is valid.

Please enter an email or q to quit: bob@gmail.com
That email address is valid.

Please enter an email or q to quit: bobajobs.com
That email address is invalid.

Please enter an email or q to quit: bob@jobs
That email address is valid.

Please enter an email or q to quit: q
That email address is invalid.

Goodbye!
*/