/**
 *
 * @Zhengyu Wu
 * CIS36A 11:30am-01:20pm
 */
import java.util.Scanner;
public class DateTime {

	public static void formatDateAmerican(int year, int month, int day) {
		System.out.println("Today's date in the U.S.: " + month + "/" + day + "/" + year);
		return;
	}
	public static void formatDateEuropean(int year,int month, int day) {
		System.out.println("Today's date in Europe: " + day + "." + month + "." + year);
		return;
	}
	public static void formatTimeAmerican(int hour, int minute, String period) {
		if(period.equalsIgnoreCase("morning")){
			System.out.println("The current time written in American style: " + hour + ":" + minute + "am");
		}else if(period.equalsIgnoreCase("evening")){
			System.out.println("The current time written in American style: " + hour + ":" + minute + "pm");
		}else {
			System.out.println("Please enter the valid time");
		}
		return;
	}
	public static void formatTimeEuropean(int hour, int minute, String period) {
		if(period.equalsIgnoreCase("morning")) {
			if(hour == 12) {
				hour += 12;
			}
			System.out.println("The current time according to the 24 hour clock: " + hour + ":" + minute);
		}else if(period.equalsIgnoreCase("evening")) {
			if(hour != 12) {
			hour = hour + 12;
			System.out.println("The current time according to the 24 hour clock: " + hour + ":" + minute);
			}
			else {
				System.out.println("The current time according to the 24 hour clock: " + hour + ":" + minute);
			}
		}
		return;
	}
    public static void main(String[] args) {
        int year;
        int day;
        int month;
        int hour;
        int minutes;
        String dayEve;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! This program will print dates and times "
            + "in both the American and European styles!\n");

        System.out.println("First, let's print a formatted date.\n");
   
        System.out.print("Please enter the current year: ");
        year = input.nextInt();
        System.out.print("Please enter the current month: ");
        month = input.nextInt();
        System.out.print("Please enter the current day: ");
        day = input.nextInt();
        System.out.println();
  
        formatDateAmerican(year,month,day);//call to the formatDateAmerican method here
        formatDateEuropean(year,month,day);//call to the formatDateEuropean method here
   
        System.out.println("\nNow, let's print a formatted time.\n");
   
        System.out.print("Please enter the current hour: ");
        hour = input.nextInt();
        System.out.print("Please enter the current minutes: ");
        minutes = input.nextInt();
        System.out.print("Please enter whether it is \"morning\" or \"evening\": ");
        dayEve = input.next();
        System.out.println();

   
        formatTimeAmerican(hour,minutes,dayEve);//call to the formatTimeAmerican method here
        formatTimeEuropean(hour,minutes,dayEve);//call to the formatTimeEuropean method here

        System.out.println("\nHave a good day!");
        input.close();
    }
    
}
