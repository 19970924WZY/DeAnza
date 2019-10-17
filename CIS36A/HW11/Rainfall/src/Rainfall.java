/**
 * @author Zhengyu Wu
 * @version CIS36A TTh 11:30am-01:20pm 01.19.2019
 */
import java.util.Scanner;
import java.io.*;

public class Rainfall {
	public static void main(String[] args) 
			throws IOException{
		File rainFile = new File("rain2018_19.txt");
		File averageFile = new File("average_rain.txt");
		File outFile = new File("rain_comparison.txt");
		Scanner input = new Scanner(rainFile);
		PrintWriter outprint = new PrintWriter(outFile);
		
		double[] rainArray = new double[12]; // There are 12 months per year.
		double[] averageArray = new double[12];
		double[] deficitArray = new double[12];
		double deficitSum = 0.0;
		
		for(int i = 0; i < rainArray.length; i++) {
			rainArray[i] = input.nextDouble();
		}
		input.close();
	
		
		input = new Scanner(averageFile);
		for(int j = 0; j < averageArray.length; j++) {
			averageArray[j] = input.nextDouble();
		}
		input.close();
		
		
		for(int k = 0; k < deficitArray.length; k++) {
			deficitArray[k] = averageArray[k] - rainArray[k];
			deficitSum += deficitArray[k];
		}
		
		outprint.println("Rainfall in San Jose: A Comparison\n");
		outprint.println("Average \t2018-9 \tDeficit");
		for(int count = 0; count < deficitArray.length; count++) {
			outprint.printf("%.2f\t%.2f\t%.2f\n",averageArray[count],
					rainArray[count],deficitArray[count]);
		}
		outprint.printf("\nTotal deficit: %.2f",deficitSum);
		outprint.close();
		
	}

}

