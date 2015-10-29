import java.util.ArrayList;

public class AnimalRunner
	{
		public static void main(String[] args)
			{
				ArrayList<Animal> species = new ArrayList<Animal>();
				species.add(new Sloth());
				species.add(new Bat());
				species.add(new PeregrineFalcon());
				species.add(new Kiwi());
				species.add(new Wolf());
				
				for (Animal a: species)
					{
						a.eats();
						a.makesSound();
						a.bearsYoung();
					}
				
				
					
	
				
				
				
			}

	}