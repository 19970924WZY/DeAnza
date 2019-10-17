/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
/*
 * Code for nuts
 * A = Almonds
 * BN = Brazil Nuts
 * C = Cashews
 * HN = Hazelnuts
 * M = Macadamias
 * P = Peanuts
 * PE = Pecans
 * PN = Pine Nuts
 * PI = Pistachios
 * W = Walnuts
 */
import java.util.Scanner;
public class Nuts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String wholeInput = "";
		String oneCharNut = "";
		String twoCharsNut = "";
		String weight;
		String repeat = "y";
		System.out.println("Welcome to the Health Nut Company!\n");
		
		while(repeat.equalsIgnoreCase("y")) {
			System.out.print("Enter the nut order code: ");
			wholeInput = input.next();
			oneCharNut = wholeInput.substring(0,1);
			switch(oneCharNut) {
			case "A":
				weight = wholeInput.substring(1,wholeInput.length());
				System.out.println(weight + " oz. Almonds.");
				break;
			case "C":
				weight = wholeInput.substring(1,wholeInput.length());
				System.out.println(weight + " oz. Cashews");
				break;
			case "M":
				weight = wholeInput.substring(1,wholeInput.length());
				System.out.println(weight + " oz. Macadamias.");
				break;
			case "W":
				weight = wholeInput.substring(1,wholeInput.length());
				System.out.println(weight + " oz. Walnuts;");
				break;
			case "P":
				twoCharsNut = wholeInput.substring(1,2);
				if(twoCharsNut.equals("E")) {
					weight = wholeInput.substring(2,wholeInput.length());
					System.out.println(weight + " oz. Pecans.");
				}
				else if(twoCharsNut.equals("N")) {
					weight = wholeInput.substring(2,wholeInput.length());
					System.out.println(weight + " oz. Pine Nuts.");
				}
				else if(twoCharsNut.equals("I")) {
					weight = wholeInput.substring(2,wholeInput.length());
					System.out.println(weight + " oz. Pistachios.");
				}
				else if(twoCharsNut.charAt(0)>'0' && twoCharsNut.charAt(0)<'9'){
					weight = wholeInput.substring(1,wholeInput.length());
					System.out.println(weight + " oz. Peanuts.");
				}else {
					System.out.println("We don't have that nut.");
				}
				break;
			case "H":
				twoCharsNut = wholeInput.substring(1,2);
				if(twoCharsNut.equals("N")) {
					weight = wholeInput.substring(2,wholeInput.length());
					System.out.println(weight + " oz. Hazelnut.");
				}else {
					System.out.println("We don't have that nut.");
				}
				break;
			case "B":
				twoCharsNut = wholeInput.substring(1,2);
				if(twoCharsNut.equals("N")) {
					weight = wholeInput.substring(2,wholeInput.length());
					System.out.println(weight + " oz. Brazil Nuts.");
				}else {
					System.out.println("We don't have that nut.");
				}
				break;
			default:
					System.out.println("We don't have that nut.");
				
			}
			System.out.print("Another item? (y/n)");
			repeat = input.next();
		}
		System.out.println("\nWe will go nuts to get you this order!");
		input.close();
	}
}
