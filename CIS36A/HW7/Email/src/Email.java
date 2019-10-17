/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Email {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String emailAddress = "";
		System.out.println("Welcome! Enter an email and I will tell you if it is valid.");
		System.out.print("Please enter an email or q to quit: ");
		emailAddress = input.next();
		
		while(!emailAddress.equalsIgnoreCase("q")) {
			String isEmail = "false";
			for(int i = 0; i< emailAddress.length();i++) {
				if(emailAddress.charAt(i) == '@') {
					isEmail = "true";
				}
			}
			switch(isEmail) {
			case "true":
				System.out.println("That email address is valid.\n");
				break;
			case "false":
				System.out.println("That email address is invalid.\n");
				break;
			}
			System.out.print("Please enter an email or q to quit: ");
			emailAddress = input.next();
		}
		System.out.println("Goodbye!");
		input.close();
	
	}

}
