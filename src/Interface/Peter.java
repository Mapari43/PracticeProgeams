package Interface;

public class Peter {
   
	public void ToGoToAirportByCar()
	{
		System.out.println("Peter will book a car to go to Airport");
		 car c=new car();
		 c.petrol();
		 c.ready();
	}
	
	public void FlyInAeroplane()
	{
		System.out.println("Now peter will take Aeroplane to America...");
		   Fuel f=new Aeroplane();
		   f.petrol();
		   f.ready();
	}
}
	

