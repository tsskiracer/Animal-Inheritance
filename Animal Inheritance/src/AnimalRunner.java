
public class AnimalRunner
	{
		public static void main(String[] args)
			{
				
				Sloth s= new Sloth();
				System.out.println("Sloth");
				Animal.eats();
				
				
				Triangle eT = new eTriangle(4,6);
				System.out.println("Equilateral Triangle");
				System.out.println("The area of this triangle is " + eT.findArea());
				System.out.println("The perimeter of this triangle is " + eT.findPerimeter());
				
				Trapezoid trap = new Trapezoid(4,6);
				System.out.println("Trapezoid");
				System.out.println("The area of this trapezoid is " + trap.findArea());
				System.out.println("The perimeter of this triangle is " + trap.findPerimeter());
						//need to determine how to find the perimeter of a trapezoid
				
				Rectangle r = new eTriangle(4,6);
				System.out.println("Right Triangle");
				System.out.println("The area of this triangle is " + r.findArea());
				System.out.println("The perimeter of this triangle is " + r.findPerimeter());
				
				
					
	
				
				
				
			}

	}
