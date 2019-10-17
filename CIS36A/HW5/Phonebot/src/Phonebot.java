/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Phonebot {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String userName;
		String phoneNumber;
		String phonePlan;
		double usedData;
		double total=0.0;
		
		System.out.println("Welcome to RobuChat!");
		System.out.print("What is your name? ");
		userName = stdin.next();
		System.out.println("Thanks for calling RobuCast "+userName+"!");
		System.out.print("What is you phone number? ");
		phoneNumber = stdin.next();
		System.out.println("Looking up phone number " + phoneNumber);
		System.out.print("What is your phone plan? (Basic/Gold/Unlimited) ");
		phonePlan = stdin.next();
		if(phonePlan.equalsIgnoreCase("basic")) {
			System.out.println("Ah, the Basic package");
			System.out.print("How many GB of data this month? ");
			usedData = stdin.nextDouble();
			System.out.println("Wow, "+usedData+" GB is a lot of Data!"
					+" Maybe you should upgrade!");
			total = (24.95+7.0*(usedData-2.0));
		}
		else if (phonePlan.equalsIgnoreCase("gold"))
		{
			System.out.println("Welcome Gold member.");
			System.out.print("How many GB of data this month? ");
			usedData = stdin.nextDouble();
			System.out.println("Wow, "+usedData+" GB is a lot of Data!"
					+ " You should upgrade!");
			total = (39.95+5*(usedData-5.0));
		}
		else if(phonePlan.equalsIgnoreCase("unlimited"))
		{
			System.out.println("The unlimited plan");
			System.out.print("How many GB of data this month? ");
			usedData = stdin.nextDouble();
			System.out.println("Wow, "+usedData+" GB is a lot of Data!");
			System.out.println("Good thing you have the unlimited plan");
			total = 59.95;
		}
		System.out.println("Your total bill is: $"+total+".");
		System.out.println("Thanks for calling RobuCast, " +userName+"!");
		
		stdin.close();
		
	}

}
