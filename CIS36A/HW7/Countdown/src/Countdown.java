/*
 * @Zhengyu Wu
 * @Lyxa Tang
 * CIS36A TTh 11:30am-01:20pm
 */

public class Countdown {
	public static void main(String[] args) {
		int max = 10;
		System.out.println("NASA Mission Control readying for liftoff.");
		System.out.println("Initializing countdown from 10...");
		for(int i = max; i>= 1; i--) {
			System.out.println(i);
		}
		System.out.println("We have liftoff!");
	}
}
