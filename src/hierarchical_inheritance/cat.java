package hierarchical_inheritance;

public class cat extends Animal{

	public void sound()
	{
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		
		cat c= new cat();
		c.eats();
		c.drinks();
		c.sound();
		

	}

}
