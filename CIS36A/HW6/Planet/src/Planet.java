/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 */
import java.util.Scanner;
public class Planet {
	public static void main(String[] argc) {
		Scanner input = new Scanner(System.in);
		final double MERCURY_MULT = 0.38;
		final double VENUS_MULT = 0.91;
		final double MARS_MULT = 0.38;
		final double JUPITER_MULT = 2.54;
		final double SATURN_MULT = 1.08;
		final double URANUS_MULT = 0.91;
		final double NEPTUNE_MULT = 1.19;
		final double PLUTO_MULT = 0.06;
		double weight;
		String planet;
		
		System.out.println("Welcome! ");
		System.out.println("What do you weigh on other planets?");
		System.out.print("Enter your weight in pounds: ");
		weight = input.nextDouble();
		System.out.println("Now, select from one of the following planets:");
		System.out.println("Mercury\nVenus\nMars\nJupiter\nSaturn\nUranus\nNeptune\nPluto");
		System.out.print("Please enter the planet: ");
		planet = input.next();
		planet = planet.toUpperCase();
		
		switch(planet) {
		case "MERCURY":
			weight *= MERCURY_MULT; //0.38
			System.out.printf("You weight %.1f lbs on Mercury", weight);
			break;
		case "VENUS":
			weight *= VENUS_MULT; //0.91
			System.out.printf("You weight %.1f lbs on Venus", weight);
			break;
		case "MARS":
			weight *= MARS_MULT; //0.38
			System.out.printf("You weight %.1f lbs on Mars", weight);
			break;
		case "JUPITER":
			weight *= JUPITER_MULT; //2.54
			System.out.printf("You weight %.1f lbs on Jupiter", weight);
			break;
		case "SATURN":
			weight *= SATURN_MULT; // 1.08
			System.out.printf("You weight %.1f lbs on Saturn", weight);
			break;
		case "URANUS":
			weight *= URANUS_MULT; // 0.91;
			System.out.printf("You weight %.1f lbs on Uranus", weight);
			break;
		case "NEPTUNE":
			weight *= NEPTUNE_MULT; // 1.19
			System.out.printf("You weight %.1f lbs on Neptune", weight);
			break;
		case "PLUTO":
			weight *= PLUTO_MULT; //0.06;
			System.out.printf("You weight %.1f lbs on Pluto", weight);
			break;
		default:
			System.out.println("You entered an invalid planet name.");
			System.out.println("Please rerun the program to try again.");
		}
		
		input.close();
		
		
	}
}
