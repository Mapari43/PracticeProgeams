package hierarchical_inheritance;

public class Dog extends Animal {

	public void sound()
	{
		System.out.println("Bow Bow");
	}
	
	public static void main(String[] args) {
	       
		Dog s = new Dog();
		s.eats();
		s.drinks();
		s.sound();

	}

}
