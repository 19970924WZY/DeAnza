/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Sub {
	public static int sub(int num1, int num2) {
		   int difference = num1 - num2;
		   return difference;
		   //Alter the return variable from "sum" to "difference" 
		   //int sum = num1 + num2;
		   //return sum;
		}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers to subtract: ");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	    int diff = sub(num1, num2);
	    System.out.println("Difference=" + diff);
	    input.close();
	}
	
	
}
