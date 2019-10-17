/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Sentences {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstPosition;
		int secondPosition;
		char firstChar;
		char secondChar;
		String sentence;
		
		System.out.println("Welcome!");
		System.out.println("This program compares two letters in a sentence.\n");
		
		do {
			System.out.print("Enter a sentence or X to exit: ");
			sentence = input.nextLine();
			if(sentence.equalsIgnoreCase("x")) {
				break; //break the loop as the user hope to stop.
			}
			
			System.out.print("Enter the numeric location of the first letter: ");
			while(!input.hasNextInt()) {
				System.out.println("\nError! Enter a number, not text!");
				input.nextLine();
				System.out.print("Enter the numeric location of the first letter: ");
			}
			firstPosition = input.nextInt();
			input.nextLine();
			System.out.print("Enter the numeric location of the second letter: ");
			while(!input.hasNextInt()) {
				System.out.println("\nError! Enter a number, not text!");
				input.nextLine();
				System.out.print("Enter the numeric location of the second letter: ");
			}
			secondPosition = input.nextInt();
			input.nextLine();
			firstChar = sentence.charAt(firstPosition);
			secondChar = sentence.charAt(secondPosition);
			if(firstChar == secondChar) {
				System.out.println("\n" + firstChar + " and " + secondChar + " are identical.\n");
			}else {
				System.out.println("\n" + firstChar + " and " + secondChar + " are unique characters.\n");
			}
		}while(true);
		System.out.println("Goodbye!");
		input.close();
	}

}
