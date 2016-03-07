package multifunctionAdventure;
import java.util.concurrent.TimeUnit;

public class LifeFunction {
	
	Integer	life(Integer lifeCalc)
	
	{
		switch(lifeCalc)
		
		{case 1:		//1 - VIDEO
			lifeCalc -= 20;
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("You watched a video about dolphins and in the process lost 20% battery life.");
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			
			return lifeCalc;
			
		case 2:			//2 - SOCIAL MEDIA
			lifeCalc -= 15;
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Self absorbed...\n");
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Self absorbed...\n");
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Self absorbed...\n");
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Funny picture!\n");
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Self absorbed...\n");			
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Self absorbed...\n");			
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Self absorbed...\n");			
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Funny Video!\n");			
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("well, that's social media for you, what were you expecting...\n"+"-15% Battery.\n");
			
			try {TimeUnit.SECONDS.sleep(4);
			}catch(InterruptedException ex) {}
			return lifeCalc;
			
		case 3:			//3 - NEWS
			lifeCalc -= 10;
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Politicians this, politicians that...\n\n");	
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("War here, war there...\n\n");			
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Be careful of this, be careful of that...\n\n");	
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Goodnight America!\n"+"-10% Battery\n");			
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			return lifeCalc;	
			
		case 4:			//4 - BOOK
			lifeCalc -= 5;
			
			System.out.println("Congratulations dude, you actually picked one of the few things\n"
					+ "you can do on your phone to enrich yourself. Go You.\n"+"-5% Battery\n");
			
			try {TimeUnit.SECONDS.sleep(4);
			}catch(InterruptedException ex) {}
			
			return lifeCalc;
			
		case 5:			//5 - GAME
			lifeCalc -= 35;
			
			System.out.println("Lets crush some crandy! or...Blow some stuff up! or...Spin the Slots!\n");	
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Lets Blow some stuff up!\n");		
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("BOOM!\n");			
			
			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("BAKEWW! BAKEWW!\n");		
			
			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("POW! POP POP POP!\n");		
			
			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("BEWWWWWWWW...");	
			
			try {TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException ex) {}	
			System.out.println("KAAAAAAAWOOOOOOOOOOSH!... *Player here's scream of a thousand dying men!*  \n");			
			
			try {TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException ex) {}
			System.out.println("All of your men have died.\n"+"-35% Battery.");	
			
			try {TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException ex) {}
			return lifeCalc;
			
		case 6:			//6 - CHARGE
			lifeCalc += 15;			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("\n... + 3%");
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("\n... + 6%");
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("\n... + 9%");	
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("\n... + 12%");	
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("\n... + 15%");	
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			return lifeCalc;
		case 7:			//switch to human mode.
			return lifeCalc;
		default:			//DEFAULT
			return lifeCalc;
			
		
		}	
	} 
}