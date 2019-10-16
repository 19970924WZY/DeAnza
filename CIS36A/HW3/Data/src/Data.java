/*
 * @Zhengyu Wu
 * CIS 36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Data {
	public static void main(String[] args) {
		double studentGPA;
		int studentIdNumber;
		double studentYears;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Collecting Student Data!\n");
		System.out.print("Please enter your GPA: ");
		studentGPA = input.nextDouble();
		System.out.print("Please enter your student ID number: ");
		studentIdNumber = input.nextInt();
		System.out.print("Please enter the number of years you have attended De Anza: ");
		studentYears = input.nextDouble();
		System.out.println("\n");
		System.out.println(studentGPA + " is your GPA.");
		System.out.println("Your student ID number is "+ studentIdNumber);
		System.out.println("You have attended De Anza for " + studentYears + " years.");
		
		input.close();
	
	}
}

/*
 * Result:
 * Collecting Student Data!
 * 
 * 
 * Please enter your GPA: 3.88
 * Please enter your student ID number: 20270690
 * Please enter the number of years you have attended De Anza: 3.5
 * 
 * 
 * 3.88 is your GPA.
 * Your student ID number is 20270690
 * You have attended De Anza for 3.5 years. 
 *
 *
*/