/*
 * @author Zhengyu Wu
 * CIS 36A TTh 11:30am - 01:20pm
 */
public class Student {
	public static void main(String[]args) {
		int studentIDNumber;
		char firstNameInitial;
		char lastNameInitial;
		double studentGPA;
		boolean graduateIn2019;
		
		studentIDNumber = 20270690;
		firstNameInitial = 'Z';
		lastNameInitial = 'W';
		studentGPA = 3.8;
		graduateIn2019 = true;
		
		System.out.println("My student id #: " + studentIDNumber);
		System.out.println("My initials are: " + firstNameInitial + lastNameInitial);
		System.out.println("My GPA is: " + studentGPA);
		System.out.println("I will graduate in 2019: " + graduateIn2019);
	}
}
