package multifunctionAdventure;
import java.util.Scanner;
public class Main 

{

	public static void main(String[] args) 
	
	{
		
		//General variables
		String playerName;
		String phone;
		
		//Phone function variables
		Integer powerLeft = 100;	
		Integer choice1;	
		Integer decider1 = 0;
		
		//Human function variables - post phone
		Integer playerLife = 65;
		Integer choice2;
		Integer decider2 = 0;		
		
		LifeFunction phonePower = new LifeFunction();
		HumanLife humanEnergy = new HumanLife();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Hey...uh...whoops I already forgot your name, can you remind me?");
		playerName = scan.nextLine();
		System.out.println(
				"Oh! That's right, your name is "
					+ playerName 
					+ "! Thanks for reminding me. So anyways, \n"
					+ "here is your new phone, The Nebula X10. It features a 5.5 inch display\n"
					+ "with a resolution of 3000x3000 pixelbits, 1 teramunch of on board storage and,\n"
					+ "a 32-core 5000 superHertz processor. Needless to say, this is the best on the\n"
					+ "market. But there is one downfall, although it features a 10,000mah battery the\n"
					+ "incredible power of the processor drains it somewhat fast...\n"
					+ "Are you sure you still want it "
					+ playerName +
					"?\n");
		
			phone = scan.nextLine();
			phone = phone.toLowerCase();

		do{
			if(phone.matches("yes")){
				if(powerLeft > 0){
					
				System.out.println(
					"\nYour current battery life is: " + powerLeft + "%\n\n"
					+"So " + playerName	+ ", what would you like to do with you new phone?\n"
					+ "1 - Watch a Video online?\n"
					+ "2 - See what people are doing on social media?\n"
					+ "3 - Watch the news?\n"
					+ "4 - Read a book?\n"
					+ "5 - Play a game?\n"
					+ "6 - Charge it and do nothing.\n" 
					+ "Please select a number.\n");
				
				decider1 = scan.nextInt();
				choice1 = phonePower.life(decider1);
				choice1 += powerLeft - decider1;
				powerLeft = choice1;
				
				}else if(powerLeft > 100){						
						System.out.println("Your battery is already fully charged, please try something else.");
					powerLeft = 100;
				}else if (powerLeft < 1){
					powerLeft = 0;					
				}if(powerLeft <= 0){
				 System.out.println(
					"Your phone is dead...\n"
					+ "But you're a human and you still have " + playerLife + "% of your energy remaining.\n"
					+ "So what will you do now?\n"
					+ "1 - Go home and charge your phone.\n"
					+ "2 - Go across the street and grab some food.\n"
					+ "3 - Walk a couple blocks away to the park.\n"
					+ "4 - Stop at the bar and have some drinks with your friends.");
					
				decider2 = scan.nextInt();
				choice2 = humanEnergy.lifePts(decider2);
				choice2 += playerLife - decider2;
				playerLife = choice2;				
				}else if(playerLife > 100){						
					System.out.println("You are now fully rested and you phone fully charged. You look at your phone and...\n");
					playerLife = 100;
					powerLeft = 100;
				}
			}
			else if(phone.matches("no")){		
				System.out.println("Well then leave with your flip phone NERD!");
				powerLeft = 0;
				break;
			}else{ System.out.println("Invalid entry.");
				break;}
			}while(playerLife > 0);
		
	
	}
}