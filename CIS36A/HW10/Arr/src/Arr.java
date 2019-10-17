/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
public class Arr {
	public static void print(int values[]) {
	    for (int i = 0; i < values.length; i++) {
	        System.out.print(values[i] + " ");
	    }
	}
	public static void addExtraCredit(int values[]) {
	    //Write the body of the method here
	    //Note: Do not print anything in this method
	    //No System.out.print statement(s) go here
		for(int j = 0; j<values.length;j++) {
			values[j] += 5;
		}
	}
	public static void print(double values[]) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
	}
	public static void print(char values[]) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
	}
	public static void main(String[] args) {
		int scores[] = {90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println("Integer exam scores:");
		print(scores);
		System.out.println("\nAfter adding extra credit:");
		addExtraCredit(scores);
		print(scores);
		System.out.println("\nDouble rainfall in inches:");
		double[] rainfall = {23.4, 16.4, 18.9, 52.7};
		print(rainfall);
		char[] vowels = {'a','e','i','o','u'};
		System.out.println("\nChar vowels:");
		print(vowels);
		
		
	}
}
