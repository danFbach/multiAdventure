package multifunctionAdventure;

public class LifeFunction {
		
		
	Integer	life(Integer lifeLeft)
	{
		switch(lifeLeft)
		{case 1:
			lifeLeft -= 25;
			return lifeLeft;
		case 2:
			lifeLeft += 25;
			return lifeLeft;
		default:
			return lifeLeft;
			
		
		}	
	} 
}