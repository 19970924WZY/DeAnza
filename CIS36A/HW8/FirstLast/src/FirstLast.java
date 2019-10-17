/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class FirstLast {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstChar;
		String lastChar;
		String userInput;
		String runAgain = "y";
		System.out.println("***Comparing First and Last Characters***\n");
		
		while(!runAgain.equalsIgnoreCase("N")) {
			System.out.print("\nInput a word: ");
			userInput = input.next();
			firstChar = userInput.substring(0,1);
			lastChar = userInput.substring(userInput.length()-1,userInput.length());
			if(firstChar.compareTo(lastChar)>0) {
				System.out.println("Last letter \"" + lastChar + "\" is earlier in the alphabet.\n");
			}
			if(firstChar.compareTo(lastChar)<0) {
				System.out.println("First letter \"" + firstChar + "\" is earlier in the alphabet.\n");
			}
			if(firstChar.equals(lastChar)) {
				System.out.println("Letters are the same.\n");
			}
			System.out.print("Run again? (y/n):" );
			runAgain = input.next();
		}
		input.close();
	}

}

/* Example output.
***Comparing First and Last Characters***


Input a word: 
easy
First letter "e" is earlier in the alphabet.

Run again? (y/n):y

Input a word: zebra
Last letter "a" is earlier in the alphabet.

Run again? (y/n):y

Input a word: Zebra
First letter "Z" is earlier in the alphabet.

Run again? (y/n):y

Input a word: eve
Letters are the same.

Run again? (y/n):n

*/