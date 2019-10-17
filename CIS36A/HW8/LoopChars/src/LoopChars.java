/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */

import java.util.Scanner;

public class LoopChars {

    public static void main(String[] args) {
        int n; // the integer number
        String ch; // the single character
        Scanner input = new Scanner(System.in);
        System.out.println("** Loopy Characters!**\n");
        System.out.print("Enter an integer between 1 and 20: ");
        //n = input.nextInt();

        //Put your code here to test for input mismatch exception (String entered, not number)
        while(!input.hasNextInt()) {
        	System.out.println("Please enter numbers not characters.");
        	input.nextLine();
        	System.out.println("Enter an integer between 1 and 20: ");

        }
        n = input.nextInt(); 
        /*
         * n = input.nextInt() must be placed after the while loop for the input mismatch exception.
         * If it appears before the while loop, the program can not test if the user enter a string
         * or an integer.
         */
        
        System.out.print("Enter a single character: ");
        ch = input.next();
        System.out.println();

        // Repeating the char n times with a for-loop.
        System.out.println("#1. Printing " + ch + " " + n + " times:");
        // Put your code here


        for(int itemNO1 = 0; itemNO1 < n; itemNO1++) {
        	System.out.print(ch);
        }
        System.out.println("\n");

        // Repeating the char n times with stars on odd indexes.
       	System.out.println("#2. Printing " + ch + " character " + n + " times substituting '*' on odd indexes:");
       	// Put your code here
      
       	for(int itemNO2 = 0; itemNO2 < n; itemNO2++) {
       		if(itemNO2%2 == 1) {
       			System.out.print("*"); //odd place of the length will be printed as "*"
       		}
       		else{
       			System.out.print(ch);
        	}
        }
      
       	System.out.println("\n");

        // Repeating the character n times with tick marks (+) every 5 chars
        System.out.println("#3. Printing " + ch + " character " + n + " times substituting (+) every fifth character:\n");
        // Put your code here
        
        for(int itemNO3 =1; itemNO3 < n+1; itemNO3++) {
        	if(itemNO3 % 5 ==0 && itemNO3 != 0) {
        		System.out.print("+");
        	}
        	else {
        		System.out.print(ch);
        	}
        }
        
        
        
        
        
        
        System.out.println("\n");

        System.out.println("#4. Printing " + n + " lines of the previous loop:");
        // Hint: put your for-loop from the previous challenge inside another
        // for-loop that has a different counting variable.
        // Put your code here
        for(int itemNO4 = 0; itemNO4 < n; itemNO4++) {
        	 for(int itemNO5 =1; itemNO5 < n+1; itemNO5++) {
             	if(itemNO5 % 5 ==0 && itemNO5 != 0) {
             		System.out.print("+");
             	}
             	else {
             		System.out.print(ch);
             	}
             }
        	 System.out.println();
        }

       input.close();
    }
}

/* Output:
** Loopy Characters!**

Enter an integer between 1 and 20: ten
Please enter numbers not characters.
Enter an integer between 1 and 20: 
10
Enter a single character: A

#1. Printing A 10 times:
AAAAAAAAAA

#2. Printing A character 10 times substituting '*' on odd indexes:
A*A*A*A*A*

#3. Printing A character 10 times substituting (+) every fifth character:

AAAA+AAAA+

#4. Printing 10 lines of the previous loop:
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
AAAA+AAAA+
*/