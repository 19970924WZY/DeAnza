/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 * Madlibs.java
 */
import java.util.Scanner;
public class Madlibs {
	public static void main(String[] args) {
		/*
		 * Variables declaration
		 */
		Scanner input = new Scanner(System.in);
		String mansName;
		String womansName;
		String anAdjective;
		String aSecondAdjective;
		String aColor;
		String aNoun;
		String anAnimal;
		String aBodyPart;
		String aHoliday;
		
		/*
		 * Information I/O
		 */
		System.out.println("Welcome to Madlibs!\n"); 
		System.out.print("Enter a man's name: "); 	//Ask user to enter a man's name.
		mansName = input.nextLine();				
		System.out.print("Enter a woman's name: ");	//Ask user to enter a woman's name.
		womansName = input.nextLine();
		System.out.print("Enter an adjective: ");	//Ask user to enter an adjective.
		anAdjective = input.nextLine();
		System.out.print("Enter another adjective: ");  //Ask user to enter another adjective.
		aSecondAdjective = input.nextLine();
		System.out.print("Enter a color: ");        //Ask user to enter a color.
		aColor = input.nextLine();
		System.out.print("Enter a noun: ");         //Ask user to enter a noun.
		aNoun = input.nextLine();
		System.out.print("Enter an animal: ");      //Ask user to enter an animal.
		anAnimal = input.nextLine();
		System.out.print("Enter a body part: ");    //Ask user to enter a body part.
		aBodyPart = input.nextLine();
		System.out.print("Enter a holiday: ");      //Ask user to enter a holiday.
		aHoliday = input.nextLine();
		
		/*
		 * Title:
		 * The Haunted Tower
		 */
		System.out.println("\nThe Haunted Tower\n");
		
		/*
		 * Paragraph 1:
		 * 	One afternoon <man name> and <woman name> were walking down 
		 * a(n) <adjective1> trail, looking for kindling for their campfire.
		 * The trees were <adjective2> and <color>, and there were colorful 
		 * wildflowers all around. <man name> and <woman name> began to pick the 
		 * wildflowers, and after a while, they went so far that they had wandered
		 *  away from the trail.
		 */
		System.out.print("One afternoon " + mansName + " and " + womansName +
				" were walking down a(n) " + anAdjective + 
				" trail, looking for kindling for their campfire.\n" +
				"The trees were " + aSecondAdjective + " and " +
				aColor + ", and there were colorful wildflowers all around. " + 
				mansName + " and " + womansName +
				" began to \npick the wildflowers, and after a while," +
				"they went so far that they had wandered away from the trail.\n\n");
		
		/*
		 * Paragraph 2:
		 * 	It started to get dark. <man name> began to get worried, but <woman name> seemed 
		 * excited to have an adventure. 'Look!' <woman name> said. 'Do you see that tower? 
		 * It looks like a <noun>!'
		 */
		System.out.print("It started to get dark. " + mansName + " began to get worried, but "+
				womansName + " seemed excited to have an adventure. 'Look!'\n" + womansName +
				" said. 'Do you see that tower? It looks like a " + aNoun + "!'\n\n");
		
		/*
		 * Paragraph 3:
		 * 'We're saved!' cried <man name>, who was relieved.
		 */
		System.out.print("'We're saved!' cried " + mansName + " , who was relieved.\n\n");
		
		/*
		 * Paragraph 4:
		 * 	Once they got closer, <man name> felt very uneasy again. It didn't look like the cozy
		 * little cottage <man name> had been imagining, but rather a big, spooky tower! It was 
		 * about 14 feet tall, and it was covered with green ivy and moss. It was the creepiest 
		 * thing <man name> had ever seen!
		 */
		System.out.print("Once they got closer, " + mansName + " felt very uneasy again." +
				" It didn't look like the cozy little cottage " + mansName + " had\n" +
				"been imagining, but rather a big, spooky tower!" + 
				"It was about 14 feet tall, and it was covered with green ivy\nand moss. It was the creepiest thing " +
				mansName + " had ever seen!\n\n");
		
		/*
		 * Paragraph 5:
		 * 	<man name> said, '<woman name>, let's keep walking! There's no way
		 * I'm going into that tower! It looks haunted!'
		 */
		System.out.print(mansName + " said, '" + womansName + ", let's keep walking!"+
				" There's no way I'm going into that tower! It looks haunted!'\n\n");
		
		/*
		 * Paragraph 6:
		 * 	'Don't be such a(n) <animal>! We're going in. I 
		 * think it looks safe to me!' said <woman name>.
		 */
		System.out.print("'Don't be such a(n) " + anAnimal + "! We're going in. I think it looks safe to me!' said "+
				womansName + ".\n\n");
		
		/*
		 * Paragraph 7:
		 * 	<man name> was so scared. He felt his <body part> chatter as 
		 * <woman name> opened the door. All of a sudden, <man name> felt 
		 * that he was not alone. He opened his eyes, prepared to see the 
		 * worst. But instead, he saw all his friends and family inside the 
		 * haunted tower! 'Surprise! Happy <holiday>, <man name>!' they all cried.
		 */
		
		System.out.print(mansName + " was so scared. He felt his " + aBodyPart +
				" chatter as " + womansName + " opened the door. All of a sudden, " +
				mansName + " felt that he\nwas not alone. He opened his eyes, prepared" +
				"to see the worst. But instead, he saw all his friends and family\ninside" + 
				" the haunted tower! 'Surprise! Happy " + aHoliday + ", " + mansName +
				"!' they all cried.");
		input.close();
	}
}



