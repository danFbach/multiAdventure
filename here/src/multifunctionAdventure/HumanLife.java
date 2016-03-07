package multifunctionAdventure;

public class HumanLife {

	Integer lifePts(Integer energyCounter){
		
		switch(energyCounter){
		case 1:
			energyCounter =- 10;
			System.out.println("choice 1");
			return energyCounter
			;
		case 2:
			energyCounter =- 20;
			System.out.println("choice 2");
			return energyCounter
			;
		case 3:
			energyCounter =- 30;
			System.out.println("choice 3");
			return energyCounter
			;		
		case 4:
			energyCounter =- 40;
			System.out.println("choice 4");
			return energyCounter
			;
		default:
			System.out.println("whatevs");
			return energyCounter
			;			
		}
	}
}
