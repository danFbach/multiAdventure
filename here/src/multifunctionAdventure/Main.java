package multifunctionAdventure;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		String playerName;
		String phone;
		Integer choiceAns;
		Integer lifeLeft = 100;		
		Integer decider = 0;
		
		LifeFunction choice = new LifeFunction();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Hey...uh...whoops I already forgot your name, can you remind me?");
		playerName = scan.nextLine();
		System.out.println("Oh that's right, your name is " + playerName + "! Thanks for reminding me. So anyways, \n"
					+ "here is your new phone, The Nebula X10. It features a 5.5 inch display\n"
					+ "with a resolution of 3000x3000 pixelbits, 1 teramunch of on board storage and,\n"
					+ "a 32 superHertz processor. Needless to say, this is the best on the market. But\n"
					+ "there is one downfall, although it features a 10,000mah battery the incredible\n"
					+ "power of the processor drains it somewhat fast...Are you sure you still want it?");
			phone = scan.nextLine();
			phone = phone.toLowerCase();

		do{
			
			if(phone.matches("yes")){
				
				System.out.println("Your current battery life is: " + lifeLeft + "%\n\n"
						+ "What would you like to do with you new phone "+playerName+"?\n"
						+ "1 - Watch a Video online?\n"
						+ "2 - See what people are doing on social media?\n"
						+ "3 - Watch the news?\n"
						+ "4 - Read a book?\n"
						+ "5 - Play a game?\n"
						+ "6 - Charge it and do nothing.");
				decider = scan.nextInt();
				choiceAns = choice.life(decider);
				choiceAns += lifeLeft - decider;
				lifeLeft = choiceAns;
				if(lifeLeft > 100){System.out.println("Your battery is already fully charged, please try something else.");
				lifeLeft = 100;
				}else if(lifeLeft < 1){System.out.println("Your phone is dead.");}				
			}else if(phone.matches("no")){
				System.out.println("Well then leave with your flip phone NERD!");
				lifeLeft = 0;
				break;
			}else System.out.println("Invalid entry.");
			
		}while(lifeLeft > 0);
	}
}
