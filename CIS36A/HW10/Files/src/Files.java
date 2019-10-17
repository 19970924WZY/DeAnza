/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.io.*;
import java.util.Scanner;
public class Files {
	public static void main(String[] args) throws IOException{
		File infile = new File("infile.txt");
		File outfile = new File("outfile.txt");
		Scanner input = new Scanner(infile);
		
		int first = input.nextInt();
		int second = input.nextInt();
		
		PrintWriter output = new PrintWriter(outfile);
		
		output.println("first = " + first);
		output.println("second = " + second);
		
		input.close();
		output.close();
		
	}

}
