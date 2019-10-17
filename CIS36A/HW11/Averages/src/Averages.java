/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
import java.io.*;

public class Averages {
	public static void main(String[] args) 
			throws IOException{
		File infile = new File("nums.txt");
		Scanner input = new Scanner(infile);
		double sum = 0.0;
		double num = 0.0;
		int count = 0;
		while(input.hasNextDouble()) {
			num = input.nextDouble();
			System.out.println("Processing the number: " + num);
			sum += num;
			count ++;
		}
		System.out.println("The average is: " + sum/count);
		
		File outfile = new File("average.txt");
		PrintWriter output = new PrintWriter(outfile);
		output.println("The average is: " + sum/count);
		
		input.close();
		output.close();
		
	}
}
