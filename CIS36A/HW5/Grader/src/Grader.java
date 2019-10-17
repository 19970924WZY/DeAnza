/*
 * @Zhengyu Wu
 * @Lyxa Tang
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Grader {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double score;
		String grade = "";
		System.out.print("Enter a score: ");
		score = input.nextDouble();
		if(score >= 90)
		{
			grade = "A";
		}
		else if(score >= 80)
		{
			grade = "B";
		}
		else if(score >= 70)
		{
			grade = "C";
		}
		else if(score >= 60)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		System.out.println(grade);
		input.close();
		
	}
}
