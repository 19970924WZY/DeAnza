/*
 * @Zhengyu Wu
 * CIS 36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Price {
	public static void main(String[] args) {
	    String name;
	    double price = 0;
	    
	    
	    
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter the product name: ");
	    name = input.nextLine();
	    
	    System.out.print("Price of the " + name + ": ");
	    price = input.nextDouble();
	    
	    final int percent = 100;
	    double taxRate = 0;
	    System.out.print("Enter sales tax rate (%): ");
	    taxRate = input.nextDouble();
	    double tax = price * taxRate / percent;
	    price += tax;
	    
	    System.out.printf("Total price: $%.2f\n",price);
	    int dollars = (int) price;
	    System.out.println("In whole dollars: $" + dollars);
	    input.close();
	}
}
