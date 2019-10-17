/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class MonthDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputMonth;
		
		System.out.println("I will print the number of days in a month.");
		System.out.print("Enter the month (January - December): ");
		inputMonth = input.next();
		inputMonth = inputMonth.toUpperCase();
		
		switch(inputMonth) {
		case "JANUARY":
		case "MARCH":
		case "MAY":
		case "JULY":
		case "AUGUST":
		case "OCTOBER":
		case "DECEMBER":
			System.out.println("31 days");
			break;
		case "APRIL":
		case "JUNE":
		case "SEPTEMBER":
		case "NOVEMBER":
			System.out.println("30 days");
			break;
		case "FEBRUARY":
			System.out.println("28 or 29 days");
			break;
		default:
			System.out.println("INVALID. Please enter the correct month next time.");
		}
		
		input.close();
	}
}
