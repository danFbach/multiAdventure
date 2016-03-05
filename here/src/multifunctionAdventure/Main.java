package multifunctionAdventure;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//String playerName;
		Integer lifeLeft = 100;
		
		Integer decider;
		
	//LifeFunction life = new LifeFunction();
		
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	

		do{
			System.out.println("1 or 2");
			decider = scan.nextInt();
			LifeFunction choice = new LifeFunction();
			Integer choiceAns = choice.life(decider);
			choiceAns += lifeLeft;
				System.out.println(choiceAns);
				lifeLeft = choiceAns;
				
		}while(lifeLeft > 0);{}
	}
}

	
/*
 * System.out.println("Welcome player! I've got a fantastic bunch of events lined up for you.\n"
		+ "Before we begin, I need something to call you. Go ahead and enter your name...for\n"
		+ "best results first and last name is recomended.");
playerName = scan.nextLine();
System.out.println("Thanks " + playerName + "! We may now proceed! For our 1st event, I need to\n"
		+ "know if you like music.\n"
		+ "Yes or No?");
		*/
