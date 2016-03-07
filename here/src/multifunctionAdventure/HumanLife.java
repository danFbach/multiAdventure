package multifunctionAdventure;

import java.util.concurrent.TimeUnit;

public class HumanLife {

	Integer lifePts(Integer energyCounter){
		
		switch(energyCounter){
		case 1:
			energyCounter += 25;
			System.out.println("You're on your way home now, charging your phone. You will be able to use your phone\n"
					+ "again soon. If you rest until you have 100% energy, your phone will also be recharged.");
			
			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("Zzzzz....");
			System.out.println("\n... + 5%");
			
			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("Zzzzz....");
			System.out.println("\n... + 10%");

			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("Zzzzz....");
			System.out.println("\n... + 15%");	

			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("Zzzzz....");
			System.out.println("\n... + 20%");	

			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("Zzzzz....");
			System.out.println("\n... + 25%");	
			
			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			return energyCounter
			;
		case 2:
			energyCounter -= 20;
			
			try {TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException ex) {}
			System.out.println("You walk a few blocks down Main St. and arrive at a nice little Pub and & grill type place.\n");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Munch, Munch.\n");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Munch, Munch.\n");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Munch, Munch.\n");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Aaahhh...the sweet satisfaction of a meal you didn't have to prepare.\n");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Eating was somewhat tiring as you ordered a 3/4lb burger.\n-20%\n");
			try {TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException ex) {}
			
			return energyCounter;
		case 3:
			energyCounter -= 30;
			
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Great! Let's go get some exercise..");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Jogging along... *WOOF! WOOF!*");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("Jogging along... You see a pretty lady...");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("You look over and attempt to make eye contact...");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("She looks back, gives you a little smile and wince and then...");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			System.out.println("BAM! You've trip over a bench and manage about half of a front flip\n"
					+ "before you get a face full of dirt. This foolish behavior will cost you dearly.\n"
					+ "-15% for the jog.\n"+"And an additional -10% for the fall.\n");
			try {TimeUnit.SECONDS.sleep(4);
			}catch(InterruptedException ex) {}
			
			return energyCounter;		
		case 4:
			energyCounter -= 25;

			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			
			System.out.println("At the pub a few blocks down the road you stop in to have a beer or two...\n"
					+ "well you ran into an old friend and...one, two...three, four...well that all\n"
					+ "you could remember when you told me the story.\n");
			try {TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException ex) {}
			
			return energyCounter;
		default:
			System.out.println("whatevs");
			return energyCounter;			
		}
	}
}
