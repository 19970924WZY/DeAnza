/*
 * @Zhengyu Wu
 * CIS 36A TTh 11:30 am - 01:20 pm
 * Pirate.java
 */
import java.util.Scanner;  //Import Scanner package 
public class Pirate {
	public static void main(String[] args) {
		/*
		 * Variables declarations part.
		 */
		Scanner input = new Scanner(System.in);
		int firstLen;
		int lastLen;
		char lastChar;
		String firstName;
		String lastName;
		String pirateName;
		String title = "";
		String newLastName = "";
		
		/*
		 * System I/O part.
		 * Welcome the user and get the user's information.
		 */
		System.out.println("Git yer pirate name or ye be walkin' the plank!");
		System.out.print("Enter yer first name: ");
		firstName = input.next();
		System.out.print("Enter yer last name: ");
		lastName = input.next();
		
		/*
		 * Determine if the length of user's first name is > 6.
		 * If >6, let the new length equals to original length minus 6.
		 * Else, use the original length in next part determination.
		 */
		firstLen = firstName.length();
		if(firstLen > 6) {
			firstLen = firstLen - 6;
		}
		
		/*
		 * Determine if the length of user's last name is > 7.
		 * If > 7, let the new length equals to original length minus 7.
		 * Else, use the original length in next part determination.
		 */
		lastLen = lastName.length();
		if(lastLen > 7) {
			lastLen = lastLen - 7;
		}
		
		/*
		 * Last character of the user's last name.
		 * (Call both charAt() and length() functions.)
		 */
		lastChar = lastName.charAt(lastName.length()-1);
		
		/*
		 * Choose title from "Length of First Name" table.
		 * Length   Title
		 * 1		Crafty
		 * 2		Capt'n
		 * 3		Crusty
		 * 4		Legend
		 * 5		Shrewd
		 * 6		Stormy 
		 */
		if(firstLen == 1) {
			title = "Crafty";
		}else if(firstLen == 2) {
			title = "Capt'n";
		}else if(firstLen == 3) {
			title = "Crusty";
		}else if(firstLen == 4) {
			title = "Legend";
		}else if(firstLen == 5) {
			title = "Shrewd";
		}else if(firstLen == 6) {
			title = "Stormy";
		}else {
			System.out.println("No title matches the length of your first name.");
		}
		
		/*
		 * Choose newLastName from "Length of Last Name" table.
		 * Length   newLastName
		 * 1        Black
		 * 2        Crimson
		 * 3        Gold
		 * 4        Gray
		 * 5        Red
		 * 6        Scarlet
		 * 7        Silver
		 */
		if(lastLen == 1) {
			newLastName = "Black";
		}else if(lastLen == 2) {
			newLastName = "Crimson";
		}else if(lastLen == 3) {
			newLastName = "Gold";
		}else if(lastLen == 4) {
			newLastName = "Gray";
		}else if(lastLen == 5) {
			newLastName = "Red";
		}else if(lastLen == 6) {
			newLastName ="Scarlet";
		}else if(lastLen == 7) {
			newLastName = "Silver";
		}else {
			System.out.println("No new last name matches the length of your last name.");
		}
		
		//pirateName = title + firstName + " the ' + lastChar + arrr + newLastName + "
		pirateName = title + " " + firstName + " \"the '" + lastChar + "arrr " + newLastName + "\"";
		
		//Print out the pirate name.
		System.out.print("Yer Pirate name be: " + pirateName);
		
		input.close();
	}
}


/*
 * Example run 1:
 * Git yer pirate name or ye be walkin' the plank!
 * Enter yer first name: Jennifer
 * Enter yer last name: Parrish
 * Yer Pirate name be: Capt'n Jennifer "the 'harrr Silver"
 */
 
/*
 * Example run 2:
 * Git yer pirate name or ye be walkin' the plank!
 * Enter yer first name: Joey
 * Enter yer last name: Schmoe
 * Yer Pirate name be: Legend Joey "the 'earrr Scarlet"
 */

/*
 * Example run 3:
 * Git yer pirate name or ye be walkin' the plank!
 * Enter yer first name: Zhengyu 
 * Enter yer last name: Wu
 * Yer Pirate name be: Crafty Zhengyu "the 'uarrr Crimson"
 */
 