/*
 * Test 1:
 * 
 * Welcome to Madlibs!
 *
 * Enter a man's name: Larry
 * Enter a woman's name: Noreen
 * Enter an adjective: funny
 * Enter another adjective: amazing
 * Enter a color: red
 * Enter a noun: book
 * Enter an animal: duck
 * Enter a body part: leg
 * Enter a holiday: Valentine's
 * 
 * The Haunted Tower
 * 
 * One afternoon Larry and Noreen were walking down a(n) funny trail, looking for kindling for their campfire.
 * he trees were amazing and red, and there were colorful wildflowers all around. Larry and Noreen began to 
 * pick the wildflowers, and after a while,they went so far that they had wandered away from the trail.
 * 
 * It started to get dark. Larry began to get worried, but Noreen seemed excited to have an adventure. 'Look!'
 * Noreen said. 'Do you see that tower? It looks like a book!'
 * 
 * 'We're saved!' cried Larry , who was relieved.
 * 
 * Once they got closer, Larry felt very uneasy again. It didn't look like the cozy little cottage Larry had
 * been imagining, but rather a big, spooky tower!It was about 14 feet tall, and it was covered with green ivy
 * and moss. It was the creepiest thing Larry had ever seen!
 * 
 * Larry said, 'Noreen, let's keep walking! There's no way I'm going into that tower! It looks haunted!'
 * 
 * 'Don't be such a(n) duck! We're going in. I think it looks safe to me!' said Noreen.
 * 
 * Larry was so scared. He felt his leg chatter as Noreen opened the door. All of a sudden, Larry felt that he
 * was not alone. He opened his eyes, preparedto see the worst. But instead, he saw all his friends and family
 * inside the haunted tower! 'Surprise! Happy Valentine's, Larry!' they all cried.
 */

/*
 * Test 2:
 * Welcome to Madlibs!
 * 
 * Enter a man's name: Chris
 * Enter a woman's name: Janet
 * Enter an adjective: beautiful
 * Enter another adjective: fabulous
 * Enter a color: white
 * Enter a noun: car
 * Enter an animal: dog
 * Enter a body part: heart
 * Enter a holiday: Christmas
 * 
 * The Haunted Tower
 * 
 * One afternoon Chris and Janet were walking down a(n) beautiful trail, looking for kindling for their campfire.
 * The trees were fabulous and white, and there were colorful wildflowers all around. Chris and Janet began to 
 * pick the wildflowers, and after a while,they went so far that they had wandered away from the trail.
 * 
 * It started to get dark. Chris began to get worried, but Janet seemed excited to have an adventure. 'Look!'
 * Janet said. 'Do you see that tower? It looks like a car!'
 * 
 * 'We're saved!' cried Chris , who was relieved.
 * 
 * Once they got closer, Chris felt very uneasy again. It didn't look like the cozy little cottage Chris had
 * been imagining, but rather a big, spooky tower!It was about 14 feet tall, and it was covered with green ivy
 * and moss. It was the creepiest thing Chris had ever seen!
 * 
 * Chris said, 'Janet, let's keep walking! There's no way I'm going into that tower! It looks haunted!'
 * 
 * 'Don't be such a(n) dog! We're going in. I think it looks safe to me!' said Janet.
 * 
 * Chris was so scared. He felt his heart chatter as Janet opened the door. All of a sudden, Chris felt that he
 * was not alone. He opened his eyes, preparedto see the worst. But instead, he saw all his friends and family
 * inside the haunted tower! 'Surprise! Happy Christmas, Chris!' they all cried.
 */