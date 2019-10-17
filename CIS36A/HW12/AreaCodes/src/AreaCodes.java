/*
 * @Zhengyu Wu
 * CIS 36A
 */
import java.io.*;
import java.util.Scanner;

public class AreaCodes {
    
    public static void main(String[] args) throws IOException {
        String name, gender, phone;
        //Declare your two arrays here - one per area code
        String[] SJArea = new String[8];
        String[] SCArea = new String[8];
        //Declare File and Scanner
        File infile = new File("customers.txt");
        Scanner input = new Scanner(infile);
        
        
        int i = 0;
        int j = 0;
        while(input.hasNextLine()) {
            name = input.nextLine();
            gender = input.nextLine();
            phone = input.nextLine();
          
            
            if(gender.equalsIgnoreCase("M")) {
            	name = "Mr." + name;
            }
            else if(gender.equalsIgnoreCase("F")) {
            	name = "Ms." + name;
            }
            else if(gender.equalsIgnoreCase("O")) {
            	name = "Mx." + name;
            }
            
            
            if(phone.substring(0,3).equals("408")) {
            	
            	SJArea[i] = name;
            	i++;
            	
            }
            if(phone.substring(0,3).equals("831")) {
            	
            	SCArea[j] = name;
            	j++;
            }
        }
        capitalizeNames(SJArea);
        capitalizeNames(SCArea);
        
        
        printArray(SJArea,"SJCustomers.txt");
        printArray(SCArea,"SCCustomers.txt");
        input.close();
       
        
    }
    
          //write Javadoc comment here
    /**
     * This method takes an array of Strings,
     * It capitalize all of the letters in each String of the array.
     * @param name. An array of String.
     */
    public static void capitalizeNames(String[] name) {
    	for(int a = 0; a < name.length; a++) {
    		name[a] = name[a].toUpperCase();
    	}
    	
        return;
    }
    
          //write Javadoc comment here
    /**
     * This method is named printArray,
     * it throws IOException,
     * It uses a for loop to print out the contents 
     * of the array in the file, with each element 
     * on its own line.
     * @param names. An array of Strings.
     * @param fileName. A String for the name of a text file in which to write out the data.
     * @throws IOException
     */
    public static void printArray(String[] names, String fileName) throws IOException{//throw IOException
    	File outfile = new File(fileName);
    	PrintWriter pw = new PrintWriter(outfile);
    	for(int a = 0; a < names.length; a++){
    		pw.println(names[a]);
    	}
    	pw.close();
    	return;
    }
}