/*
 * @author Zhengyu Wu
 * CIS 36A TTh 11:30am-01:20pm
 *
 */
//import java.util.Scanner;

public class EvenMore {
    
    /*
         Given a String, return true if the String starts
        with "hi" and false otherwise.
        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false 
     */
	/**
	 * This method tests if a string stars with "hi"
	 * @param str
	 * @return true if the String starts
	 * with "hi" and false otherwise.
	 */
    public static boolean startHi(String str) {
    	String test;
    	test = str.substring(0,2);
    	if(test.equalsIgnoreCase("hi")) {
    		return true;
    	}
        return false;
    }
    
    /*
         Given a String and a non-negative int n,
        the front of the String is the first 3 chars,
        or whatever is there if the string is less than length 3
        Return n copies of the front;
        Hint: use a for loop and string concatenation
        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Abcd", 3) → "AbcAbcAbc"
        frontTimes("Oy", 4)  → "OyOyOyOy"
     */
    /**
     * This method prints out the front 3 characters n times,
     * if the string is less than 3 character, it will print the whole 
     * string n times instead.
     * @param str
     * @param n
     * @return a string after repeat n times
     */
    public static String frontTimes(String str, int n) {
    	String temp = "";
    	String result = "";
    	if(str.length()>=3) {
    		temp = str.substring(0,3);
    	}
    	else {
    		temp = str;
    	}
    	for(int i = 0; i<n; i++) {
    		result += temp;
    	}
        return result;
    }
    
    /*
        Given 2 int values, return whichever value is nearest to the value 10,
        or return 0 in the event of a tie.
        Hint: recall that Math.abs(n) returns the absolute value of a number.
        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0
     */
    /**
     * This method will test which integer is nearest to the value 10.
     * @param a
     * @param b
     * @return the integer nearest to 10.
     */
    public static int close10(int a, int b) {
    	int differA = Math.abs(a-10);
    	int differB = Math.abs(b-10);
    	if(differA > differB) {
    		return b;
    	}
    	else if(differA < differB) {
    		return a;
    	}
        return 0;
    }
    
    /*
         Given a String, return true if the first instance of "x" in
        the String is immediately followed by another "x".
        Hint: use a for loop and substring
        doubleX("axxbb") → true
        doubleX("axaxax") → false
        doubleX("xxxxx") → true
     */
    
    /**
     * This method tests if the first 'x' is immediately followed
     * by another 'x'
     * @param str
     * @return true if the first instance of "x" in
        the String is immediately followed by another "x".
     */
    public static boolean doubleX(String str){
    	String temp = "";
    	for(int i = 0; i< str.length()-2; i++) {
    		if(str.charAt(i)=='x') {
    			temp = str.substring(i,i+2);
    			if(temp.equals("xx")) {
    				return true;
    			}
    		}
    	}
        return false;
    }
    

   

    /**
     * Main method of this class.
     * @param args
     */
    public static void main(String[] args)
    {
        String value;
        boolean result;
        int num;
        System.out.println("***Testing startHi***\n");
        result = startHi("hi there");
        System.out.println("Should be true: " + result);
        result = startHi("hi");
        System.out.println("Should be true: " + result);
        result = startHi("hello hi");
        System.out.println("Should be false: " + result +"\n");
      
        System.out.println("***Testing frontTimes***\n");
        value = frontTimes("Chocolate", 2);
        System.out.println("Should be ChoCho: " + value);
        value = frontTimes("Abcd", 3);
        System.out.println("Should be AbcAbcAbc: " + value);
        value = frontTimes("Oy", 4);
        System.out.println("Should be OyOyOyOy: " + value + "\n");
          
        System.out.println("***Testing close10***\n");
        num = close10(8, 13);
        System.out.println("Should be 8: " + num);
        num = close10(13, 8);
        System.out.println("Should be 8: " + num);
        num = close10(13, 7);
        System.out.println("Should be 0: " + num + "\n");
      
        System.out.println("***Testing doubleX***\n");
        result = doubleX("axxbb");
        System.out.println("Should be true: " + result);
        result = doubleX("axaxax");
        System.out.println("Should be false: " + result);
        result = doubleX("xxxxx");
        System.out.println("Should be true: " + result + "\n");
      
        System.out.println("***End of Tests***");

       
    }
   

}

