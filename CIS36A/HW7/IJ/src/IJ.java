/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
public class IJ {
	public static void main(String[] args) {
		final double MAX = 5.0;
		double j;
		System.out.println("i\tj");
		for(double i = -5.0; i<= MAX; i+=0.5) {
			j = Math.pow(i, 4.0);
			System.out.printf("%.1f\t%.1f\n",i,j);
		}
		
	}
}
