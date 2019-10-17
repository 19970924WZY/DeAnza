/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.io.*;
import java.util.Scanner;
public class Animals {
	
	/**
	* Prints out the values of two arrays side-by-side
	* @param array1 the first array to print
	* @param array2 the second array to print
	*/
	public static void printArrays(int array1[], String array2[]) throws IOException{
		File outputFile = new File("outfile.txt");
		PrintWriter out = new PrintWriter(outputFile);
		out.println("Animals at out farm:");
		for(int i = 0; i < array1.length && i < array2. length; i++) {
			out.println(array1[i] + " " + array2[i]);
		}
		out.close();
	}
	
	
	public static void main(String[] args) throws IOException{
		File numFile = new File("nums.txt");
		File animalsFile = new File("animals.txt");
		Scanner numInput = new Scanner(numFile);
		Scanner animalsInput = new Scanner(animalsFile);
		
		
		int[] numsArray = new int[5];
		numsArray[0] = numInput.nextInt();
		numsArray[1] = numInput.nextInt();
		numsArray[2] = numInput.nextInt();
		numsArray[3] = numInput.nextInt();
		numsArray[4] = numInput.nextInt();
		
		String[] animalsArray = new String[5];
		animalsArray[0] = animalsInput.nextLine();
		animalsArray[1] = animalsInput.nextLine();
		animalsArray[2] = animalsInput.nextLine();
		animalsArray[3] = animalsInput.nextLine();
		animalsArray[4] = animalsInput.nextLine();
		
		printArrays(numsArray,animalsArray);
		
		
		numInput.close();
		animalsInput.close();
	}

}
