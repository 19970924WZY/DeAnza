/**
 * 
 * @author Zhengyu Wu
 * @version CIS36A 3/7/2019
 *
 */

public class Comments {
    
	/**
	 * This method will test if the year entered by user is a leap year.
	 * @param date
	 * @return if it is leap year
	 */
    public static boolean isLeapYear(int date) {
        if (date % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * This method will return the formatted name for the user.
     * @param first name
     * @param initial name
     * @param last name
     * @return the formatted name
     */
    public static String formatName(String first, char initial, String last) {
        return first + " " + initial + ". " + last;
    }
    /**
     * The method will return the area of a circle based on the radius that entered by user.
     * @param radius
     * @return the area of circle
     */
    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }
    /**
     * main method here.
     * @param args
     */
    public static void main(String[] args) {
        //method calls go here
    }
}
