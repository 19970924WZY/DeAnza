/**
 * @author Zhengyu Wu
 * @version CIS36A 11:30am-01:20pm
 */
import java.io.*;
import java.util.Scanner;

public class Statistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        int count = 0;

        String word = "";
        String line = "";

        //rest of code goes here

        File infile = new File("sonnet.txt");
        File outfile = new File("statistics.txt");
        Scanner input = new Scanner(infile);
        PrintWriter output = new PrintWriter(outfile);
        while(input.hasNext()) {
        	word = input.next();
        	count ++;
        }
       output.println("The sonnet has " + count + " words.");
       input.close();
       input = new Scanner(infile); // Reset the input to the beginning of the .txt
       count = 0; //reset the count to 0
       while(input.hasNextLine()) {	//if has next line
    	   line = input.nextLine();
    	   count ++;
       }
       output.println("The sonnet has " + count + " lines.");
       input.close();
       output.close();
       
    }

}

