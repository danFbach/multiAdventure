package multifunctionAdventure;

public class LifeFunction {
		
		
	Integer	life(Integer lifeCalc)
	{
		switch(lifeCalc)
		
		{case 1:		//1 - VIDEO
			lifeCalc -= 20;
			System.out.println("You watched a video about dolphins and in the process lost 20% battery life.");
			return lifeCalc;
			
		case 2:			//2 - SOCIAL MEDIA
			lifeCalc -= 15;
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Self absorbed...\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Self absorbed...\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Self absorbed...\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Funny picture!\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Self absorbed...\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Self absorbed...\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Self absorbed...\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Funny Video!\n");
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("well, that's social media for you, what were you expecting...\n");
			try {
			    Thread.sleep(4000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();}
			return lifeCalc;
			
		case 3:			//3 - NEWS
			lifeCalc -= 10;
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Politicians this, politicians that...\n\n");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("War here, war there...\n\n");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Be careful of this, be careful of that...\n\n");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Goodnight America!");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();}
			return lifeCalc;	
			
		case 4:			//4 - BOOK
			lifeCalc -= 5;
			System.out.println("Congratulations dude, you actually picked on of the few things\n"
					+ "you can do on your phone to enrich yourself. Go You.");
			return lifeCalc;
			
		case 5:			//5 - GAME
			lifeCalc -= 35;
			System.out.println("Lets crush some crandy! or...Blow some stuff up! or...Spin the Slots!");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("Lets Blow some stuff up!");			
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("BOOM!");			
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("BAKEWW! BAKEWW!");			
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("POW! POP POP POP!");			
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("BEWWWWWWWW...KAWOOOOSH!...\n"+"All of your men have died.");			
			try {
			    Thread.sleep(1500);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}return lifeCalc;
			
		case 6:			//6 - CHARGE
			lifeCalc += 15;
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("\n... + 3%");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("\n... + 6%");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("\n... + 9%");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("\n... + 12%");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}System.out.println("\n... + 15%");
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}return lifeCalc;
			
		default:			//DEFAULT
			return lifeCalc;
			
		
		}	
	} 
}