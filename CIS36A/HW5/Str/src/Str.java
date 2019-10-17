/*
 * @Zhengyu Wu
 * CI36A TTh 11:30am -01:20pm
 */
import java.util.Scanner;
public class Str {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String first;
		String second;
		String longer;
		
		
		
		System.out.println("*** String Manipulation ***");
		System.out.println("Enter two words separated by a space, and press the Enter key");
		System.out.print("Enter your input: ");
		first = input.next();
		second = input.next();
		System.out.println("You entered: first = \"" + first + "\" and second = \"" + second +"\"");
		System.out.println("\n*** Measuring word length ***");
		System.out.println("First word length: "+first.length());
		System.out.println("Second word length: "+second.length());
		if(first.length()>second.length()) {
			longer = first;
		}
		else if(second.length() > first.length()) {
			longer = second;
		}
		else {
			longer = "These two words have same length!";
		}
		System.out.println("Longer word:"+longer);
		System.out.println("\n*** Merging String ***");
		System.out.println("Extracted: "+first.charAt(0)+first.charAt(1)+
				second.charAt(second.length()-3)+second.charAt(second.length()-2)+
				second.charAt(second.length()-1));
		System.out.println("\n*** Comparing the two words ***");
		if(first.compareTo(second)<0) {
			System.out.println(first +" comes before "+second);
		}
		else if (second.compareTo(first)<0) 
		{
			System.out.println(second +" comes before "+first);
		}
		else if(first.compareTo(second)==0 || second.compareTo(first)==0)
		{
			System.out.println("These two words are equal.");
		}
		input.close();
		
	}
}
