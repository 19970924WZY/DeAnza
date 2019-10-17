/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Sign {
	public static void main(String[] argc) {
		Scanner input = new Scanner(System.in);
		int birthMonth;
		int birthDay;
		
		System.out.println("What's your sign?");
		System.out.print("Please enter the month of your birth (1-12): ");
		birthMonth = input.nextInt();
		System.out.print("Please enter the day of your birth (1-31): ");
		birthDay = input.nextInt();
		if(birthMonth == 3) {
			if(birthDay >= 1 && birthDay <= 20) {
				System.out.println("Your Sign is Pisces.");
			}
			else if(birthDay >= 21 && birthDay <= 31) {
				System.out.println("Your Sign is Aries.");
			}
			else
			{
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 4) {
			if(birthDay >= 1 && birthDay <= 19) {
				System.out.println("Your Sign is Aries.");
			}
			else if(birthDay >= 20 && birthDay <= 30) {
				System.out.println("Your Sign is Taurus.");
			}
			else
			{
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 5) {
			if(birthDay >= 1 && birthDay <= 20) {
				System.out.println("Your Sign is Taurus.");
			}
			else if(birthDay >= 21 && birthDay <= 31) {
				System.out.println("Your Sign is Gemini.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 6) {
			if(birthDay >= 1 && birthDay <= 21) {
				System.out.println("Your Sign is Gemini.");
			}
			else if(birthDay >= 22 && birthDay <=30) {
				System.out.println("Your Sign is Cancer.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 7) {
			if(birthDay >= 1 && birthDay <=22) {
				System.out.println("Your Sign is Cancer.");
			}
			else if(birthDay >= 23 && birthDay <= 31) {
				System.out.println("Your Sign is Leo.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 8) {
			if(birthDay >= 1 && birthDay <= 22) {
				System.out.println("Your Sign is Leo.");
			}
			else if(birthDay >= 23 && birthDay <= 31) {
				System.out.println("Your Sign is Virgo.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 9) {
			if(birthDay >= 1 && birthDay <= 22) {
				System.out.println("Your Sign is Virgo.");
			}
			else if(birthDay >= 23 && birthDay <= 30) {
				System.out.println("Your Sign is Libra.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 10) {
			if(birthDay >= 1 && birthDay <= 22) {
				System.out.println("Your Sign is Libra.");
			}
			else if(birthDay >= 23 && birthDay <= 31) {
				System.out.println("Your Sign is Scorpio.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 11) {
			if(birthDay >= 1 && birthDay <= 21) {
				System.out.println("Your Sign is Scorpio.");
			}
			else if (birthDay >= 23 && birthDay <= 30) {
				System.out.println("Your Sign is Sagittarius.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 12) {
			if(birthDay >= 1 && birthDay <= 21) {
				System.out.println("Your Sign is Sagittarius.");
			}
			else if(birthDay >= 22 && birthDay <= 31) {
				System.out.println("Your Sing is Capricorn.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 1) {
			if(birthDay >= 1 && birthDay <= 19) {
				System.out.println("Your Sign is Capricorn.");
			}
			else if(birthDay >= 20 && birthDay <= 31) {
				System.out.println("Your Sign is Aquarius.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		else if(birthMonth == 2) {
			if(birthDay >= 1 && birthDay <= 18) {
				System.out.println("Your Sign is Aquarius.");
			}
			else if(birthDay >= 19 && birthDay <= 29) {
				System.out.println("Your Sign is Pisces.");
			}
			else {
				System.out.println("Invalid Entry. Please run the program to try again.");
			}
		}
		System.out.println("Invalid Entry. Please run the program to try again.");
		input.close();
	}

}
