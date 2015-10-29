import java.util.ArrayList;

public abstract class Animal
	{
		public abstract void bearsYoung();
		protected String name;
		protected String sound;
		protected String food;
		
		
		public void eats()
		{
			System.out.println("The " + name + " is looking forward to eating some " + food + ".");
		}
		public void makesSound()
			{
				System.out.println("The " + name + " says " + sound + ".");
			}
		
	}
