/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */

public class Humpty {
	public static void main(String[] args) {
		int loopLimit = 150;
		
		
		
		
		for(int indicator = 1; indicator <= loopLimit; indicator++) {
			if((indicator%4==0) && (indicator%5==0)) {
				System.out.println("Had a great fall");
			}
			else if(indicator%4==0) {
				System.out.println("Humpty Dumpty");
			}
			else if(indicator%5==0) {
				System.out.println("Sat on a wall");
			}
			else {
				System.out.println(indicator);
			}
		}
		
		
		
	}
}

