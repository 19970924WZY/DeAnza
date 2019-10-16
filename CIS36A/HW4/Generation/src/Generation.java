/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Generation {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int year_of_birth;
		System.out.println("What's your generation?");
		System.out.print("Please enter the year of your birth: ");
		year_of_birth = stdin.nextInt();
		
		if(year_of_birth >= 1900 && year_of_birth <= 1927) 
		{
			System.out.println("You belong to the \"Greatest Generation\"");
		}
		else if(year_of_birth >= 1928 && year_of_birth <= 1945)
		{
			System.out.println("You belong to the \"The Silents\"");
		}
		else if(year_of_birth >= 1946 && year_of_birth <=1964)
		{
			System.out.println("You belong to the \"The Baby Boomers\"");
		}
		else if(year_of_birth >= 1965 && year_of_birth <= 1979)
		{
			System.out.println("You belong to the \"Generation X\"");
		}
		else if(year_of_birth >= 1980 && year_of_birth <= 1999)
		{
			System.out.println("You belong to the \"The Millennial Generation\"");
		}
		else if(year_of_birth >= 2000 && year_of_birth <= 2019)
		{
			System.out.println("You belong to the \"Generation Z\"");
		}
		else if(year_of_birth < 1900 || year_of_birth >2019)
		{
			System.out.println("Invalid entry! Please enter a birth year in the range 1900 - 2019.");
		}
		stdin.close();
	}
	
}
