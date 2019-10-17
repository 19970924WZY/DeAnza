/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am-01:20pm
 */
import java.util.Scanner;
public class Vote {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String CANDIDATE_A = "Espinosa-Pieb";
		final String CANDIDATE_B = "Mary Pape";
		final String CANDIDATE_C= "Tracey";
		int candidateCountA = 0;
		int candidateCountB = 0;
		int candidateCountC = 0;
		String userInput;
		
		System.out.println("***Voting Machine!***\n\n");
		do {
			
			System.out.println("Candidate A: " + CANDIDATE_A);
			System.out.println("Candidate B: " + CANDIDATE_B);
			System.out.println("Candidate C: " + CANDIDATE_C);
			System.out.print("\nEnter your choice (A-C) or X to exit: ");
			userInput = input.next();
			switch(userInput) {
			case "A":
				System.out.println("You chose candidate " + CANDIDATE_A + "\n");
				candidateCountA++;
				break;
			case "a":
				System.out.println("You chose candidate " + CANDIDATE_A + "\n");
				candidateCountA++;
				break;
			case "B":
				System.out.println("You chose candidate " + CANDIDATE_B + "\n");
				candidateCountB++;
				break;
			case "b":
				System.out.println("You chose candidate " + CANDIDATE_B + "\n");
				candidateCountB++;
				break;
			case "C":
				System.out.println("You chose candidate " + CANDIDATE_C + "\n");
				candidateCountC++;
				break;
			case "c":
				System.out.println("You chose candidate " + CANDIDATE_C + "\n");
				candidateCountC++;
				break;
			case "X":
				break;
			case "x":
				break;
			default:
				System.out.println("Invalid input. Please enter A-C or X\n");
			}
		}while(!userInput.equalsIgnoreCase("X"));
		
		System.out.println("\n***Election Results!***");
		System.out.println(CANDIDATE_A + ": " + candidateCountA);
		System.out.println(CANDIDATE_B + ": " + candidateCountB);
		System.out.println(CANDIDATE_C + ": " + candidateCountC);
		
		input.close();
	}
}

/* Example Output.
***Voting Machine!***


Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: 
A
You chose candidate Espinosa-Pieb

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: a
You chose candidate Espinosa-Pieb

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: B
You chose candidate Mary Pape

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: b
You chose candidate Mary Pape

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: C
You chose candidate Tracey

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: c
You chose candidate Tracey

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: s
Invalid input. Please enter A-C or X

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: z
Invalid input. Please enter A-C or X

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: qqq
Invalid input. Please enter A-C or X

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: A
You chose candidate Espinosa-Pieb

Candidate A: Espinosa-Pieb
Candidate B: Mary Pape
Candidate C: Tracey

Enter your choice (A-C) or X to exit: x

***Election Results!***
Espinosa-Pieb: 3
Mary Pape: 2
Tracey: 2
*/