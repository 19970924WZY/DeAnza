/*
 * @Zhengyu Wu
 * @Lyxa Tang
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class LetterGrade {
	public static void main(String[] argc) {
		String grade;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		grade = input.next();
		grade = grade.toUpperCase();
		switch(grade) {
		case "A":
			System.out.println("The numeric value is 4.0");
			break;
		case "B":
			System.out.println("The numeric value is 3.0");
			break;
		case "C":
			System.out.println("The numeric value is 2.0");
			break;
		case "D":
			System.out.println("The numeric value is 1.0");
			break;
		case "F":
			System.out.println("The numeric value is 0.00");
			break;
		default:
			System.out.println("Please enter a valid letter grade next time.");
		}
		input.close();
	}

}
