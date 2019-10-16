/*
 * @Zhengyu Wu
 * @Lyxa Tang
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Alphabetize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word1;
		String word2;
		System.out.println("Welcome! Give me two words...\nand I will return them to you in alphabetical order!\n");
		System.out.print("Please enter the first word: ");
		word1 = input.next(); 
		System.out.print("Please enter the second word: ");
		word2 = input.next(); 
		if(word1.compareTo(word2)<0) {
			System.out.println("The alphabetize order is: " + word1 +" "+ word2);
		}else {
			System.out.println("The alphabetize order is: " + word2 +" "+ word1);
		}
		input.close();
	}
}
