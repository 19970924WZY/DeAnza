/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.println("***Time to Learn the Times Table!***\n");
		System.out.print("Enter the size of the times table: ");
		size = input.nextInt();
		for(int row = 1; row <= 12; row++) {
			for(int col = 1; col <= size; col++) {
				System.out.print( col + " * " + row + " = " + (col* row) + "\t" );
			}
			System.out.println();
		}
		input.close();
	}
}
