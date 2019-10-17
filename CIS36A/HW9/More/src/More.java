/*
 * @author Zhengyu Wu
 * CIS 36A TTh 11:30am - 01:20pm
 *
 */
import java.util.Scanner;

public class More {
    /**
     * Given a string, take the last char and return a new String with the last char added at the front and back,
     * so "cat" yields "tcatt". The original string will be length 1 or more.
     * backAround("cat") → "tcatt"
     * backAround("Hello") → "oHelloo"
     * backAround("a") → "aaa"
     * @param str the input String
     * @return a new String with the last char added to front and back
     */
   
    public static String backAround(String str) {
    	String result;
    	char lastChar;
    	if(str.length()==1) {
    		result = str + str + str;
    	}
    	else {
    		lastChar = str.charAt(str.length()-1);
    		result = lastChar + str + lastChar;
    	}
    	
        return result;
    }
   
    /**
     * Given 2 strings, a and b, return a String of the form short+long+short,
     * with the shorter String on the outside and the longer String on the inside.
     * The Strings will not be the same length, but they may be empty (length 0).
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     * @param a the first String to combine
     * @param b the second String to combine
     * @return a new String short+long+short
    */
    public static String comboString(String a, String b)
    {
    	String combine = "";
    	if(a.length()==b.length()) {
    		if(a.length() == 0 && b.length()==0) {
    			combine = "This two strings are empty.";
    		}
    		else
    		{
    			combine = "This two strings can not have same length unless they are empty.";
    		}
    	}
    	else if(a.length() > b.length()) {
    		combine = b + a + b;
    	}
    	else if(a.length() < b.length()) {
    		combine = a + b + a;
    	}
        return combine;
    }
   
    /**
     * Given a String of even length, return a String 
     * made of the middle two chars, so the String 
     * "string" yields "ri".
     * Note: You can assume the String length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     * @param str the String to extract the middle
     * @return the middle of the String
     */
    public static String middleTwo(String str){
    	String middle;
    	int halfString;
    	halfString = ((str.length())/2)-1;
    	middle = str.substring(halfString,halfString+2);
        return middle;
    }

    /**
     * Given a string, return a new String made of 3 copies of the last 2 chars of the original String.
     * The String length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     * @param str the String to copy
     * @return the repeated characters
     */
    public static String extraEnd(String str) {
    	String extra = "";
    	String last;
    	if(str.length()<2) {
    		extra = "The String length will be at least 2.";
    	}
    	last = str.substring(str.length()-2,str.length());
    	extra = last + last + last;
        return extra;
    }
    
    /**
     * Given a String, determines whether the given character is in the String
     * contains('@', "bob@jobs.com") → true
     * contains('@', "bobajobs.com") → false
     * contains('2', "tr2dat") → true
     * @param c the character to locate in the String
     * @param s the String to search
     * @return whether c is in s
     */
    public static boolean contains(char c, String s) {
    	for(int i = 0; i<s.length();i++) {
    		if(s.charAt(i)==c) {
    			return true;
    		}
    	}
        return false;
    }
   

    /**
     * Main method of this class.
     * @author Zhengyu Wu
     * @version CIS36A 03/07/2019
     * @param args
     */
    public static void main(String[] args)
    {
        String value;
        boolean b;
        System.out.println("***Testing backAround***\n");
        value = backAround("cat");
        System.out.println("Should print tcatt: " + value);
        value = backAround("Hello");
        System.out.println("Should print oHelloo: " + value);
        value = backAround("a");
        System.out.println("Should print aaa: " + value +"\n");
      
        System.out.println("***Testing comboString***\n");
        value = comboString("Hello", "hi");
        System.out.println("Should be hiHellohi: " + value);
        value = comboString("hi", "Hello");
        System.out.println("Should be hiHellohi: " + value);
        value = comboString("aaa", "b");
        System.out.println("Should be baaab: " + value + "\n");
          
        System.out.println("***Testing middleTwo***\n");
        value = middleTwo("string");
        System.out.println("Should be ri: " + value);
        value = middleTwo("code");
        System.out.println("Should be od: " + value);
        value = middleTwo("Practice");
        System.out.println("Should be ct: " + value + "\n");
      
        System.out.println("***Testing extraEnd***\n");
        value = extraEnd("Hello");
        System.out.println("Should be lololo: " + value);
        value = extraEnd("ab");
        System.out.println("Should be ababab: " + value);
        value = extraEnd("feet");
        System.out.println("Should be etetet: " + value + "\n");
        
        System.out.println("***Testing contains***\n");
        b = contains('@', "bob@jobs.com");
        System.out.println("Should be true: " + b);
        b = contains('@', "bobajobs.com");
        System.out.println("Should be false: " + b);
        b = contains('2', "tr2dat");
        System.out.println("Should be true: " + b);
      
        System.out.println("***End of Tests***");
       
    }
   

}
