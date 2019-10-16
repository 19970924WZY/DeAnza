/*
 * @Zhengyu Wu
 * @Lyxa Tang
 * CIS36A TTh 11:30am - 01:20pm
 * MyName part 2.
 */
import java.util.Scanner;
public class MyName {
	public static void main(String[] args) {
		String first_name;
		String last_name;
		String full_name;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! I want to learn your name!");
		System.out.print("Please enter your first name: ");
		first_name = input.next();
		System.out.print("Please enter your last name: ");
		last_name = input.next();
		full_name = first_name +" "+ last_name;
		System.out.println("Nice to meet you " + full_name + "!");
		input.close();
		
		/*
		 * Part 2: Calculate the length of User's input.
		 */
		System.out.println("The length of your first name is " + first_name.length() + " letters");
		System.out.println("The length of your last name is " + last_name.length() + " letters");
		System.out.println("The length of your full name is " + (full_name.length()-1) + " letters");
		String initials;
		initials = " " + first_name.charAt(0) + last_name.charAt(0);
		System.out.println("Your initials are: " + initials);
		System.out.println("Your first and last name are the same: " + first_name.equals(last_name));
		System.out.println("Your name in all capitals is: " + full_name.toUpperCase());
		System.out.println("Your name in all lower case is: " + full_name.toLowerCase());
		
		
		/*
		 * The mistake in the out put on the web page is the length of user's full name will 
		 * be one more than it should be.
		 * It is because we add a white space when concatenated the first_name and last_name 
		 * on the full_name assignment.
		 * Therefore, we chose to do the "minus" on line 28 so it will print out the correct number.
		 * 
		 */
	}
}
