/**
* @author Zhengyu Wu
* @version CIS36A TTh 11:30am-01:20pm
*/

import java.util.Scanner;

public class Email3 {
    public static void main(String[] args) {
        String address;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        address = input.nextLine();

        if (!containsAt(address)) { // the method will return true or false so
                                    // we can check in an if statement
            System.out.println("Invalid email. Your email address must contain an @ symbol");
        } else if (containsSpace(address)) { // replace false with method call here
            System.out.println("Invalid email. Your email address cannot contain a space");
        } else if (!validExtension(address)) { // replace false with method call here
            System.out.println("Invalid email. Your email must contain a .com, .edu or .org extension");
        } else {
            System.out.println("Your email address is valid.");
        }
        input.close();
    }
    
    //Write JAVADOC comment here for validExtension
    /**
     * This method will test if the address has the valid extension.
     * Such as ".com", ".org" or ".edu".
     * @param address
     * @return true if the address contains valid extension, false if not.
     */
    public static boolean validExtension(String address) {
        // write method body here
    	String last;
    	last = address.substring(address.length()-4,address.length());
    	if(last.equals(".com")||last.equals(".org")||last.equals(".edu")) {
    		return true;
    	}
        return false;
    }
    
    //Write JAVADOC comment here for containsSpace
    /**
     * This method will test whether the address contains any space or not.
     * @param address
     * @return true if the address contains space and false if not.
     */
    public static boolean containsSpace(String address) {
        // write method body here
    	for(int j = 0; j < address.length(); j++) {
    		if(address.charAt(j) == ' ') {
    			return true;
    		}
    	}
        return false;
    }


    //Write JAVADOC comment here for containsAt
    /**
     * This method will check if an '@' character contained somewhere in the String.
     * @param address
     * @return true if there is an '@' in the String and false if not.
     */
    public static boolean containsAt(String address) {
        // write method body here
    	for(int i = 0; i < address.length(); i++) {
    		if(address.charAt(i)=='@') {
    			return true;
    		}
    	}
        return false;
    }

}