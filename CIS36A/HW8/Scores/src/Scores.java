/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Scores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sumScores = 0.0;
		double nextScore = 0.0;
		int count = 0;
		/*
		while(nextScore >= 0.0) {
			count++;
			System.out.print("Enter score#" + count + ": ");
			nextScore = input.nextDouble();
			if(nextScore > 0.0) {
				sumScores += nextScore;
			}
		}
		*/
		do
		{
			count++;
			System.out.print("Enter score #" + count + ": ");
			if(!input.hasNextDouble()) {
				System.out.println("Error! Please enter a number, not text.");
				input.next(); // change to next() from nextLine(), one way to fix the original problem.
			}
			else {
				nextScore = input.nextDouble();
				if(nextScore >= 0.0) {
					sumScores += nextScore;
				}
			}
		}while(nextScore >= 0.0);
		
		System.out.println("Sum of Scores:" + sumScores);
		input.close();
	}
}
