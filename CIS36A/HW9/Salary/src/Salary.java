/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30-01:20
 */
import java.util.Scanner;

public class Salary {

    //Write your methods here
	public static double weeklySalary(int workHour, double hourlyWage) {
		double weekSalary = workHour * hourlyWage;
		return weekSalary;
	}
	public static double monthlySalary(int hour, double hourlyWage) {
		double monthlySalary = hour * hourlyWage * 4;
		return monthlySalary;
	}
	public static double yearlySalary(int hour, double hourlyWage) {
		double yearlySalary = hour * hourlyWage * 50;
		return yearlySalary;
	}
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours;
        double hourly_wage;
        double weekly_salary = 0;
        double monthly_salary = 0;
        double yearly_salary = 0;
        System.out.println("This program will calculate your weekly, monthly "
                + "and yearly salary!");
        System.out.print("Please enter your hourly wage: ");
        hourly_wage = input.nextDouble();
        System.out.print("Please enter the number of hours you work each week: ");
        hours = input.nextInt();

        //call methods below
        weekly_salary = weeklySalary(hours,hourly_wage);//method call goes here
        monthly_salary = monthlySalary(hours,hourly_wage);//method call goes here
        yearly_salary = yearlySalary(hours,hourly_wage);//method call goes here
               
        System.out.printf("You make $%.2f per week\n", weekly_salary);
        System.out.printf("You make $%.2f per month\n", monthly_salary);
        System.out.printf("You make $%.2f per year\n", yearly_salary);
        input.close();
    }

}